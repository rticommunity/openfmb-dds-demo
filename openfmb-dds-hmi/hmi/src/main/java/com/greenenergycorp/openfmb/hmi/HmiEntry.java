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

//import com.greenenergycorp.openfmb.hmi.StateManager;
import akka.NotUsed;
import akka.actor.ActorSystem;
import akka.http.javadsl.ConnectHttp;
import akka.http.javadsl.Http;
import akka.http.javadsl.ServerBinding;
import akka.http.javadsl.model.HttpRequest;
import akka.http.javadsl.model.HttpResponse;
import akka.stream.ActorMaterializer;
import akka.stream.javadsl.Flow;

import openfmb.rti.publisher.essmodule.ESSControlProfilePublisher;
import openfmb.rti.publisher.reclosermodule.RecloserControlProfilePublisher;
import openfmb.rti.subscriber.essmodule.ESSEventProfileSubscriber;
import openfmb.rti.subscriber.essmodule.ESSReadingProfileSubscriber;
import openfmb.rti.subscriber.reclosermodule.RecloserEventProfileSubscriber;
import openfmb.rti.subscriber.reclosermodule.RecloserReadingProfileSubscriber;
import openfmb.rti.subscriber.resourcemodule.ResourceReadingProfileSubscriber;
import openfmb.rti.subscriber.solarmodule.SolarReadingProfileSubscriber;


import com.greenenergycorp.openfmb.simulator.DeviceId;
import com.greenenergycorp.openfmb.simulator.PropertyUtil;
import com.greenenergycorp.openfmb.hmi.StateManager;

import java.util.Properties;
import java.util.concurrent.CompletionStage;


public class HmiEntry {

