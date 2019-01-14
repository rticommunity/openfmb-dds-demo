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

import com.greenenergycorp.openfmb.simulator.DeviceId;
import com.greenenergycorp.openfmb.simulator.TimeUtil;
import com.greenenergycorp.openfmb.simulator.battery.BatteryMachine.BatterySpec;
import com.rti.dds.infrastructure.*;

import OpenFMB_Information_Model.openfmb.commonmodule.DateTimeInterval;
import OpenFMB_Information_Model.openfmb.commonmodule.ESS;
import OpenFMB_Information_Model.openfmb.commonmodule.ESSEvent;
import OpenFMB_Information_Model.openfmb.commonmodule.ESSEventKind;
import OpenFMB_Information_Model.openfmb.commonmodule.ESSReading;
import OpenFMB_Information_Model.openfmb.commonmodule.ESSReadingTypeKind;
import OpenFMB_Information_Model.openfmb.commonmodule.HexBinary16;
import OpenFMB_Information_Model.openfmb.commonmodule.SolarEventKind;
import OpenFMB_Information_Model.openfmb.commonmodule.SolarInverter;
import OpenFMB_Information_Model.openfmb.commonmodule.SolarInverterEvent;
import OpenFMB_Information_Model.openfmb.commonmodule.SolarReading;
import OpenFMB_Information_Model.openfmb.commonmodule.SolarReadingTypeKind;
import OpenFMB_Information_Model.openfmb.essmodule.ESSEventProfile;
import OpenFMB_Information_Model.openfmb.essmodule.ESSReadingProfile;
import OpenFMB_Information_Model.openfmb.solarmodule.SolarEventProfile;
import openfmb.rti.publisher.essmodule.ESSEventProfilePublisher;
import openfmb.rti.publisher.essmodule.ESSReadingProfilePublisher;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.Calendar;
import java.util.Random;

public class BatteryMachine {
    private final static Logger logger = LoggerFactory.getLogger(BatteryMachine.class);

    private  ESSEventProfilePublisher eventPublisher;
    private  ESSReadingProfilePublisher readPublisher;
    
    private  DeviceId deviceId; 

    private  final long intervalMs;

    private  final BatterySpec batterySpec;

    private  double soc;
    private  double power;
    private  double volts;
    private  double freq;

    private  double currentSetpoint;

    private  BatteryMode mode;

    private  Long lastSocUpdateTime = null;

    private final Random random = new Random();

    private final Object mutex = new Object();

    public BatteryMachine(ESSEventProfilePublisher eventPublisher, ESSReadingProfilePublisher readPublisher, DeviceId deviceId,  long intervalMs, BatterySpec batterySpec) {
        this.eventPublisher = eventPublisher;
        this.readPublisher = readPublisher;
        this.intervalMs = intervalMs;
        this.batterySpec = batterySpec;
        this.deviceId = deviceId;

        this.currentSetpoint = 0.0;
        this.mode = BatteryMode.MAINTAIN_STANDBY;
        this.soc = 0.5;
        this.power = 0.0;
        this.volts = batterySpec.getVoltage();
        this.freq = batterySpec.getHertz();
    }



	public void run() throws InterruptedException {
        while (true) {
            synchronized (mutex) {
                updateSoc();
                checkStandby();
                jitter();
                publishState();
            }
            Thread.sleep(intervalMs);
        }
    }

    public void setPowerSetpoint(final double v) {
        logger.debug("Set power: " + v);
        final double clamped = clampSetpointValue(v);

        synchronized (mutex) {
            currentSetpoint = clamped;
            if (mode == BatteryMode.PROGRAM_PQ || mode == BatteryMode.ISLANDED) {

                updateSoc();
                power = clamped;
                publishState();
            }
        }
    }

