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


import com.greenenergycorp.openfmb.simulator.DeviceId;


import OpenFMB_Information_Model.openfmb.commonmodule.DateTimeInterval;

import OpenFMB_Information_Model.openfmb.commonmodule.HexBinary16;
import OpenFMB_Information_Model.openfmb.commonmodule.Recloser;
import OpenFMB_Information_Model.openfmb.commonmodule.RecloserReading;
import OpenFMB_Information_Model.openfmb.commonmodule.RecloserReadingTypeKind;
import OpenFMB_Information_Model.openfmb.commonmodule.SwitchEventKind;
import OpenFMB_Information_Model.openfmb.essmodule.ESSReadingProfile;
import OpenFMB_Information_Model.openfmb.reclosermodule.RecloserEventProfile;
import OpenFMB_Information_Model.openfmb.reclosermodule.RecloserReadingProfile;
import openfmb.rti.publisher.reclosermodule.RecloserEventProfilePublisher;
import openfmb.rti.publisher.reclosermodule.RecloserReadingProfilePublisher;

import java.util.Arrays;
import java.util.Calendar;

public class RecloserPublisher {

    private final RecloserReadingProfilePublisher readingPublisher;
    private final RecloserEventProfilePublisher eventPublisher;
    private final DeviceId deviceId;

    public RecloserPublisher(RecloserReadingProfilePublisher readingPublisher, RecloserEventProfilePublisher eventPublisher, DeviceId deviceId) {
        this.readingPublisher = readingPublisher;
        this.eventPublisher = eventPublisher;
        this.deviceId = deviceId;
    }

    public void recloserReadUpdate(final double power, final double voltage, final double frequency, final double kvars) throws Exception {
    	
        Recloser recloser = new Recloser();
    	recloser.mRID = deviceId.getmRid();;
    	recloser.name = deviceId.getName();
    	recloser.description = deviceId.getDescription();
    	
    	DateTimeInterval t = new DateTimeInterval();
		t.start = Calendar.getInstance().getTimeInMillis();
		
    	RecloserReadingProfile reading = new RecloserReadingProfile();
    	reading.recloser = recloser;
    	reading.logicalDeviceID =deviceId.getLogicalDeviceId();
    	
    	RecloserReading element1 = new RecloserReading();
    	
    	element1.value = (float) power;
    	element1.type = RecloserReadingTypeKind.RecloserReadingTypeKind_kW;
    	HexBinary16 flag = new HexBinary16();
		flag.userData[0] = 0;
		flag.userData[1] = 0;
		element1.qualityFlag = flag;
        element1.timePeriod = t;
        reading.recloserReadingList.recloserReading.add(element1);
        
    	RecloserReading element2 = new RecloserReading();
    	element2.value = (float) frequency;
    	element2.type = RecloserReadingTypeKind.RecloserReadingTypeKind_Hz;
    	element2.qualityFlag = flag;
        element2.timePeriod = t;
    	reading.recloserReadingList.recloserReading.add(element2);
    	
    	RecloserReading element3 = new RecloserReading();
    	element3.value = (float) voltage;
    	element3.type = RecloserReadingTypeKind.RecloserReadingTypeKind_Va;
    	element3.qualityFlag = flag;
        element3.timePeriod = t;
    	reading.recloserReadingList.recloserReading.add(element3);
        
    	
 
    	reading.timestamp = t.start;

    	readingPublisher.publish(reading);
    }

    public void recloserEventUpdate(final boolean isClosed, final boolean isBlocked) throws Exception {
/*        final long now = System.currentTimeMillis();

        final RecloserEventProfile eventProfile = RecloserModel.buildRecloserEvent(deviceId, isClosed, isBlocked);
        
        final byte[] payloadBytes = marshaller.marshal(eventProfile);
        mqttObserver.publish(payloadBytes, eventTopic + "/" + deviceId.getLogicalDeviceId());
*/
    	
        Recloser recloser = new Recloser();
    	recloser.mRID = deviceId.getmRid();;
    	recloser.name = deviceId.getName();
    	recloser.description = deviceId.getDescription();
    	
    	DateTimeInterval t = new DateTimeInterval();
		t.start = Calendar.getInstance().getTimeInMillis();
		
    	RecloserEventProfile event = new RecloserEventProfile();
    	event.recloser = recloser;
    	event.logicalDeviceID =deviceId.getLogicalDeviceId();
    	event.timestamp = t.start;
    	
    	if (isBlocked) 
    	    event.recloserEvent.isBlocked = true;
    	else
    		event.recloserEvent.isBlocked = false;
    	
    	if (isClosed) {
    		event.recloserEvent.normalOpen = false;
    		event.recloserEvent.type = SwitchEventKind.SwitchEventKind_closed;
    	}
    	else {
    		event.recloserEvent.normalOpen = true;
    	   	event.recloserEvent.type = SwitchEventKind.SwitchEventKind_open;
    	}
    	
     	eventPublisher.publish(event);
    	
    }
}
