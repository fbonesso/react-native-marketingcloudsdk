/*
  Copyright 2019 Salesforce, Inc
  <p>
  Redistribution and use in source and binary forms, with or without modification, are permitted
  provided that the following conditions are met:
  <p>
  1. Redistributions of source code must retain the above copyright notice, this list of
  conditions and the following disclaimer.
  <p>
  2. Redistributions in binary form must reproduce the above copyright notice, this list of
  conditions and the following disclaimer in the documentation and/or other materials provided
  with the distribution.
  <p>
  3. Neither the name of the copyright holder nor the names of its contributors may be used to
  endorse or promote products derived from this software without specific prior written permission.
  <p>
  THIS SOFTWARE IS PROVIDED BY THE COPYRIGHT HOLDERS AND CONTRIBUTORS "AS IS" AND ANY EXPRESS OR
  IMPLIED WARRANTIES, INCLUDING, BUT NOT LIMITED TO, THE IMPLIED WARRANTIES OF MERCHANTABILITY AND
  FITNESS FOR A PARTICULAR PURPOSE ARE DISCLAIMED. IN NO EVENT SHALL THE COPYRIGHT HOLDER OR
  CONTRIBUTORS BE LIABLE FOR ANY DIRECT, INDIRECT, INCIDENTAL, SPECIAL, EXEMPLARY, OR CONSEQUENTIAL
  DAMAGES (INCLUDING, BUT NOT LIMITED TO, PROCUREMENT OF SUBSTITUTE GOODS OR SERVICES; LOSS OF USE,
  DATA, OR PROFITS; OR BUSINESS INTERRUPTION) HOWEVER CAUSED AND ON ANY THEORY OF LIABILITY,
  WHETHER IN CONTRACT, STRICT LIABILITY, OR TORT (INCLUDING NEGLIGENCE OR OTHERWISE) ARISING IN
  ANY WAY OUT OF THE USE OF THIS SOFTWARE, EVEN IF ADVISED OF THE POSSIBILITY OF SUCH DAMAGE.
 */
package com.salesforce.marketingcloud.reactnative;

import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.bridge.ReadableMapKeySetIterator;
import com.facebook.react.bridge.ReadableType;
import com.facebook.react.bridge.WritableArray;
import com.facebook.react.bridge.WritableMap;

import org.robolectric.annotation.Implementation;
import org.robolectric.annotation.Implements;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Implements(Arguments.class)
public class ShadowArguments {

    @Implementation
    public static WritableArray createArray() {
        return new TestWritableArray();
    }

    @Implementation
    public static WritableMap createMap() {
        return new TestWritableMap();
    }

    static class TestWritableArray implements WritableArray {
        List<Object> container = new ArrayList<>();

        @Override
        public void pushNull() {

        }

        @Override
        public void pushBoolean(boolean value) {
            container.add(value);
        }

        @Override
        public void pushDouble(double value) {
            container.add(value);
        }

        @Override
        public void pushInt(int value) {
            container.add(value);
        }

        @Override
        public void pushString(String value) {
            container.add(value);
        }

        @Override
        public void pushArray(WritableArray array) {
            // NO_OP Not needed for tests
        }

        @Override
        public void pushMap(WritableMap map) {
            // NO_OP Not needed for tests
        }

        @Override
        public int size() {
            return container.size();
        }

        @Override
        public boolean isNull(int index) {
            // NO_OP Not needed for tests
            return false;
        }

        @Override
        public boolean getBoolean(int index) {
            return (boolean) container.get(index);
        }

        @Override
        public double getDouble(int index) {
            return (double) container.get(index);
        }

        @Override
        public int getInt(int index) {
            return (int) container.get(index);
        }

        @Override
        public String getString(int index) {
            return (String) container.get(index);
        }

        @Override
        public ReadableArray getArray(int index) {
            // NO_OP Not needed for tests
            return null;
        }

        @Override
        public ReadableMap getMap(int index) {
            // NO_OP Not needed for tests
            return null;
        }

        @Override
        public ReadableType getType(int index) {
            // NO_OP Not needed for tests
            return null;
        }
    }

    static class TestWritableMap implements WritableMap {
        Map<String, Object> container = new HashMap<>();

        @Override
        public void putNull(String key) {
            container.put(key, null);
        }

        @Override
        public void putBoolean(String key, boolean value) {
            container.put(key, value);
        }

        @Override
        public void putDouble(String key, double value) {
            container.put(key, value);
        }

        @Override
        public void putInt(String key, int value) {
            container.put(key, value);
        }

        @Override
        public void putString(String key, String value) {
            container.put(key, value);
        }

        @Override
        public void putArray(String key, WritableArray value) {
            // NO_OP Not needed for tests
        }

        @Override
        public void putMap(String key, WritableMap value) {
            // NO_OP Not needed for tests
        }

        @Override
        public void merge(ReadableMap source) {
            // NO_OP Not needed for tests
        }

        @Override
        public boolean hasKey(String name) {
            return container.keySet().contains(name);
        }

        @Override
        public boolean isNull(String name) {
            return container.get(name) == null;
        }

        @Override
        public boolean getBoolean(String name) {
            return (boolean) container.get(name);
        }

        @Override
        public double getDouble(String name) {
            return (double) container.get(name);
        }

        @Override
        public int getInt(String name) {
            return (int) container.get(name);
        }

        @Override
        public String getString(String name) {
            return (String) container.get(name);
        }

        @Override
        public ReadableArray getArray(String name) {
            // NO_OP Not needed for tests
            return null;
        }

        @Override
        public ReadableMap getMap(String name) {
            // NO_OP Not needed for tests
            return null;
        }

        @Override
        public ReadableType getType(String name) {
            // NO_OP Not needed for tests
            return null;
        }

        @Override
        public ReadableMapKeySetIterator keySetIterator() {
            // NO_OP Not needed for tests
            return null;
        }
    }
}
