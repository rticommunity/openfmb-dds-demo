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
package com.greenenergycorp.openfmb.simulator;

public class DailyInterpolatedData {
    private final double[] values;

    public DailyInterpolatedData(double[] values) {
        this.values = values;
    }

    public double atTime(long time) {
        final long elapsedInDay = time - TimeUtil.getStartOfCurrentDay();

        final double hourFractional = (double) elapsedInDay / (double) TimeUtil.millisecondsInAnHour;

        final int hourIndex = (int) Math.floor(hourFractional);

        final double fraction = hourFractional - hourIndex;

        final double below = values[hourIndex];
        final double above = values[(hourIndex + 1) % 24];

        return below + fraction * (above - below);
    }
}
