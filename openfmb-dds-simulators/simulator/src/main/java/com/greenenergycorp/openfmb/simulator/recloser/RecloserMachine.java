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

package com.greenenergycorp.openfmb.simulator.recloser;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.HashMap;
import java.util.Map;
import java.util.Random;

public class RecloserMachine implements SystemPowerObserver {

    private final static Logger logger = LoggerFactory.getLogger(RecloserMachine.class);

    

    private final double voltage;
    private final double frequency;
    private final double kvars;
    private final RecloserPublisher publisher;

    private boolean isClosed = true;
    private final Map<String, Double> batteries = new HashMap<String, Double>();
    private final Map<String, Double> loads = new HashMap<String, Double>();
    private final Map<String, Double> solars = new HashMap<String, Double>();

    private final Object mutex = new Object();

    private final Random random = new Random();

    public RecloserMachine(RecloserPublisher pub, double voltage, double frequency, double kvars) {
        this.voltage = voltage;
        this.frequency = frequency;
        this.kvars = kvars;
        this.publisher = pub;
    }

    public void push() {
        synchronized (mutex) {
            computeUpdate();
        }
    }

    public void handleOpen() {
        synchronized (mutex) {
            if (isClosed) {
                isClosed = false;
                computeUpdate();
            }
        }
    }

    public void handleClose() {
        synchronized (mutex) {
            if (!isClosed) {
                isClosed = true;
                computeUpdate();
            }
        }
    }

    public void updateBatteryPower(final String id, final double power) {
        synchronized (mutex) {
            batteries.put(id, power);
            computeUpdate();
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

    private void computeUpdate() {
        try {
            final double freq = frequency + ((random.nextDouble() * 0.001 * frequency) - (frequency * 0.001 / 2));
            final double volts = voltage + ((random.nextDouble() * 0.001 * voltage) - (voltage * 0.001 / 2));

            if (isClosed) {
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

                publisher.recloserReadUpdate(total, volts, freq, 0.0);
                publisher.recloserEventUpdate(isClosed, false);
            } else {
                publisher.recloserReadUpdate(0.0, volts, freq, 0.0);
                publisher.recloserEventUpdate(isClosed, false);
            }
        } catch (Exception ex) {
            logger.warn("Could not publish recloser update: " + ex);
        }
    }
}
