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

import com.greenenergycorp.openfmb.simulator.DeviceId;

import OpenFMB_Information_Model.openfmb.commonmodule.DateTimeInterval;
import OpenFMB_Information_Model.openfmb.commonmodule.ESS;
import OpenFMB_Information_Model.openfmb.commonmodule.ESSControl;
import OpenFMB_Information_Model.openfmb.commonmodule.ESSControlKind;
import OpenFMB_Information_Model.openfmb.commonmodule.ESSReading;
import OpenFMB_Information_Model.openfmb.commonmodule.InverterModeKind;
import OpenFMB_Information_Model.openfmb.commonmodule.Recloser;
import OpenFMB_Information_Model.openfmb.commonmodule.RecloserControlKind;
import OpenFMB_Information_Model.openfmb.commonmodule.SetPoint;
import OpenFMB_Information_Model.openfmb.commonmodule.SetPointList;
import OpenFMB_Information_Model.openfmb.commonmodule.SetPointSeq;
import OpenFMB_Information_Model.openfmb.commonmodule.UnitMultiplierKind;
import OpenFMB_Information_Model.openfmb.commonmodule.UnitSymbolKind;
import OpenFMB_Information_Model.openfmb.essmodule.ESSControlProfile;
import OpenFMB_Information_Model.openfmb.reclosermodule.RecloserControlProfile;
import openfmb.rti.publisher.essmodule.ESSControlProfilePublisher;
import openfmb.rti.publisher.reclosermodule.RecloserControlProfilePublisher;

import java.util.Calendar;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class ControlIssuer {

    private final static Logger logger = LoggerFactory.getLogger(ControlIssuer.class);

    private final DeviceId recloserId;
    private final DeviceId batteryId;
    private final RecloserControlProfilePublisher recloserPublisher;
    private final ESSControlProfilePublisher batteryPublisher;
    

    public ControlIssuer(DeviceId recloserId, RecloserControlProfilePublisher recloserPublisher, DeviceId batteryId, ESSControlProfilePublisher batteryPublisher) {
        this.recloserId = recloserId;
        this.recloserPublisher = recloserPublisher;
        this.batteryId = batteryId;
        this.batteryPublisher = batteryPublisher;
    }

    public void tripRecloser() {
        issueRecloser("trip");
    }

    public void closeRecloser() {
        issueRecloser("close");
    }

    private void issueRecloser(final String action) {
        try {
        	
        	RecloserControlProfile data = new RecloserControlProfile();
        	
        	data.logicalDeviceID = recloserId.getLogicalDeviceId();
            Recloser recloser = new Recloser();
            recloser.description = recloserId.getDescription();
            recloser.mRID = recloserId.getmRid();
            recloser.name = recloserId.getName();
            data.recloser = recloser;
            
            data.recloserControl.typeExtension = action;
            
            if (action.equals("close"))
                data.recloserControl.type = RecloserControlKind.RecloserControlKind_close;
            if (action.equals("trip"))
                data.recloserControl.type = RecloserControlKind.RecloserControlKind_open;
                       
            
            
            recloserPublisher.publish(data);
        	
        } catch (Throwable ex) {
            logger.warn("Error issuing control: " + ex);
        }
    }

    public void setBatteryPowerSetpoint(final double value) {
        try {

        	ESSControlProfile instance = new ESSControlProfile();
        	ESSControl control = new ESSControl();
        	SetPointList list = new SetPointList();
        	SetPoint	type = new SetPoint();
    		type.unit = UnitSymbolKind.UnitSymbolKind_W;
    		type.multiplier = UnitMultiplierKind.UnitMultiplierKind_kilo;
    		type.value = (float) value;
    		type.name = "";
            control.inverterMode = InverterModeKind.InverterModeKind_csi;
            control.inverterModeExtension = "";
            control.issueID = "";
            DateTimeInterval t = new DateTimeInterval();
    		t.start = Calendar.getInstance().getTimeInMillis();
    		t.end = (long) 0;
            control.scheduledInterval= t;
            SetPointSeq l = new SetPointSeq();
            l.add(type);
            list.setPoint = l;
            control.setPointList = list;
            instance.essControl = control;
    		
    		   		
    		// Finish up the Meter reading profile
    		instance.logicalDeviceID = batteryId.getLogicalDeviceId();
    		ESS ess = new ESS();
    		ess.description = batteryId.getDescription();
    		ess.mRID = batteryId.getmRid();
    		ess.name = batteryId.getName();
    		instance.ess = ess;
    		instance.timestamp = Calendar.getInstance().getTimeInMillis();
    		batteryPublisher.publish(instance);
            
        } catch (Throwable ex) {
            logger.warn("Error issuing control: " + ex);
        }
    }


    public void setBatteryMode(final int mode) {
        try {
        	
        	ESSControlProfile instance = new ESSControlProfile();
    		
    		//instance.essControl.setPointList.setPoint.setMaximum(0);
    		    				
    		// Finish up the Meter reading profile
    		instance.logicalDeviceID = batteryId.getLogicalDeviceId();
    		ESS ess = new ESS();
    		ess.description = batteryId.getDescription();
    		ess.mRID = batteryId.getmRid();
    		ess.name = batteryId.getName();
    		instance.ess = ess;
    		instance.timestamp = Calendar.getInstance().getTimeInMillis();
    		
    		if (mode == 4)
    			instance.essControl.type = ESSControlKind.ESSControlKind_maintainSOC;
    		if (mode == 13)
    			instance.essControl.type = ESSControlKind.ESSControlKind_island;
    		if (mode == 14)
    			instance.essControl.type = ESSControlKind.ESSControlKind_resynchronization;
    		if (mode == 12)
    			instance.essControl.type = ESSControlKind.ESSControlKind_firm;
    		
    		instance.essControl.inverterMode = InverterModeKind.InverterModeKind_csi;
    		
        	
    		batteryPublisher.publish(instance);        	
        } catch (Throwable ex) {
        	
            logger.warn("Error issuing control: " + ex);
        }
    }


}
