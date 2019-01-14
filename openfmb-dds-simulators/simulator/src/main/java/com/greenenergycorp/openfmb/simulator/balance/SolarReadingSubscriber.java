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




import OpenFMB_Information_Model.openfmb.commonmodule.SolarReading;
import OpenFMB_Information_Model.openfmb.commonmodule.SolarReadingSeq;
import OpenFMB_Information_Model.openfmb.commonmodule.SolarReadingTypeKind;
import OpenFMB_Information_Model.openfmb.solarmodule.SolarReadingProfile;
import openfmb.rti.subscriber.resourcemodule.ResourceReadingProfileSubscriber;
import openfmb.rti.subscriber.solarmodule.SolarReadingProfileEventUpdate;
import openfmb.rti.subscriber.solarmodule.SolarReadingProfileSubscriber;

public class SolarReadingSubscriber implements SolarReadingProfileEventUpdate {
	
	private BalancingMachine machine = null;
	private SolarReadingProfileSubscriber en;


	
	public SolarReadingSubscriber(BalancingMachine machine, int domainId, String topicName, String QoSLibrary, String QoSProfile) {

		this.machine = machine;
		en = new SolarReadingProfileSubscriber(this);
		en.initialize(domainId, topicName, QoSLibrary, QoSProfile);		
	}


	public void update(SolarReadingProfile data) {
    	SolarReadingSeq points = data.solarReadingList.solarReading;
    	for (int i = 0; i < points.size(); i++) {
    		SolarReading s = (SolarReading) points.get(i);
    		if (s.type == SolarReadingTypeKind.SolarReadingTypeKind_kW)
   			    machine.updateSolarPower(data.logicalDeviceID, s.value);
    	}
    }

}
