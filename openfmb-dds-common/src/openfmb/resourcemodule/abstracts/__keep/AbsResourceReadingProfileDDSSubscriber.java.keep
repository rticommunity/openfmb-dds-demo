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
package openfmb.resourcemodule.abstracts;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

import org.eclipse.paho.client.mqttv3.MqttException;
import org.eclipse.paho.client.mqttv3.MqttMessage;
import org.openfmb.xsd._2015._12.openfmb.resourcemodule.ResourceReadingProfile;
import org.openfmb.xsd.converters.ResourceReadingProfileXsdConverter;

import openfmb.mqtt.common.AbsOpenFmbMqttSubscriber;

public abstract class AbsResourceReadingProfileMqttSubscriber extends AbsOpenFmbMqttSubscriber
{
	@Override
	public void run()
	{
		this.run(null);
	}
	
	public void run(String[] filterList)
	{
		this.initializeLogger();
		
		try
		{
			this.initializeTarget();
		}
		catch (Exception e)
		{
			logger.error(e);
			this.shutDown = true;
			return;
		}
		
		// Use the class name to create the MQTT topic.  Just simply replace
		// the "." class separators with "/" for MQTT.
		String t = ResourceReadingProfile.class.getName();
		int pos = t.lastIndexOf(".openfmb.");
		t = t.substring(pos + 1);
		
		ArrayList<String> logicalDeviceIdList = new ArrayList<String>();
		
		if (filterList != null && filterList.length > 0)
		{
			if (filterList[0].equals("-f"))
			{
				logger.debug("filterList is a file.  Begin reading file...");
				
				// Read the list of logicalDeviceID values from the file
				File inFile = new File(filterList[1]);
				if (inFile.exists() && ! inFile.isDirectory())
				{
					BufferedReader br = null;
					try
					{
						br = new BufferedReader(new FileReader(filterList[1]));
						String logicalDeviceId = null;
						
						while ((logicalDeviceId = br.readLine()) != null)
						{
							if (logicalDeviceId.length() > 0)
							{
								logicalDeviceIdList.add(logicalDeviceId);
								logger.debug("  " + logicalDeviceId);
							}
						}
					}
					catch (FileNotFoundException e)
					{
						// Not a valid file
						logger.fatal(filterList[1] + " is not a valid filename. Shutting down...");
						return;
					}
					catch (IOException e)
					{
						// Cannot read file
						logger.fatal("Cannot read file " + filterList[1] + ". Shutting down...");
						return;
					}
					finally
					{
						try
						{
							br.close();
						}
						catch (IOException e)
						{
							// Just ignore
						}
					}
				}
				else
				{
					// Not a valid file
					logger.fatal(filterList[1] + " is not a valid filename. Shutting down...");
					return;
				}
			}
			else
			{
				logger.debug("filterList = ");
				for (int i = 0; i < filterList.length; i++)
				{
					if (filterList[i] != null && filterList[i].trim().length() > 0)
					{
						logger.debug("  [" + i + "] = " + filterList[i]);
						logicalDeviceIdList.add(filterList[i].trim());
					}
					else
					{
						logger.debug("  [" + i + "] = <blank> (skipped)");
					}
				}
			}
			
			this.initialize(t.replace(".", "/"), logicalDeviceIdList.toArray(new String[0]));
		}
		else
		{
			logger.debug("filterList is null");
			
			this.initialize(t.replace(".", "/"));
		}
		
		if (!this.isInitialized())
		{
			return;
		}
		
		while (!this.shutDown)
		{
			boolean running = true;
			
			try
			{
				startSubscbription();
			}
			catch (MqttException e)
			{
				logger.error(e);
				return;
			}
			
			while (running && !this.shutDown)
			{
				try
				{
					Thread.sleep(100);
				}
				catch (InterruptedException e)
				{
					logger.debug(e);
					running = false;
				}
			}
		}
		
	}
	
	/**
	 * MQTT message has arrived. Publish it to DDS.
	 * 
	 * @param topic Topic that the message was published to.
	 * @param message Contents of the message.
	 * 
	 * @throws Exception
	 */
	@Override
	public void messageArrived(String topic, MqttMessage message) throws Exception
	{
		String payload = new String(message.getPayload());
		if (logger != null)
		{
			logger.debug("ResourceReadingProfile message: " + payload);
		}
		
		try
		{
			ResourceReadingProfile profile = null;
			
			switch (this.mqttMessageFormat)
			{
			case JSON:
				profile = ResourceReadingProfileXsdConverter.convertJsonToPojo(payload);
				break;
				
			case XML:
			default:
				profile = ResourceReadingProfileXsdConverter.convertXmlToPojo(payload);
				break;
			
			}
			
			processResourceReadingProfile(profile);
		}
		catch (Exception e)
		{
			if (logger != null)
			{
				logger.error(e);
			}
		}
	}
	
	public abstract void processResourceReadingProfile(ResourceReadingProfile profile);
}
