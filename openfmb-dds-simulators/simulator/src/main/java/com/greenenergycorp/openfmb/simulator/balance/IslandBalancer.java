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


import com.greenenergycorp.openfmb.simulator.DeviceId;
import com.greenenergycorp.openfmb.simulator.PropertyUtil;


import openfmb.rti.publisher.essmodule.ESSControlProfilePublisher;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;


import java.util.Properties;

public class IslandBalancer {

    private final static Logger logger = LoggerFactory.getLogger(IslandBalancer.class);

    public static void main(final String[] args) throws Exception {

        final String simConfigPath = System.getProperty("config.sim.path", "balancer.properties");

        final Properties simProps = PropertyUtil.optionallyLoad(simConfigPath, System.getProperties());

        final String logicalDeviceId = PropertyUtil.propOrThrow(simProps, "device.logicalDeviceID");
        final String mRid = PropertyUtil.propOrThrow(simProps, "device.mRID");
        final String name = PropertyUtil.propOrThrow(simProps, "device.name");
        final String description = PropertyUtil.propOrThrow(simProps, "device.description");

        final DeviceId deviceId = new DeviceId(logicalDeviceId, mRid, name, description);

        final String recloserLogicalDeviceId = PropertyUtil.propOrThrow(simProps, "recloser.logicalDeviceID");

        final String recloserEventTopic = PropertyUtil.propOrThrow(simProps, "topic.RecloserEventProfile");

        final String batteryReadTopic = PropertyUtil.propOrThrow(simProps, "topic.BatteryReadingProfile");
        final String resourceReadTopic = PropertyUtil.propOrThrow(simProps, "topic.ResourceReadingProfile");
        final String solarReadTopic = PropertyUtil.propOrThrow(simProps, "topic.SolarReadingProfile");

        final String batteryControlTopic = PropertyUtil.propOrThrow(simProps, "topic.BatteryControlProfile");
        
        final String QoSLibrary = PropertyUtil.propOrThrow(simProps, "qos.Library");
        final String batteryReadQoSProfile = PropertyUtil.propOrThrow(simProps, "qos.batteryReadingProfile");
        final String resourceReadQoSProfile = PropertyUtil.propOrThrow(simProps,"qos.resourceReadingProfile");
        final String solarReadQoSProfile = PropertyUtil.propOrThrow(simProps, "qos.solarReadingProfile");
        final String batteryControlQoSProfile = PropertyUtil.propOrThrow(simProps,"qos.batteryControlProfile");
        final String recloserEventQoSProfile = PropertyUtil.propOrThrow(simProps,"qos.recloserEventProfile");

        final int domainId = (int) PropertyUtil.propLongOrThrow(simProps, "domainId");
        
        ESSControlProfilePublisher publisher = new ESSControlProfilePublisher();
        publisher.initialize(domainId,  batteryControlTopic, QoSLibrary, batteryControlQoSProfile);
        
        final BatteryControlPublisher pub = new BatteryControlPublisher(publisher, deviceId);
        
        final BalancingMachine machine = new BalancingMachine(logicalDeviceId, pub);
        
        ESSReadingSubscriber subscriber1 = new ESSReadingSubscriber(machine, domainId, batteryReadTopic, QoSLibrary, batteryReadQoSProfile);
        
        SolarReadingSubscriber subscriber2 = new SolarReadingSubscriber(machine, domainId, solarReadTopic, QoSLibrary, solarReadQoSProfile);
 
        ResourceReadingSubscriber subscriber3 = new ResourceReadingSubscriber(machine, domainId, resourceReadTopic, QoSLibrary, resourceReadQoSProfile);

        RecloserEventSubscriber subscriber = new RecloserEventSubscriber(machine, logicalDeviceId, domainId, recloserEventTopic, QoSLibrary, recloserEventQoSProfile);
   
    }
}