    public void setModeControl(final BatteryMode nextMode) {
        logger.debug("Set mode: " + nextMode);
        synchronized (mutex) {
            if (mode == BatteryMode.MAINTAIN_STANDBY) {
                if (nextMode == BatteryMode.PROGRAM_PQ || nextMode == BatteryMode.ISLANDED) {
                    transitionToSetpointDrivenMode(nextMode);
                } else {
                    logger.warn("Transition from state " + mode.getDescription() + " to " + nextMode.getDescription() + " not supported.");
                }
            } else if (mode == BatteryMode.PROGRAM_PQ) {
                if (nextMode == BatteryMode.MAINTAIN_STANDBY) {
                    transitionToMaintainStandbyMode();
                } else if (nextMode == BatteryMode.ISLANDED) {
                    transitionToSetpointDrivenMode(nextMode);
                } else {
                    logger.warn("Transition from state " + mode.getDescription() + " to " + nextMode.getDescription() + " not supported.");
                }
            } else if (mode == BatteryMode.ISLANDED) {
                if (nextMode == BatteryMode.LEAVING_ISLANDED) {
                    transitionToMaintainStandbyMode();
                } else {
                    logger.warn("Transition from state " + mode.getDescription() + " to " + nextMode.getDescription() + " not supported.");
                }
            }
        }
    }
    
    public String getDeviceID() {
    	return deviceId.getLogicalDeviceId();
    }

    private void transitionToSetpointDrivenMode(final BatteryMode nextMode) {
        updateSoc();
        mode = nextMode;
        power = currentSetpoint;
        publishState();
    }

    private void transitionToMaintainStandbyMode() {
        updateSoc();
        if (soc < 0.5) {
            power = batterySpec.getMaxChargeRatekW();
        } else {
            power = 0.0;
        }
        mode = BatteryMode.MAINTAIN_STANDBY;
        publishState();
    }

    private double clampSetpointValue(final double v) {
        if (v < -batterySpec.getMaxChargeRatekW()) {
            return -batterySpec.getMaxChargeRatekW();
        } else if (v > batterySpec.getMaxDischargeRatekW()) {
            return batterySpec.getMaxDischargeRatekW();
        } else {
            return v;
        }
    }

    private void updateSoc() {
        final long now = System.currentTimeMillis();

        if (lastSocUpdateTime != null) {
            final long last = lastSocUpdateTime;
            final long elapsedMs = now - last;

            final double energyDelta = power * TimeUtil.millisecondsToHours(elapsedMs);
            final double prevEnergy = soc * batterySpec.energyRatingkWh;
            final double potentialNextEnergy = prevEnergy + energyDelta;

            final double nextEnergy;
            if (potentialNextEnergy > batterySpec.energyMaxkWh) {
                nextEnergy = batterySpec.energyMaxkWh;
            } else if (potentialNextEnergy < batterySpec.energyMinkWh) {
                nextEnergy = batterySpec.energyMinkWh;
            } else {
                nextEnergy = potentialNextEnergy;
            }

            soc = nextEnergy / batterySpec.energyRatingkWh;
        }
        lastSocUpdateTime = now;
    }

    private void checkStandby() {
        if (mode == BatteryMode.MAINTAIN_STANDBY) {
            if (power != 0.0d && soc > 0.5) {
                power = 0.0d;
            }
        }
    }

    private void jitter() {
        freq = batterySpec.getHertz() + ((random.nextDouble() * 0.001 * batterySpec.getHertz()) - (batterySpec.getHertz() * 0.001 / 2));
        volts = batterySpec.getVoltage() + ((random.nextDouble() * 0.001 * batterySpec.getVoltage()) - (batterySpec.getVoltage() * 0.001 / 2));
    }

