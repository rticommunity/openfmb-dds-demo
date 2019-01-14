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

package com.greenenergycorp.openfmb.simulator.battery;



import openfmb.rti.publisher.essmodule.ESSEventProfilePublisher;
import openfmb.rti.publisher.essmodule.ESSReadingProfilePublisher;
import openfmb.rti.publisher.solarmodule.SolarEventProfilePublisher;
import openfmb.rti.publisher.solarmodule.SolarReadingProfilePublisher;
import openfmb.rti.subscriber.essmodule.ESSControlProfileSubscriber;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.greenenergycorp.openfmb.simulator.DeviceId;
import com.greenenergycorp.openfmb.simulator.PropertyUtil;

import java.util.HashMap;
import java.util.Map;
import java.util.Properties;

public class BatterySimulator {

    private final static Logger logger = LoggerFactory.getLogger(BatterySimulator.class);

    public static void main(String[] args) throws Exception {

        final String simConfigPath = System.getProperty("config.sim.path", "batterysim.properties");

        final Properties simProps = PropertyUtil.optionallyLoad(simConfigPath, System.getProperties());

        final String logicalDeviceId = PropertyUtil.propOrThrow(simProps, "device.logicalDeviceID");
        final String mRid = PropertyUtil.propOrThrow(simProps, "device.mRID");
        final String name = PropertyUtil.propOrThrow(simProps, "device.name");
        final String description = PropertyUtil.propOrThrow(simProps, "device.description");

        final DeviceId deviceId = new DeviceId(logicalDeviceId, mRid, name, description);

        final String batteryReadTopic = PropertyUtil.propOrThrow(simProps, "topic.BatteryReadingProfile");
        final String batteryEventTopic = PropertyUtil.propOrThrow(simProps, "topic.BatteryEventProfile");
        final String batteryControlTopic = PropertyUtil.propOrThrow(simProps, "topic.BatteryControlProfile");

        final double batteryMaxChargeRatekW = PropertyUtil.propDoubleOrThrow(simProps, "battery.maxChargeRatekW");
        final double batteryMaxDischargeRatekW = PropertyUtil.propDoubleOrThrow(simProps, "battery.maxDischargeRatekW");
        final double batteryEnergyRatingkWh = PropertyUtil.propDoubleOrThrow(simProps, "battery.energyRatingkWh");
        final double batteryEnergyMaxkWh = PropertyUtil.propDoubleOrThrow(simProps, "battery.energyMaxkWh");
        final double batteryEnergyMinkWh = PropertyUtil.propDoubleOrThrow(simProps, "battery.energyMinkWh");
        final double batteryEfficiencyRatio = PropertyUtil.propDoubleOrThrow(simProps, "battery.efficiencyRatio");
        final double batteryVoltage = PropertyUtil.propDoubleOrThrow(simProps, "battery.voltage");
        final double batteryHertz = PropertyUtil.propDoubleOrThrow(simProps, "battery.hertz");

        final long intervalMs = PropertyUtil.propLongOrThrow(simProps, "config.intervalMs");

        final String QoSLibrary = PropertyUtil.propOrThrow(simProps, "qos.Library");
        final String batteryReadQoSProfile = PropertyUtil.propOrThrow(simProps, "qos.batteryReadingProfile");
        final String batteryEventQoSProfile = PropertyUtil.propOrThrow(simProps,"qos.batteryEventProfile");
        final String batteryControlQoSProfile = PropertyUtil.propOrThrow(simProps,"qos.batteryControlProfile");

        final int domainId = (int) PropertyUtil.propLongOrThrow(simProps, "domainId");

        
        final BatteryMachine.BatterySpec batterySpec = new BatteryMachine.BatterySpec(
                batteryMaxChargeRatekW,
                batteryMaxDischargeRatekW,
                batteryEnergyRatingkWh,
                batteryEnergyMaxkWh,
                batteryEnergyMinkWh,
                batteryEfficiencyRatio,
                batteryVoltage,
                batteryHertz);
        
        ESSReadingProfilePublisher readingPublisher = new ESSReadingProfilePublisher();
        readingPublisher.initialize(domainId,  batteryReadTopic, QoSLibrary, batteryReadQoSProfile);

        ESSEventProfilePublisher eventPublisher = new ESSEventProfilePublisher();
        eventPublisher.initialize(domainId,  batteryEventTopic, QoSLibrary, batteryEventQoSProfile);
        
        final BatteryMachine batteryMachine = new BatteryMachine(eventPublisher, readingPublisher, deviceId, intervalMs, batterySpec);

        ESSControlSubscriber subscriber = new ESSControlSubscriber(batteryMachine, domainId, batteryControlTopic, QoSLibrary, batteryControlQoSProfile);
        
        batteryMachine.run();

    }
}
