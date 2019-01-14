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

import java.io.FileInputStream;
import java.util.Properties;

public class PropertyUtil {

    public static Properties optionallyLoad(final String file) {
        final Properties properties = new Properties();
        try {
            properties.load(new FileInputStream(file));
            return properties;
        } catch (Exception ex) {
            return new Properties();
        }
    }

    public static Properties optionallyLoad(final String file, final Properties defaults) {
        final Properties properties = new Properties(defaults);
        try {
            properties.load(new FileInputStream(file));
            return properties;
        } catch (Exception ex) {
            return new Properties();
        }
    }

    public static String propOrThrow(final Properties properties, final String key) {
        final String property = properties.getProperty(key);
        if (property != null) {
            return property;
        } else {
            throw new IllegalArgumentException("Must set -D" + key);
        }
    }

    public static double propDoubleOrThrow(final Properties properties, final String key) {
        final String propStr = propOrThrow(properties, key);
        try {
            return Double.parseDouble(propStr);
        } catch (NumberFormatException ex) {
            throw new IllegalArgumentException("Could not parse value for " + key + " into a number");
        }
    }

    public static long propLongOrThrow(final Properties properties, final String key) {
        final String propStr = propOrThrow(properties, key);
        try {
            return Long.parseLong(propStr);
        } catch (NumberFormatException ex) {
            throw new IllegalArgumentException("Could not parse value for " + key + " into a number");
        }
    }

    public static String systemPropOrThrow(final String key) {
        return propOrThrow(System.getProperties(), key);
    }

    public static double systemPropDoubleOrThrow(final String key) {
        return propDoubleOrThrow(System.getProperties(), key);
    }

    public static long systemPropLongOrThrow(final String key) {
        return propLongOrThrow(System.getProperties(), key);
    }
}
