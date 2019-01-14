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

import com.google.gson.Gson;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class StateManager /*implements CircuitStateObserver */{

    private final long timeoutMs;

    private final Object mutex = new Object();

    private Map<String, RecloserStatus> recloserStatuses = new HashMap<String, RecloserStatus>();
    private Map<String, BatteryStatus> batteryStatuses = new HashMap<String, BatteryStatus>();

    private Map<String, ResourceStatus> loadStatuses = new HashMap<String, ResourceStatus>();
    private Map<String, SolarStatus> solarStatuses = new HashMap<String, SolarStatus>();

    public StateManager(long timeoutMs) {
        this.timeoutMs = timeoutMs;
    }

    //@Override
    public void updateRecloserReadings(String logicalDeviceId, double power, double voltage, double frequency) {
        synchronized (mutex) {
            final RecloserStatus current = recloserStatuses.get(logicalDeviceId);
            if (current != null) {
                recloserStatuses.put(logicalDeviceId, new RecloserStatus(power, voltage, frequency, current.isClosed()));
            } else {
                recloserStatuses.put(logicalDeviceId, new RecloserStatus(power, voltage, frequency, true));
            }
        }
    }

    //@Override
    public void updateRecloserStatus(String logicalDeviceId, boolean isClosed) {
        synchronized (mutex) {
            final RecloserStatus current = recloserStatuses.get(logicalDeviceId);
            if (current != null) {
                recloserStatuses.put(logicalDeviceId, new RecloserStatus(current.getPower(), current.getVoltage(), current.getFrequency(), isClosed));
            } else {
                recloserStatuses.put(logicalDeviceId, new RecloserStatus(0.0, 0.0, 0.0, isClosed));
            }
        }
    }

    public void updateBatteryReadings(String logicalDeviceId, double power, double voltage, double frequency) {
        synchronized (mutex) {
            final BatteryStatus current = batteryStatuses.get(logicalDeviceId);
            if (current != null) {
                batteryStatuses.put(logicalDeviceId, new BatteryStatus(power, voltage, frequency, current.isCharging(), current.getSoc(), current.getMode()));
            } else {
                batteryStatuses.put(logicalDeviceId, new BatteryStatus(power, voltage, frequency, false, 50.0, "unknown"));
            }
        }
    }

    //@Override
    public void updateBatteryStatus(String logicalDeviceId, boolean isCharging, double soc, String mode) {
        synchronized (mutex) {
            final BatteryStatus current = batteryStatuses.get(logicalDeviceId);
            if (current != null) {
                batteryStatuses.put(logicalDeviceId, new BatteryStatus(current.getPower(), current.getVoltage(), current.getFrequency(), isCharging, soc, mode));
            } else {
                batteryStatuses.put(logicalDeviceId, new BatteryStatus(0.0, 0.0, 0.0, isCharging, soc, mode));
            }
        }
    }

    //@Override
    public void updateLoadPower(String logicalDeviceId, double value) {
        synchronized (mutex) {
            loadStatuses.put(logicalDeviceId, new ResourceStatus(value));
        }
    }

    //@Override
    public void updateSolarPower(String logicalDeviceId, double value) {
        synchronized (mutex) {
            solarStatuses.put(logicalDeviceId, new SolarStatus(value));
        }
    }

    private static <T extends Status> void removeOld(final Map<String, T> statuses, final long timeout) {
        final long now = System.currentTimeMillis();
        final long expiry = now - timeout;
        final Iterator<Map.Entry<String, T>> itr = statuses.entrySet().iterator();
        while (itr.hasNext()) {
            final Map.Entry<String, T> entry = itr.next();
            if (entry.getValue().getStatusTime() < expiry) {
                itr.remove();
            }
        }
    }

    public String toJson(final Gson gson) {
        synchronized (mutex) {
            removeOld(recloserStatuses, timeoutMs);
            removeOld(batteryStatuses, timeoutMs);
            removeOld(loadStatuses, timeoutMs);
            removeOld(solarStatuses, timeoutMs);

            final FullState fullState = new FullState(recloserStatuses, batteryStatuses, loadStatuses, solarStatuses);
            return gson.toJson(fullState);
        }
    }

    public static abstract class Status {
        private final long statusTime;

        public Status() {
            this.statusTime = System.currentTimeMillis();
        }

        public long getStatusTime() {
            return this.statusTime;
        }

    }

    public static class RecloserStatus extends Status {
        private final double power;
        private final double voltage;
        private final double frequency;
        private final boolean isClosed;

        public RecloserStatus(double power, double voltage, double frequency, boolean isClosed) {
            this.power = power;
            this.voltage = voltage;
            this.frequency = frequency;
            this.isClosed = isClosed;
        }

        public double getPower() {
            return power;
        }

        public boolean isClosed() {
            return isClosed;
        }

        public double getVoltage() {
            return voltage;
        }

        public double getFrequency() {
            return frequency;
        }

        @Override
        public String toString() {
            return "RecloserStatus{" +
                    "power=" + power +
                    ", isClosed=" + isClosed +
                    '}';
        }
    }

    public static class BatteryStatus extends Status {
        private final double power;
        private final double voltage;
        private final double frequency;
        private final boolean isCharging;
        private final double soc;
        private final String mode;

        public BatteryStatus(double power, double voltage, double frequency, boolean isCharging, double soc, String mode) {
            this.power = power;
            this.voltage = voltage;
            this.frequency = frequency;
            this.isCharging = isCharging;
            this.soc = soc;
            this.mode = mode;
        }

        public double getPower() {
            return power;
        }

        public double getVoltage() {
            return voltage;
        }

        public double getFrequency() {
            return frequency;
        }

        public boolean isCharging() {
            return isCharging;
        }

        public double getSoc() {
            return soc;
        }

        public String getMode() {
            return mode;
        }

        @Override
        public String toString() {
            return "BatteryStatus{" +
                    "power=" + power +
                    ", isCharging=" + isCharging +
                    ", soc=" + soc +
                    ", mode='" + mode + '\'' +
                    '}';
        }
    }

    public static class SolarStatus extends Status {
        private final double power;

        public SolarStatus(double power) {
            this.power = power;
        }

        public double getPower() {
            return power;
        }

        @Override
        public String toString() {
            return "SolarStatus{" +
                    "power=" + power +
                    '}';
        }
    }

    public static class ResourceStatus extends Status {
        private final double power;

        public ResourceStatus(double power) {
            this.power = power;
        }

        public double getPower() {
            return power;
        }

        @Override
        public String toString() {
            return "ResourceStatus{" +
                    "power=" + power +
                    '}';
        }
    }

    public static class FullState {
        private Map<String, RecloserStatus> reclosers;
        private Map<String, BatteryStatus> batteries;
        private Map<String, ResourceStatus> resources;
        private Map<String, SolarStatus> solars;

        public FullState(Map<String, RecloserStatus> reclosers, Map<String, BatteryStatus> batteries, Map<String, ResourceStatus> loads, Map<String, SolarStatus> solars) {
            this.reclosers = reclosers;
            this.batteries = batteries;
            this.resources = loads;
            this.solars = solars;
        }

        public Map<String, RecloserStatus> getReclosers() {
            return reclosers;
        }

        public Map<String, BatteryStatus> getBatteries() {
            return batteries;
        }

        public Map<String, ResourceStatus> getResources() {
            return resources;
        }

        public Map<String, SolarStatus> getSolars() {
            return solars;
        }

        @Override
        public String toString() {
            return "FullState{" +
                    "reclosers=" + reclosers +
                    ", batteries=" + batteries +
                    ", resources=" + resources +
                    ", solars=" + solars +
                    '}';
        }
    }


}
