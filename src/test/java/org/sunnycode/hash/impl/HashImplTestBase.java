/**
 * Licensed to the Apache Software Foundation (ASF) under one
 * or more contributor license agreements.  See the NOTICE file
 * distributed with this work for additional information
 * regarding copyright ownership.  The ASF licenses this file
 * to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License.  You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.sunnycode.hash.impl;

import org.sunnycode.hash.LongHash;
import org.testng.Assert;
import org.testng.annotations.Test;

/**
 * Base class for Hash test implementations
 */
public abstract class HashImplTestBase {
    public abstract LongHash getHash();

    private String[] values = { "", "0", "short hash",
            "this is a very long hash value" };

    @Test
    public void testBloom_random_fast() throws Exception {
        LongHash hash = this.getHash();

        hash.getName();

        for (String value : values) {
            long h1 = hash.getLongHashCode(value);
            long h2 = hash.getLongHashCode(value.getBytes());

            Assert.assertEquals(h1, h2);
            Assert.assertEquals(h1, hash.getLongHashCodes(value, 5)[0]);
        }
    }
}
