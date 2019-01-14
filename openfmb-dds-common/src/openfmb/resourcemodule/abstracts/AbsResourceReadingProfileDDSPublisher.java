/**
 * Copyright 2016 Duke Energy.
 *
 * Licensed to Duke Energy (www.duke-energy.com) under one or more
 * contributor license agreements. See the NOTICE file distributed with this
 * work for additional information regarding copyright ownership. Duke Energy
 * licenses this file to you under the Apache License, Version 2.0 (the
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

package openfmb.resourcemodule.abstracts;

import java.io.FileInputStream;
import java.io.IOException;
import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.Arrays;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.jasypt.encryption.pbe.StandardPBEStringEncryptor;
import org.jasypt.properties.EncryptableProperties;

import com.rti.dds.domain.*;
import com.rti.dds.infrastructure.*;
import com.rti.dds.publication.*;
import com.rti.dds.topic.*;
import com.rti.ndds.config.*;

import OpenFMB_Information_Model.openfmb.resourcemodule.*;


public abstract class AbsResourceReadingProfileDDSPublisher 
{
	
	static final int DEFAULT_PUBLISH_RATE = 60;
	
    protected DomainParticipant participant = null;
    protected Publisher publisher = null;
    protected Topic topic = null;
    protected ResourceReadingProfileDataWriter writer = null;
    protected int domainId = 0;
    protected boolean shutDown = false;
    protected Logger logger = null;
	
	private boolean initialized = false;
	
	protected int PublishRate = -1;
	
	protected ResourceReadingProfile instance = null;

    protected InstanceHandle_t instance_handle = InstanceHandle_t.HANDLE_NIL;

    
    public AbsResourceReadingProfileDDSPublisher() {
    	super();
    }
    
    public void initialize() {
    	
		this.initializeLogger();
			
		initialized = true;
		
		StandardPBEStringEncryptor encryptor = new StandardPBEStringEncryptor();
		encryptor.setAlgorithm("PBEWithMD5AndDES");
		String encryptionKey = System.getenv("OPENFMB_PROPERTY_ENCRYPTION_KEY");
		if (encryptionKey == null)
		{
			encryptor.setPassword(this.getClass().getSimpleName());
		}
		else
		{
			encryptor.setPassword(encryptionKey);
		}
		
        EncryptableProperties prop = new EncryptableProperties(encryptor);
		
		try
		{
			logger.debug("Loading application startup properties...");
			prop.load(new FileInputStream(this.getClass().getSimpleName() + ".properties"));
		}
		catch (IOException e)
		{
			logger.fatal("Could not load application properties. Shutting down.", e);
			return;
		}
		catch (Exception e)
		{
			logger.fatal("Invalid property value. Shutting down.", e);
			return;
		}
		
		loadAppConfigProperties(prop);
    	
        // --- Create participant --- //

        /* To customize participant QoS, use
        the configuration file
        USER_QOS_PROFILES.xml */

        participant = DomainParticipantFactory.TheParticipantFactory.
        create_participant(
            domainId, DomainParticipantFactory.PARTICIPANT_QOS_DEFAULT,
            null /* listener */, StatusKind.STATUS_MASK_NONE);
        if (participant == null) {
            System.err.println("create_participant error\n");
            return;
        }

        // --- Create publisher --- //

        /* To customize publisher QoS, use
        the configuration file USER_QOS_PROFILES.xml */

        publisher = participant.create_publisher(
            DomainParticipant.PUBLISHER_QOS_DEFAULT, null /* listener */,
            StatusKind.STATUS_MASK_NONE);
        if (publisher == null) {
            System.err.println("create_publisher error\n");
            return;
        }

        // --- Create topic --- //

        /* Register type before creating topic */
        String typeName = ResourceReadingProfileTypeSupport.get_type_name();
        ResourceReadingProfileTypeSupport.register_type(participant, typeName);

        /* To customize topic QoS, use
        the configuration file USER_QOS_PROFILES.xml */

        topic = participant.create_topic(
            "openfmb/resourcemodule/ResourceReadingProfile",
            typeName, DomainParticipant.TOPIC_QOS_DEFAULT,
            null /* listener */, StatusKind.STATUS_MASK_NONE);
        if (topic == null) {
            System.err.println("create_topic error\n");
            return;
        }

        // --- Create writer --- //

        /* To customize data writer QoS, use
        the configuration file USER_QOS_PROFILES.xml */

        writer = (ResourceReadingProfileDataWriter)
        publisher.create_datawriter(
            topic, Publisher.DATAWRITER_QOS_DEFAULT,
            null /* listener */, StatusKind.STATUS_MASK_NONE);
        if (writer == null) {
            System.err.println("create_datawriter error\n");
            return;
        }

        // --- Write --- //

        /* Create data sample for writing */
        ResourceReadingProfile instance = new ResourceReadingProfile();

        /* InstanceHandle_t instance_handle = InstanceHandle_t.HANDLE_NIL;
        For a data type that has a key, if the same instance is going to be
        written multiple times, initialize the key here
        and register the keyed instance prior to writing */
        //instance_handle = writer.register_instance(instance);

        
    }

	public boolean isInitialized()
	{
		return this.initialized;
	}

	
	protected boolean loadAppConfigProperties(EncryptableProperties prop)
	{
		try
		{


			
			try
			{
				PublishRate = Integer.parseInt(prop.getProperty("mqttPublishRate"));
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
			
		}
		catch (Exception e)
		{
			logger.error(e);
			return false;
		}
		
		return true;
	}
    
    
	/**
	 * This method should be called first so the log4j logger can be created.
	 */
	protected void initializeLogger()
	{
		// Initial the logger objects.
		logger = Logger.getLogger(this.getClass().getSimpleName());
		
		// Load the properties for the log4j loggers. 
	    PropertyConfigurator.configure(this.getClass().getSimpleName() + ".log4j.properties");
	}
	
	public void run()
	{
		
		while (!this.shutDown)
		{
	        
	        instance = retrieveResourceReadingProfile();
			
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
                writer.write(instance, instance_handle);
              
			}
			// Sleep for mqttPublishRate seconds and try to reconnect
			try
			{
				logger.debug("Sleeping for " + PublishRate + " seconds before publishing next value...");
				Thread.sleep(PublishRate * 1000);
			}
			catch (Exception e)
			{
				logger.fatal("Sleep interrupted while waiting to publish next value. Shutting down...", e);
				shutDown = true;
				return;
			}
		}
		
	}
	
	public abstract ResourceReadingProfile retrieveResourceReadingProfile();
}
