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



import OpenFMB_Information_Model.openfmb.commonmodule.SwitchEventKind;
import OpenFMB_Information_Model.openfmb.reclosermodule.RecloserEventProfile;
import openfmb.rti.subscriber.reclosermodule.RecloserEventProfileEventUpdate;
import openfmb.rti.subscriber.reclosermodule.RecloserEventProfileSubscriber;
import openfmb.rti.subscriber.resourcemodule.ResourceReadingProfileSubscriber;

public class RecloserEventSubscriber implements RecloserEventProfileEventUpdate {
	
	private StateManager machine = null;
	private RecloserEventProfileSubscriber en;


	
	public RecloserEventSubscriber(StateManager machine, int domainId, String topicName, String qosLibrary, String qosProfile) {

		this.machine = machine;
		en = new RecloserEventProfileSubscriber(this);
		en.initialize(domainId, topicName, qosLibrary, qosProfile);		
	}

	public void update(RecloserEventProfile data) {
		
    	
     	machine.updateRecloserStatus(data.logicalDeviceID, data.recloserEvent.type == SwitchEventKind.SwitchEventKind_closed);
    }
	

}
