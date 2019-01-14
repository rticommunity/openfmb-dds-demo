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


import com.greenenergycorp.openfmb.simulator.DeviceId;


import OpenFMB_Information_Model.openfmb.commonmodule.DateTimeInterval;
import OpenFMB_Information_Model.openfmb.commonmodule.ESS;
import OpenFMB_Information_Model.openfmb.commonmodule.ESSControl;
import OpenFMB_Information_Model.openfmb.commonmodule.ESSControlKind;
import OpenFMB_Information_Model.openfmb.commonmodule.SetPoint;
import OpenFMB_Information_Model.openfmb.commonmodule.SetPointList;
import OpenFMB_Information_Model.openfmb.commonmodule.SetPointSeq;
import OpenFMB_Information_Model.openfmb.commonmodule.UnitSymbolKind;
import OpenFMB_Information_Model.openfmb.essmodule.ESSControlProfile;
import openfmb.rti.publisher.essmodule.ESSControlProfilePublisher;

import java.util.Calendar;



public class BatteryControlPublisher {


    private final DeviceId deviceId;
    private final ESSControlProfilePublisher publisher;

    public BatteryControlPublisher(ESSControlProfilePublisher publisher, DeviceId deviceId) {
        this.publisher = publisher;
        this.deviceId = deviceId;
    }

    public void setIslanded() {
    	final ESSControlProfile control = new ESSControlProfile();
    	control.logicalDeviceID = deviceId.getLogicalDeviceId();
    	ESS ess = new ESS();
    	ess.mRID = deviceId.getmRid();;
    	ess.name = deviceId.getName();
    	ess.description = deviceId.getDescription();
    	
    	DateTimeInterval t = new DateTimeInterval();
	t.start = Calendar.getInstance().getTimeInMillis();
    	control.ess = ess;
    	
    	ESSControl essControl = new ESSControl();
    	essControl.type = ESSControlKind.ESSControlKind_island;		
    	 	
    	control.essControl = essControl;
        publisher.publish(control);
    }

    public void setPowerSetpoint(final double power) {
    	
    	final ESSControlProfile control = new ESSControlProfile();
    	control.logicalDeviceID = deviceId.getLogicalDeviceId();
    	ESS ess = new ESS();
    	ess.mRID = deviceId.getmRid();;
    	ess.name = deviceId.getName();
    	ess.description = deviceId.getDescription();
    	
    	DateTimeInterval t = new DateTimeInterval();
		t.start = Calendar.getInstance().getTimeInMillis();
    	control.ess = ess;
    
        SetPointList list = new SetPointList();	
    	ESSControl essControl = new ESSControl();
    	essControl.type  = ESSControlKind.ESSControlKind_island;
        SetPoint element = new SetPoint();    	
    	element.unit = UnitSymbolKind.UnitSymbolKind_W;
    	element.value = (float) power;
    	element.name = "";


         SetPointSeq l = new SetPointSeq();
         l.add(element);
         list.setPoint = l;
         essControl.setPointList = list;
//    	control.essControl.setPointList.setPoint.add(element);
    	 	
    	control.essControl = essControl;	

        publisher.publish(control);
    }

    public void leaveIslanded() {
    	
    	final ESSControlProfile control = new ESSControlProfile();
    	control.logicalDeviceID = deviceId.getLogicalDeviceId();
    	
    	ESS ess = new ESS();
    	ess.mRID = deviceId.getmRid();;
    	ess.name = deviceId.getName();
    	ess.description = deviceId.getDescription();
    	
    	DateTimeInterval t = new DateTimeInterval();
		t.start = Calendar.getInstance().getTimeInMillis();
    	control.ess = ess;
    	
    	ESSControl essControl = new ESSControl();
    	essControl.type = ESSControlKind.ESSControlKind_resynchronization;		
    	 	
    	control.essControl = essControl;
    	
        publisher.publish(control);
    }

}
