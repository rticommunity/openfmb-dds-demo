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




import OpenFMB_Information_Model.openfmb.commonmodule.ResourceReading;
import OpenFMB_Information_Model.openfmb.commonmodule.ResourceReadingSeq;
import OpenFMB_Information_Model.openfmb.commonmodule.ResourceReadingTypeKind;
import OpenFMB_Information_Model.openfmb.commonmodule.SolarReadingTypeKind;
import OpenFMB_Information_Model.openfmb.resourcemodule.ResourceReadingProfile;

import openfmb.rti.subscriber.resourcemodule.ResourceReadingProfileEventUpdate;
import openfmb.rti.subscriber.resourcemodule.ResourceReadingProfileSubscriber;

public class ResourceReadingSubscriber implements ResourceReadingProfileEventUpdate {
	
	private BalancingMachine machine = null;
	private ResourceReadingProfileSubscriber en;


	
	public ResourceReadingSubscriber(BalancingMachine machine, int domainId, String topicName, String  QoSLibrary, String QoSProfile) {

		this.machine = machine;
		en = new ResourceReadingProfileSubscriber(this);
		en.initialize(domainId, topicName, QoSLibrary, QoSProfile);		
	}


	
	public ResourceReadingSubscriber(BalancingMachine machine) {

		this.machine = machine;
	}
	

	public void update(ResourceReadingProfile data) {
    	ResourceReadingSeq points = data.resourceReadingList.resourceReading;
    	for (int i = 0; i < points.size(); i++) {
    		ResourceReading s = (ResourceReading) points.get(i);
    		if (s.type == ResourceReadingTypeKind.ResourceReadingTypeKind_kW)
   			    machine.updateLoadPower(data.logicalDeviceID, s.value);
    	}
    }

}
