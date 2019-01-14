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

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class LineValueDataLoader {

    public static double[] load(final String file) throws Exception {
        final FileInputStream fileInputStream = new FileInputStream(file);

        final BufferedReader reader = new BufferedReader(new InputStreamReader(fileInputStream));

        boolean keepGoing = true;
        final List<Double> builder = new ArrayList<Double>();
        while (keepGoing) {
            final String line = reader.readLine();
            if (line != null) {
                builder.add(Double.parseDouble(line.trim()));
            } else {
                keepGoing = false;
            }
        }

        final double[] results = new double[builder.size()];
        int i = 0;
        for (Double d: builder) {
            results[i] = d;
            i++;
        }

        return results;
    }
}
