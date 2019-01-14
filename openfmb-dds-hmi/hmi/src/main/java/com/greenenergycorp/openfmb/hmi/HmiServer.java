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

import akka.http.javadsl.server.PathMatchers;
import akka.http.javadsl.server.Route;
import akka.http.javadsl.server.Unmarshaller;
import com.google.gson.Gson;

import static akka.http.javadsl.server.Directives.*;

public class HmiServer {

    private final ControlIssuer controlIssuer;
    private final StateManager manager;
    private final Gson gson = new Gson();

    public HmiServer(ControlIssuer controlIssuer, StateManager manager) {
        this.controlIssuer = controlIssuer;
        this.manager = manager;
    }

    public Route createRoute() {

        return route(
                get(() -> route(
                        path("data", () -> complete(manager.toJson(gson))),
                        pathSingleSlash(() -> getFromResource("web/index.html")),
                        pathPrefix("images", () -> route(
                                path(PathMatchers.segment(), name -> getFromResource("web/images/" + name)
                        ))),
                        path(PathMatchers.segment(), name -> getFromResource("web/" + name))
                )),
                post(() ->
                        route(
                                pathPrefix("reclosers", () ->
                                    pathPrefix(PathMatchers.segment(), id ->
                                            route(
                                                    path("trip", () -> trip(id)),
                                                    path("close", () -> close(id))
                                            ))),
                                pathPrefix("batteries", () ->
                                        pathPrefix(PathMatchers.segment(), id ->
                                           route(
                                                   path("power", () -> entity(Unmarshaller.entityToString(), (json) -> batteryPower(id, json))),
                                                   path("mode", () -> entity(Unmarshaller.entityToString(), (json) -> batteryMode(id, json)))
                                           ))
                                )
                        )
                ));
    }

    private Route trip(final String id) {
        controlIssuer.tripRecloser();
        return complete("success");
    }
    private Route close(final String id) {
        controlIssuer.closeRecloser();
        return complete("success");
    }

    private Route batteryPower(final String id, final String json) {
        try {
            final PowerSetpointJson obj = gson.fromJson(json, PowerSetpointJson.class);
            if (obj.getPower() != null) {
                controlIssuer.setBatteryPowerSetpoint(obj.getPower());
                return complete("success");
            } else {
                return reject();
            }
        } catch (Throwable ex) {
            return reject();
        }
    }

    private Route batteryMode(final String id, final String json) {
        try {
            final BatteryModeJson obj = gson.fromJson(json, BatteryModeJson.class);
            final Integer mode = obj.getMode();
            if (mode != null) {
                controlIssuer.setBatteryMode(mode);
                return complete("success");
            } else {
                return reject();
            }
        } catch (Throwable ex) {
            return reject();
        }
    }

    public static class PowerSetpointJson {
        private final Double power;

        public PowerSetpointJson(Double power) {
            this.power = power;
        }

        public Double getPower() {
            return power;
        }
    }

    public static class BatteryModeJson {
        private final Integer mode;

        public BatteryModeJson(Integer mode) {
            this.mode = mode;
        }

        public Integer getMode() {
            return mode;
        }
    }
}
