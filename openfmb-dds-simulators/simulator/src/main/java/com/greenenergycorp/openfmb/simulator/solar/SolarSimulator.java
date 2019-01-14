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

package com.greenenergycorp.openfmb.simulator.solar;


import com.greenenergycorp.openfmb.simulator.DailyInterpolatedData;
import com.greenenergycorp.openfmb.simulator.DeviceId;
import com.greenenergycorp.openfmb.simulator.LineValueDataLoader;
import com.greenenergycorp.openfmb.simulator.PropertyUtil;



import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.Calendar;
import java.util.Properties;
import java.util.Random;

import com.rti.dds.infrastructure.*;

import OpenFMB_Information_Model.openfmb.commonmodule.DateTimeInterval;
import OpenFMB_Information_Model.openfmb.commonmodule.HexBinary16;
import OpenFMB_Information_Model.openfmb.commonmodule.SolarEventKind;
import OpenFMB_Information_Model.openfmb.commonmodule.SolarInverter;
import OpenFMB_Information_Model.openfmb.commonmodule.SolarInverterEvent;
import OpenFMB_Information_Model.openfmb.commonmodule.SolarReading;
import OpenFMB_Information_Model.openfmb.commonmodule.SolarReadingTypeKind;
import OpenFMB_Information_Model.openfmb.solarmodule.SolarEventProfile;
import OpenFMB_Information_Model.openfmb.solarmodule.SolarReadingProfile;
import openfmb.rti.publisher.solarmodule.SolarEventProfilePublisher;
import openfmb.rti.publisher.solarmodule.SolarReadingProfilePublisher;

public class SolarSimulator {
	
	static String logicalDeviceId = null;
    static String mRid = null;
    static String name = null;
    static String description = null;

    private final static Logger logger = LoggerFactory.getLogger(SolarSimulator.class);

    public static void main(String[] args) throws Exception {

        final String simConfigPath = System.getProperty("config.sim.path", "solarsim.properties");

        final Properties simProps = PropertyUtil.optionallyLoad(simConfigPath, System.getProperties());
        
        logicalDeviceId = PropertyUtil.propOrThrow(simProps, "device.logicalDeviceID");
        mRid = PropertyUtil.propOrThrow(simProps, "device.mRID");
        name = PropertyUtil.propOrThrow(simProps, "device.name");
        description = PropertyUtil.propOrThrow(simProps, "device.description");

        final double scale = PropertyUtil.propDoubleOrThrow(simProps, "value.scale");
        final double offset = PropertyUtil.propDoubleOrThrow(simProps, "value.offset");
        final double jitterChance = PropertyUtil.propDoubleOrThrow(simProps, "value.jitterChance");
        final double jitterPercent = PropertyUtil.propDoubleOrThrow(simProps, "value.jitterPercent");

        final long intervalMs = PropertyUtil.propLongOrThrow(simProps, "config.intervalMs");

        final String solarReadTopic = PropertyUtil.propOrThrow(simProps, "topic.SolarReadingProfile");
        final String solarEventTopic = PropertyUtil.propOrThrow(simProps,"topic.SolarEventProfile");

        final String QoSLibrary = PropertyUtil.propOrThrow(simProps, "qos.Library");
        final String solarReadQoSProfile = PropertyUtil.propOrThrow(simProps, "qos.solarReadingProfile");
        final String solarEventQoSProfile = PropertyUtil.propOrThrow(simProps,"qos.solarEventProfile");

        final String dataFilename = PropertyUtil.propOrThrow(simProps, "data.file");
        
        final int domainId = (int) PropertyUtil.propLongOrThrow(simProps, "domainId");

        final DeviceId deviceId = new DeviceId(logicalDeviceId, mRid, name, description);

        final double[] dayData = LineValueDataLoader.load(dataFilename);

        final DailyInterpolatedData dataSource = new DailyInterpolatedData(dayData);
        
        SolarReadingProfilePublisher readingPublisher = new SolarReadingProfilePublisher();
        readingPublisher.initialize(domainId,  solarReadTopic, QoSLibrary, solarReadQoSProfile);

        SolarEventProfilePublisher eventPublisher = new SolarEventProfilePublisher();
        eventPublisher.initialize(domainId,  solarEventTopic, QoSLibrary, solarEventQoSProfile);

        loop(readingPublisher, eventPublisher, dataSource, intervalMs, deviceId, scale, offset, jitterChance, jitterPercent);
        
    }

    private static void loop(
            final SolarReadingProfilePublisher readingPublisher,
            final SolarEventProfilePublisher eventPublisher,
            final DailyInterpolatedData dataSource,
            final long intervalMs,
            final DeviceId deviceId,
            final double scale,
            final double offset,
            final double jitterChance,
            final double jitterPercent) throws InterruptedException {

        final Random random = new Random(System.currentTimeMillis());

        while (true) {
            final long now = System.currentTimeMillis();

            try {
            	SolarInverter inverter = new SolarInverter();
            	inverter.mRID = mRid;
            	inverter.name = name;
            	inverter.description = description;
            	
            	SolarReadingProfile reading = new SolarReadingProfile();
            	reading.logicalDeviceID = logicalDeviceId;
            	reading.timestamp = Calendar.getInstance().getTimeInMillis();
            	reading.solarInverter = inverter;
            	
            	DateTimeInterval t = new DateTimeInterval();
        		t.start = Calendar.getInstance().getTimeInMillis();
            	
                final double inputValue = dataSource.atTime(now);
                final double scaledValue = -1 * inputValue * scale + offset;

                final double jitteredValue;
                if (random.nextDouble() <= jitterChance) {
                    final double jitterRange = jitterPercent * scaledValue;
                    jitteredValue = scaledValue + ((jitterRange * random.nextDouble()) - (jitterRange / 2));
                } else {
                    jitteredValue = scaledValue;
                }
                
                SolarReading element = new SolarReading();
                element.value = (float) jitteredValue;
                element.type = SolarReadingTypeKind.SolarReadingTypeKind_kW;
        		HexBinary16 flag = new HexBinary16();
        		flag.userData[0] = 0;
        		flag.userData[1] = 0;
        		element.qualityFlag = flag;
                element.timePeriod = t;
            	
        		reading.solarReadingList.solarReading.add(element);
        		
        		readingPublisher.publish(reading);
        		
        		SolarEventProfile event = new SolarEventProfile();
        		
        		event.logicalDeviceID = reading.logicalDeviceID = logicalDeviceId;
        		
        		event.solarInverter = inverter;
        		
        		SolarInverterEvent inverterEvent = new SolarInverterEvent();
        		inverterEvent.isConnected = true;
        		inverterEvent.type = SolarEventKind.SolarEventKind_generatingAndConnected;
        		inverterEvent.qualityFlag = flag;
        		inverterEvent.timestamp = Calendar.getInstance().getTimeInMillis();
        		inverterEvent.typeExtension = "";
        		
        		event.solarInverterEvent = inverterEvent;
        		
        		eventPublisher.publish(event);
        		
            } catch (Exception ex) {
                logger.error("Error publishing data: " + ex);
            }
            Thread.sleep(intervalMs);
        }

    }
}
