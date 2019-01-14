/**
 * Copyright 2016 Green Energy Corp.
 *
 * Licensed to Green Energy Corp (www.greenenergycorp.com) under one or more
 * contributor license agreements. See the NOTICE file distributed with this
 * work for additional information regarding copyright ownership. Green Energy
 * Corp licenses this file to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS, WITHOUT
 * WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the
 * License for the specific language governing permissions and limitations under
 * the License.
 */

/**
  * 2017 Real-Time Innovations, Inc.
  *
  * Modified to support RTI Connext 
  *
  */

package com.greenenergycorp.openfmb.simulator.balance;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.HashMap;
import java.util.Map;

public class BalancingMachine  {
    private final static Logger logger = LoggerFactory.getLogger(BalancingMachine.class);

    private final String sourceLogicalDeviceId;
    private final BatteryControlPublisher publisher;

    private boolean isClosed = true;
    private final Map<String, Double> batteries = new HashMap<String, Double>();
    private final Map<String, Double> loads = new HashMap<String, Double>();
    private final Map<String, Double> solars = new HashMap<String, Double>();

    private final Object mutex = new Object();

    public BalancingMachine(String sourceLogicalDeviceId, BatteryControlPublisher publisher) {
        this.sourceLogicalDeviceId = sourceLogicalDeviceId;
        this.publisher = publisher;
    }

    public void updateRecloserStatus(final boolean nextIsClosed) {
        synchronized (mutex) {
            if (isClosed && !nextIsClosed) {
                isClosed = false;
                try {
                    logger.info("Detected islanding...");

                    publisher.setPowerSetpoint(totalPower());
                    publisher.setIslanded();
                } catch (Throwable ex) {
                    logger.error("Could not respond to islanding: " + ex);
                }
            } else if (!isClosed && nextIsClosed) {
                isClosed = true;
                try {
                    logger.info("Detected closing...");
                    publisher.leaveIslanded();
                } catch (Throwable ex) {
                    logger.error("Could not respond to de-islanding: " + ex);
                }
            }
        }
    }

    public void updateBatteryPower(final String id, final double power) {
        synchronized (mutex) {
            if (!id.equals(sourceLogicalDeviceId)) {
                batteries.put(id, power);
                computeUpdate();
            }
        }
    }

    public void updateLoadPower(final String id, final double power) {
        synchronized (mutex) {
            loads.put(id, power);
            computeUpdate();
        }
    }

    public void updateSolarPower(final String id, final double power) {
        synchronized (mutex) {
            solars.put(id, power);
            computeUpdate();
        }
    }

    private double totalPower() {
        double total = 0.0;
        for (final Double v : loads.values()) {
            total += v;
        }
        for (final Double v : batteries.values()) {
            total += v;
        }
        for (final Double v : solars.values()) {
            total += v;
        }
        return total;
    }


    private void computeUpdate() {
        try {
            if (!isClosed) {
                final double power = totalPower();
                publisher.setPowerSetpoint(-1 * power);
            }
        } catch (Exception ex) {
            logger.warn("Could not publish update: " + ex);
        }
    }
}