    public static void main(String[] args) throws Exception {

    	
        final String openfmbConfigPath = System.getProperty("config.hmi.path", "hmi.properties");
        final Properties openfmbProps = PropertyUtil.optionallyLoad(openfmbConfigPath, System.getProperties());
        
        final String recloserLogicalDeviceId = PropertyUtil.propOrThrow(openfmbProps, "device.recloser.logicalDeviceID");
        final String reclosermRid = PropertyUtil.propOrThrow(openfmbProps, "device.recloser.mRID");
        final String recloserName = PropertyUtil.propOrThrow(openfmbProps, "device.recloser.name");
        final String recloserDescription = PropertyUtil.propOrThrow(openfmbProps, "device.recloser.description");
        final DeviceId recloserDeviceId = new DeviceId(recloserLogicalDeviceId, reclosermRid, recloserName, recloserDescription);

        final String batteryLogicalDeviceId = PropertyUtil.propOrThrow(openfmbProps, "device.battery.logicalDeviceID");
        final String batterymRid = PropertyUtil.propOrThrow(openfmbProps, "device.battery.mRID");
        final String batteryName = PropertyUtil.propOrThrow(openfmbProps, "device.battery.name");
        final String batteryDescription = PropertyUtil.propOrThrow(openfmbProps, "device.battery.description");
        final DeviceId batteryDeviceId = new DeviceId(batteryLogicalDeviceId, batterymRid, batteryName, batteryDescription);

        final String recloserEventTopic = PropertyUtil.propOrThrow(openfmbProps, "topic.RecloserEventProfile");
        final String recloserReadTopic = PropertyUtil.propOrThrow(openfmbProps, "topic.RecloserReadingProfile");
        final String recloserControlTopic = PropertyUtil.propOrThrow(openfmbProps, "topic.RecloserControlProfile");

        final String batteryReadTopic = PropertyUtil.propOrThrow(openfmbProps, "topic.BatteryReadingProfile");
        final String batteryEventTopic = PropertyUtil.propOrThrow(openfmbProps, "topic.BatteryEventProfile");
        final String batteryControlTopic = PropertyUtil.propOrThrow(openfmbProps, "topic.BatteryControlProfile");
        final String resourceReadTopic = PropertyUtil.propOrThrow(openfmbProps, "topic.ResourceReadingProfile");
        final String solarReadTopic = PropertyUtil.propOrThrow(openfmbProps, "topic.SolarReadingProfile");

        final int domainId = (int) PropertyUtil.propLongOrThrow(openfmbProps, "domainId");
        final String qosLibrary= PropertyUtil.propOrThrow(openfmbProps, "qos.Library");
        final String recloserEventQosProfile = PropertyUtil.propOrThrow(openfmbProps, "qos.RecloserControlProfile");
        final String recloserControlQosProfile = PropertyUtil.propOrThrow(openfmbProps, "qos.RecloserControlProfile");
        final String batteryReadingQosProfile = PropertyUtil.propOrThrow(openfmbProps, "qos.BatteryReadingProfile");
        final String batteryEventQosProfile = PropertyUtil.propOrThrow(openfmbProps, "qos.BatteryEventProfile");
        final String batteryControlQosProfile = PropertyUtil.propOrThrow(openfmbProps, "qos.BatteryControlProfile");
        final String resourceReadingQosProfile = PropertyUtil.propOrThrow(openfmbProps, "qos.ResourceReadingProfile");
        final String solarReadingQosProfile = PropertyUtil.propOrThrow(openfmbProps, "qos.SolarReadingProfile");
        final String recloserReadingQosProfile = PropertyUtil.propOrThrow(openfmbProps, "qos.RecloserReadingProfile");

        final long timeoutMs = PropertyUtil.propLongOrThrow(openfmbProps, "config.timeoutMs");

        final ActorSystem system = ActorSystem.create();

        final Http http = Http.get(system);
        final ActorMaterializer materializer = ActorMaterializer.create(system);

        final StateManager stateManager = new StateManager(timeoutMs);

        RecloserControlProfilePublisher publisher1 = new RecloserControlProfilePublisher();
        publisher1.initialize(0,  recloserControlTopic, qosLibrary, recloserControlQosProfile);
        
        ESSControlProfilePublisher publisher2 = new ESSControlProfilePublisher();
        publisher2.initialize(0, batteryControlTopic, qosLibrary, batteryControlQosProfile);
       
        
        final ControlIssuer controlIssuer = new ControlIssuer(recloserDeviceId, publisher1, batteryDeviceId, publisher2);

        final HmiServer app = new HmiServer(controlIssuer, stateManager);

        final Flow<HttpRequest, HttpResponse, NotUsed> routeFlow = app.createRoute().flow(system, materializer);
        final CompletionStage<ServerBinding> binding = http.bindAndHandle(routeFlow, ConnectHttp.toHost("localhost", 8080), materializer);
      
        ESSReadingSubscriber subscriber1 = new ESSReadingSubscriber(stateManager, 0, batteryReadTopic, qosLibrary, batteryReadingQosProfile);
        
        SolarReadingSubscriber subscriber2 = new SolarReadingSubscriber(stateManager, 0, solarReadTopic, qosLibrary, solarReadingQosProfile);
 
        ResourceReadingSubscriber subscriber3 = new ResourceReadingSubscriber(stateManager, 0, resourceReadTopic, qosLibrary, resourceReadingQosProfile);

        RecloserEventSubscriber subscriber4 = new RecloserEventSubscriber(stateManager, 0, recloserEventTopic, qosLibrary, recloserEventQosProfile);
        
        RecloserReadingSubscriber subscriber5 = new RecloserReadingSubscriber(stateManager, 0, recloserReadTopic, qosLibrary, recloserReadingQosProfile);

        ESSEventSubscriber subscriber6 = new ESSEventSubscriber(stateManager, 0, batteryEventTopic, qosLibrary, batteryEventQosProfile);

        System.out.println("ctrl-c to exit");
        System.in.read();

        binding.thenCompose(ServerBinding::unbind)
                .thenAccept(unbound -> system.terminate());

    }
}
