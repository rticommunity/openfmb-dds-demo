/*
 * Licensed to Duke Energy Corporation (www.duke-energy.com) under one or more
 * contributor license agreements. See the NOTICE file distributed with this
 * work for additional information regarding copyright ownership. Duke Energy
 * Corporation licenses this file to you under the Apache License, Version 2.0 (the
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

package com.dukeenergy.eto.openfmb;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Properties;
import java.util.Random;

import org.apache.log4j.PropertyConfigurator;
import org.jasypt.encryption.pbe.StandardPBEStringEncryptor;
import org.jasypt.properties.EncryptableProperties;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;


import OpenFMB_Information_Model.openfmb.commonmodule.DateTimeInterval;
import OpenFMB_Information_Model.openfmb.commonmodule.HexBinary16;
import OpenFMB_Information_Model.openfmb.commonmodule.PowerSystemResource;
import OpenFMB_Information_Model.openfmb.commonmodule.Reading;
import OpenFMB_Information_Model.openfmb.commonmodule.ResourceReading;
import OpenFMB_Information_Model.openfmb.commonmodule.ResourceReadingTypeKind;
import OpenFMB_Information_Model.openfmb.resourcemodule.ResourceReadingProfile;
import OpenFMB_Information_Model.openfmb.resourcemodule.ResourceReadingProfileDataWriter;

import openfmb.rti.publisher.loadmodule.LoadReadingProfilePublisher;
import openfmb.rti.publisher.resourcemodule.ResourceReadingProfilePublisher; 

/**
 * This Load Publisher class simulates a 24 hour commercial load. The scenario is
 * one of a factory that runs 2 full shifts 7AM until midnight and then a third
 * maintenance shift from midnight until 7AM. KW values are published at a defined
 * rate via the MQTT publisher on port 1883. The output can be monitored via the
 * Mosquitto_sub subscriber or via Wireshark.
 * 
 * LoadPublisher extends the abstract class AbsResourceReadingProfileMqttPublisher.
 * 
 * There are 2 configuration files used to drive the simulation:
 * LoadPublisher.log4j.properties defines the logging mechanism.
 * LoadPublisher.properties defines the broker location, the publish rate,
 * and other MQTT parameters.
 * 
 * The simulator uses real time to build and index into a 24 hour table. The current
 * hour and the next hour KW values are obtained, linear interpolation is performed
 * between the 2 values, and a random jitter is applied. The purpose is to provide
 * a reasonable 150 kW peak load curve for a simulated factory.
 * 
 * @author David Lawrence and Dwayne Bradley
 */
public class LoadPublisher {

	private static int [] LoadTable = {25,30,25,30,20,15,10,50,120,130,140,145,150,135,130,140,150,135,125,120,90,85,95,45};

	/**
	 * The retrieveResourceReadingProfile populates the ResourceReadingProfile
	 * data structure. It consists of reading, reading type, meter, and power
	 * system resource.
	 */
	static final int DEFAULT_PUBLISH_RATE = 60;
	static final int DEFAULT_DOMAIN_ID    = 0;
	static final String DEFAULT_TOPIC = "openfmb/resourcemodule/ResourceReadingProfile";
	
    protected static int domainId = 0;
    protected static int PublishRate = -1;
    protected static boolean shutDown = false;
    static String topicName = null;
    static String qosLibrary = null;
    static String qosProfile = null;
    
    private static Logger logger = null;

