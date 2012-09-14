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
package org.sunnycode.hash.file2;

/**
 * Represents an entry in a HashFile.
 */
public final class HashEntry {
    /** The key value for this element. */
    private final byte[] key;

    /** The value of this element. */
    private final byte[] value;

    /**
     * Creates a new Entry object.
     */
    public HashEntry(byte[] key, byte[] value) {
        this.key = key;
        this.value = value;
    }

    /** returns entry key */
    public byte[] getKey() {
        return this.key;
    }

    /** returns entry value */
    public byte[] getValue() {
        return this.value;
    }

    /** returns pair representation */
    public byte[][] asPair() {
        return new byte[][] { this.key, this.value };
    }
}
