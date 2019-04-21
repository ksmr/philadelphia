/*
 * Copyright 2015 Philadelphia authors
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.paritytrading.philadelphia;

import static org.junit.Assert.*;

import org.joda.time.MutableDateTime;
import org.junit.Test;

public class FIXTimestampsTest {

    @Test
    public void append() {
        MutableDateTime timestamp = new MutableDateTime(2015, 9, 1, 9, 30, 5, 250);

        StringBuilder builder = new StringBuilder();

        FIXTimestamps.append(timestamp, builder);

        assertEquals("20150901-09:30:05.250", builder.toString());
    }

}