	//@Override
	public static ResourceReadingProfile retrieveResourceReadingProfile() {

		
		ResourceReadingProfile instance = new ResourceReadingProfile();
		
		
		// Reading Type is KW 3-phase]
		ResourceReading	type = new ResourceReading();
		type.type = ResourceReadingTypeKind.ResourceReadingTypeKind_kW;
		
		DateTimeInterval t = new DateTimeInterval();
		t.start = Calendar.getInstance().getTimeInMillis();
		type.timePeriod= t;
		
		HexBinary16 flag = new HexBinary16();
		flag.userData[0] = 0;
		flag.userData[1] = 0;
		
		type.qualityFlag = flag;
       		
		// Index into LoadTable with hour index and interpolate between the values
		Calendar cal = GregorianCalendar.getInstance();	// Use hours as LoadTable index and minutes for interpolation
		int hourOfDay = cal.get(Calendar.HOUR_OF_DAY);
		int minute = cal.get(Calendar.MINUTE);
		int nexthour = (hourOfDay +1) % 24;
		float kw = LoadTable[hourOfDay];
		kw = kw + Math.abs(LoadTable[nexthour] - LoadTable[hourOfDay]) * (float)minute / 60f;
				
		// Add jitter to the KW value +/- 1.00
		Random rn = new Random();
		float kwVARIANCE = 1.0f;
		kw = kw + (float)rn.nextGaussian() * kwVARIANCE;
		type.value = kw;
		
		instance.resourceReadingList.resourceReading.add(type);
		instance.resourceReadingList.resourceReading.setMaximum(1);
				
		// Finish up the Meter reading profile
		instance.logicalDeviceID = "DEMO.MGRID.RESOURCE.1";
				
		// Load up the Meter and the Power System Resource
		instance.meter.name = "Load1";
		instance.meter.description = "Load 1";
		instance.meter.mRID = "DEMO.MGRID.RESOURCE.1";

        PowerSystemResource resource = new PowerSystemResource();
        resource.description = "Load1";
        resource.mRID = "DEMO.MGRID.RESOURCE.1";
        resource.name = "Load1";
        
        instance.meter.powerSystemResource = resource;
		
		instance.timestamp = t.start;
				
		return instance;
						
	}
		
/**
 * main is the main entry point into the application. LoadPublisher builds the
 * ResourceReadingProfile with Load values and publishes the packet in XML.
 */
	public static void main(String[] args) {
		// Create an instance of LoadPublisher and run it
		
		logger = LoggerFactory.getLogger(LoadPublisher.class.getSimpleName());
		
		// Load the properties for the log4j loggers. 
	    PropertyConfigurator.configure(LoadPublisher.class.getSimpleName() + ".log4j.properties");
	    

        final String simConfigPath = System.getProperty("config.sim.path", "loadsim.properties");
       final Properties prop = new Properties(System.getProperties());
        try {
			prop.load(new FileInputStream(simConfigPath));
		} catch (FileNotFoundException e1) {
			logger.info("Properties file not found");
		} catch (IOException e1) {
			logger.info("Properties file I/O exception ");
			e1.printStackTrace();
		}
 
		try
		{
			try
			{
				PublishRate = Integer.parseInt(prop.getProperty("PublishRate"));
				if (PublishRate < 0)
				{
					logger.info("PublishRate must be greater than 0 seconds. Defaulting to " + DEFAULT_PUBLISH_RATE + " seconds...");
					PublishRate = DEFAULT_PUBLISH_RATE;
				}
			}
			catch (NumberFormatException e)
			{
				logger.info("PublishRate is not a valid integer value. Defaulting to " + DEFAULT_PUBLISH_RATE + " seconds...");
				PublishRate = DEFAULT_PUBLISH_RATE;
			}
			try
			{
				domainId = Integer.parseInt(prop.getProperty("DomainId"));
				if (domainId < 0)
				{
					logger.info("Domain Id must be greater than 0 seconds. Defaulting to " + DEFAULT_DOMAIN_ID);
					domainId = DEFAULT_DOMAIN_ID;
				}
			}
			catch (NumberFormatException e)
			{
				logger.info("DomainId is not a valid integer value. Defaulting to " + DEFAULT_DOMAIN_ID);
				domainId = DEFAULT_DOMAIN_ID;
			}
			topicName = prop.getProperty("Topic");
			if (topicName == null)
			{
				logger.info("Topic name not found. Defaulting to " + DEFAULT_TOPIC);
				topicName = DEFAULT_TOPIC;
			}
			qosLibrary = prop.getProperty("Qos.Library");
			if (qosLibrary == null)
			{
				logger.info("QoS Library name not found. Defaulting to BuiltinQosLib");
				qosLibrary = "BuiltinQosLib";
			}
			qosProfile = prop.getProperty("Qos.Profile");
			if (qosProfile == null)
			{
				logger.info("QoS profile name not found. Defaulting to Generic.Common");
				qosProfile = "Generic.Common";
			}
		}
		catch (Exception e)
		{
			logger.error(e.toString());
			return;
		}
		ResourceReadingProfilePublisher loadPublisher = new ResourceReadingProfilePublisher();
        loadPublisher.initialize(domainId,  topicName, qosLibrary, qosProfile);
		//LoadPublisher load = new LoadPublisher();
		

		while (!shutDown)
		{
	        
			ResourceReadingProfile instance = retrieveResourceReadingProfile();
			
			if (instance == null)
			{
				logger.info("Could not retrieve ResourceReadingProfile data. Skipping...");
			}
			else
			{
				// Publish the message


				
				logger.debug("Writing ResourceReadingProfile");

                /* Modify the instance to be written here */

                /* Write data */
				loadPublisher.publish(instance);
                
              
			}
			// Sleep for mqttPublishRate seconds and try to reconnect
			try
			{
				logger.debug("Sleeping for " + PublishRate + " seconds before publishing next value...");
				Thread.sleep(PublishRate * 1000);
			}
			catch (Exception e)
			{
				logger.error("Sleep interrupted while waiting to publish next value. Shutting down...", e);
				shutDown = true;
				return;
			}
		}
	}


}
