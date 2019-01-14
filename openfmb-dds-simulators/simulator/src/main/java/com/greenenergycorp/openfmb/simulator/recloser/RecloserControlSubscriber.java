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





import OpenFMB_Information_Model.openfmb.commonmodule.RecloserControlKind;


import OpenFMB_Information_Model.openfmb.reclosermodule.RecloserControlProfile;
import openfmb.rti.subscriber.reclosermodule.RecloserControlProfileEventUpdate;
import openfmb.rti.subscriber.reclosermodule.RecloserControlProfileSubscriber;
import openfmb.rti.subscriber.resourcemodule.ResourceReadingProfileSubscriber;

public class RecloserControlSubscriber implements RecloserControlProfileEventUpdate {
	
	private RecloserMachine machine = null;
    private String logicalDeviceId;
	private RecloserControlProfileSubscriber en;


	
	public RecloserControlSubscriber(RecloserMachine machine, String logicalDeviceId, int domainId, String topicName, String QoSLibrary, String QoSProfile) {

		this.machine = machine;
		this.logicalDeviceId = logicalDeviceId;
		en = new RecloserControlProfileSubscriber(this);
		en.initialize(domainId, topicName, QoSLibrary, QoSProfile);
	}
	

	public void update(RecloserControlProfile data) {
    	
		if (data.logicalDeviceID.equals(logicalDeviceId)) {
    	
	    	if (data.recloserControl.type == RecloserControlKind.RecloserControlKind_close) {
	    		machine.handleClose();
	    	}
	    	
	        if (data.recloserControl.type == RecloserControlKind.RecloserControlKind_open) {
	    		machine.handleOpen();
	    	}
        
		}
    }

}
