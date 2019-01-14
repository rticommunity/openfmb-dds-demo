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

package com.greenenergycorp.openfmb.simulator.battery;


import OpenFMB_Information_Model.openfmb.commonmodule.ESSControlKind;
import OpenFMB_Information_Model.openfmb.commonmodule.ESSReading;
import OpenFMB_Information_Model.openfmb.commonmodule.ESSReadingSeq;
import OpenFMB_Information_Model.openfmb.commonmodule.ESSReadingTypeKind;
import OpenFMB_Information_Model.openfmb.commonmodule.SetPoint;
import OpenFMB_Information_Model.openfmb.commonmodule.SetPointList;
import OpenFMB_Information_Model.openfmb.commonmodule.UnitSymbolKind;
import OpenFMB_Information_Model.openfmb.essmodule.ESSControlProfile;
import OpenFMB_Information_Model.openfmb.essmodule.ESSReadingProfile;
import openfmb.rti.subscriber.essmodule.ESSControlProfileEventUpdate;
import openfmb.rti.subscriber.essmodule.ESSControlProfileSubscriber;
import openfmb.rti.subscriber.essmodule.ESSReadingProfileEventUpdate;
import openfmb.rti.subscriber.essmodule.ESSReadingProfileSubscriber;
import openfmb.rti.subscriber.resourcemodule.ResourceReadingProfileSubscriber;

public class ESSControlSubscriber implements ESSControlProfileEventUpdate {
    
    private BatteryMachine machine = null;
    private ESSControlProfileSubscriber en;


    
    public ESSControlSubscriber(BatteryMachine machine, int domainId, String topicName, String QoSLibrary, String QoSProfile) {

        this.machine = machine;
        en = new ESSControlProfileSubscriber(this);
        en.initialize(domainId, topicName, QoSLibrary, QoSProfile);        
    }

    

    public void update(ESSControlProfile data) {
        
        BatteryMachine.BatteryMode batteryMode = BatteryMachine.BatteryMode.fromInt(4);;
        if (data.logicalDeviceID.equals(machine.getDeviceID())) {
            
           if (data.essControl.type == ESSControlKind.ESSControlKind_island) {
                machine.setModeControl(BatteryMachine.BatteryMode.ISLANDED);
            }
            
            try {
                SetPointList points = data.essControl.setPointList;
                for (int i = 0; i < points.setPoint.size(); i++) {
                    SetPoint s = (SetPoint) points.setPoint.get(i);
                    if (s.unit == UnitSymbolKind.UnitSymbolKind_W ) {
                        machine.setPowerSetpoint(s.value);
                    }
                    
                }
            }
            catch (Exception e) {
                    
            }
                
            

            if (data.essControl.type == ESSControlKind.ESSControlKind_maintainSOC) {
                batteryMode = BatteryMachine.BatteryMode.fromInt(4);
            }
//            if (data.essControl.type == ESSControlKind.ESSControlKind_island) {
//                batteryMode = BatteryMachine.BatteryMode.fromInt(13);
//            }
            if (data.essControl.type == ESSControlKind.ESSControlKind_resynchronization) {
                batteryMode = BatteryMachine.BatteryMode.fromInt(14);
            }
            if (data.essControl.type == ESSControlKind.ESSControlKind_firm) {
                batteryMode = BatteryMachine.BatteryMode.fromInt(12);
            }
            machine.setModeControl(batteryMode);
        }
    }
    

}
