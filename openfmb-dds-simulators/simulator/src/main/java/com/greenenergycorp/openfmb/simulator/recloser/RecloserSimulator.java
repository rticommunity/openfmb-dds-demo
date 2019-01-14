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


import com.greenenergycorp.openfmb.simulator.DeviceId;
import com.greenenergycorp.openfmb.simulator.PropertyUtil;



import openfmb.rti.publisher.reclosermodule.RecloserEventProfilePublisher;
import openfmb.rti.publisher.reclosermodule.RecloserReadingProfilePublisher;
import openfmb.rti.subscriber.essmodule.ESSReadingProfileSubscriber;
import openfmb.rti.subscriber.reclosermodule.RecloserControlProfileSubscriber;

import openfmb.rti.subscriber.resourcemodule.ResourceReadingProfileSubscriber;
import openfmb.rti.subscriber.solarmodule.SolarReadingProfileSubscriber;

import java.util.Properties;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;


public class RecloserSimulator {

    private final static Logger logger = LoggerFactory.getLogger(RecloserSimulator.class);

    public static void main(final String[] args) throws Exception {
    	
    	final String simConfigPath = System.getProperty("config.sim.path", "reclosersim.properties");

        final Properties simProps = PropertyUtil.optionallyLoad(simConfigPath, System.getProperties());

        final String logicalDeviceId = PropertyUtil.propOrThrow(simProps, "device.logicalDeviceID");
        final String mRid = PropertyUtil.propOrThrow(simProps, "device.mRID");
        final String name = PropertyUtil.propOrThrow(simProps, "device.name");
        final String description = PropertyUtil.propOrThrow(simProps, "device.description");

        final DeviceId deviceId = new DeviceId(logicalDeviceId, mRid, name, description);

        final String recloserEventTopic = PropertyUtil.propOrThrow(simProps, "topic.RecloserEventProfile");
        final String recloserReadTopic = PropertyUtil.propOrThrow(simProps, "topic.RecloserReadingProfile");
        final String recloserControlTopic = PropertyUtil.propOrThrow(simProps, "topic.RecloserControlProfile");

        final String batteryReadTopic = PropertyUtil.propOrThrow(simProps, "topic.BatteryReadingProfile");
        final String resourceReadTopic = PropertyUtil.propOrThrow(simProps, "topic.ResourceReadingProfile");
        final String solarReadTopic = PropertyUtil.propOrThrow(simProps, "topic.SolarReadingProfile");

        final double voltage = PropertyUtil.propDoubleOrThrow(simProps, "recloser.voltage");
        final double hertz = PropertyUtil.propDoubleOrThrow(simProps, "recloser.hertz");

        final long intervalMs = PropertyUtil.propLongOrThrow(simProps, "config.intervalMs");

        final String QoSLibrary = PropertyUtil.propOrThrow(simProps, "qos.Library");
        final String recloserEventQoSProfile = PropertyUtil.propOrThrow(simProps, "qos.recloserEventProfile");
        final String recloserReadQoSProfile = PropertyUtil.propOrThrow(simProps,"qos.recloserReadingProfile");
        final String batteryReadQoSProfile = PropertyUtil.propOrThrow(simProps, "qos.batteryReadingProfile");
        final String resourceReadQoSProfile = PropertyUtil.propOrThrow(simProps,"qos.resourceReadingProfile");
        final String recloserControlQoSProfile = PropertyUtil.propOrThrow(simProps,"qos.recloserControlProfile");
        final String solarReadQoSProfile = PropertyUtil.propOrThrow(simProps, "qos.solarReadingProfile");

        final int domainId = (int) PropertyUtil.propLongOrThrow(simProps, "domainId");
                
        RecloserReadingProfilePublisher publisher1 = new RecloserReadingProfilePublisher();
        publisher1.initialize(domainId,  recloserReadTopic, QoSLibrary, recloserReadQoSProfile);
        
        RecloserEventProfilePublisher publisher2 = new RecloserEventProfilePublisher();
        publisher2.initialize(domainId,  recloserEventTopic, QoSLibrary, recloserEventQoSProfile);
        
        RecloserPublisher pub = new RecloserPublisher(publisher1, publisher2, deviceId);
        
        final RecloserMachine machine = new RecloserMachine(pub, voltage, hertz, 0.0);
        
        ESSReadingSubscriber subscriber1 = new ESSReadingSubscriber(machine, domainId, batteryReadTopic, QoSLibrary, batteryReadQoSProfile);
        
        SolarReadingSubscriber subscriber2 = new SolarReadingSubscriber(machine, domainId, solarReadTopic, QoSLibrary, solarReadQoSProfile);
 
        ResourceReadingSubscriber subscriber3 = new ResourceReadingSubscriber(machine, domainId, resourceReadTopic, QoSLibrary, resourceReadQoSProfile);

        RecloserControlSubscriber subscriber4 = new RecloserControlSubscriber(machine, logicalDeviceId, domainId, recloserControlTopic, QoSLibrary, recloserControlQoSProfile);
        while (true) {
            machine.push();
            Thread.sleep(intervalMs);
        }
    }
}
