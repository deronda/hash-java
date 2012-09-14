package org.sunnycode.hash.file.basetest;

import java.util.List;

public class HashFileGeneric {
    public interface Builder {
        public void add(byte[] key, byte[] value);

        public void finish();
    }

    public interface Storage<T> {
        public byte[] get(byte[] key);

        public List<byte[]> getMulti(byte[] key);

        public List<T> elements();

        public byte[][] asPair(T object);
    }
}