    private void publishState() {
        try {
        	ESS ess = new ESS();
        	ess.mRID = deviceId.getmRid();;
        	ess.name = deviceId.getName();
        	ess.description = deviceId.getDescription();
        	
        	DateTimeInterval t = new DateTimeInterval();
    		t.start = Calendar.getInstance().getTimeInMillis();
    		
        	ESSReadingProfile reading = new ESSReadingProfile();
        	ESSReading element1 = new ESSReading();
        	
        	element1.value = (float) power;
        	element1.type = ESSReadingTypeKind.ESSReadingTypeKind_kW;
        	HexBinary16 flag = new HexBinary16();
    		flag.userData[0] = 0;
    		flag.userData[1] = 0;
    		element1.qualityFlag = flag;
            element1.timePeriod = t;
            reading.essReadingList.essReading.add(element1);
            
        	ESSReading element2 = new ESSReading();
        	element2.value = (float) freq;
        	element2.type = ESSReadingTypeKind.ESSReadingTypeKind_Hz;
        	element2.qualityFlag = flag;
            element2.timePeriod = t;
        	reading.essReadingList.essReading.add(element2);
        	
        	ESSReading element3 = new ESSReading();
        	element3.value = (float) volts;
        	element3.type = ESSReadingTypeKind.ESSReadingTypeKind_Va;
        	element3.qualityFlag = flag;
            element3.timePeriod = t;
        	reading.essReadingList.essReading.add(element3);
            
        	
        	reading.logicalDeviceID = deviceId.getLogicalDeviceId();
        	reading.timestamp = t.start;
        	reading.ess = ess;

        	
        	readPublisher.publish(reading);
            		
            ESSEventProfile event = new ESSEventProfile();
            		
            event.logicalDeviceID = deviceId.getLogicalDeviceId();
            		
            event.ess = ess;
            
            ESSEvent essEvent = new ESSEvent();
            essEvent.isConnected = true;
            essEvent.qualityFlag = flag;
            essEvent.stateOfCharge = (float) (soc * 100);
            if (power >= 0)
                essEvent.type = ESSEventKind.ESSEventKind_charging;
            else
            	essEvent.type = ESSEventKind.ESSEventKind_discharging;
//            essEvent.typeExtension = mode.toString();
            essEvent.typeExtension = mode.getDescription();

            essEvent.timestamp = t.start;
            event.essEvent = essEvent;
            
            
            
            eventPublisher.publish(event);		
        	
        	
        } catch (Exception ex) {
            logger.error("Failure to update state: " + ex);
        }
    }

    public static class BatterySpec {
        private final double maxChargeRatekW;
        private final double maxDischargeRatekW;
        private final double energyRatingkWh;
        private final double energyMaxkWh;
        private final double energyMinkWh;
        private final double efficiencyRatio;
        private final double voltage;
        private final double hertz;

        public BatterySpec(double maxChargeRatekW, double maxDischargeRatekW, double energyRatingkWh, double energyMaxkWh, double energyMinkWh, double efficiencyRatio, double voltage, double hertz) {
            this.maxChargeRatekW = maxChargeRatekW;
            this.maxDischargeRatekW = maxDischargeRatekW;
            this.energyRatingkWh = energyRatingkWh;
            this.energyMaxkWh = energyMaxkWh;
            this.energyMinkWh = energyMinkWh;
            this.efficiencyRatio = efficiencyRatio;
            this.voltage = voltage;
            this.hertz = hertz;
        }

        public double getMaxChargeRatekW() {
            return maxChargeRatekW;
        }

        public double getMaxDischargeRatekW() {
            return maxDischargeRatekW;
        }

        public double getEnergyRatingkWh() {
            return energyRatingkWh;
        }

        public double getEnergyMaxkWh() {
            return energyMaxkWh;
        }

        public double getEnergyMinkWh() {
            return energyMinkWh;
        }

        public double getEfficiencyRatio() {
            return efficiencyRatio;
        }

        public double getVoltage() {
            return voltage;
        }

        public double getHertz() {
            return hertz;
        }
    }


    public static enum BatteryMode {
        MAINTAIN_STANDBY(4, "Maintain Minimum Battery SoC"),
        PROGRAM_PQ(12, "Programmed P/Q"),
        ISLANDED(13, "Islanded"),
        LEAVING_ISLANDED(14, "Leaving Islanded");

        private final int number;
        private final String description;

        public int getNumber() {
            return number;
        }

        public String getDescription() {
            return description;
        }

        BatteryMode(final int num, final String desc) {
            number = num;
            description = desc;
        }

        public static BatteryMode fromInt(final int i) {
            for (final BatteryMode m: BatteryMode.values()) {
                if (m.getNumber() == i) {
                    return m;
                }
            }
            return null;
        }
    }
}
