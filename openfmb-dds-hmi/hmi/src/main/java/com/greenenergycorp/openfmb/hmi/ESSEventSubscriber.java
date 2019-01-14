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

package com.greenenergycorp.openfmb.hmi;

import OpenFMB_Information_Model.openfmb.commonmodule.ESSEventKind;
import OpenFMB_Information_Model.openfmb.essmodule.ESSEventProfile;
import openfmb.rti.subscriber.essmodule.ESSEventProfileEventUpdate;
import openfmb.rti.subscriber.essmodule.ESSEventProfileSubscriber;
import openfmb.rti.subscriber.resourcemodule.ResourceReadingProfileSubscriber;

public class ESSEventSubscriber implements ESSEventProfileEventUpdate {
	
	private StateManager machine = null;
	private ESSEventProfileSubscriber en;


	
	public ESSEventSubscriber(StateManager machine, int domainId, String topicName, String qosLibrary, String qosProfile) {

		this.machine = machine;
		en = new ESSEventProfileSubscriber(this);
		en.initialize(domainId, topicName, qosLibrary, qosProfile);		
	}

	
	public ESSEventSubscriber(StateManager machine) {

		this.machine = machine;
	}
	
	public void update(ESSEventProfile data) {
    	
        final Boolean isCharging =  data.essEvent.type == ESSEventKind.ESSEventKind_charging;
        final Float stateOfCharge = data.essEvent.stateOfCharge; 
        final String mode = data.essEvent.typeExtension;
        
        machine.updateBatteryStatus(data.logicalDeviceID, isCharging, stateOfCharge, mode);
     	    	
    }
	

}
