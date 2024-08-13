package com.java.java8.creational.abstractFactory.gcp;

import com.java.java8.creational.abstractFactory.Instance;
import com.java.java8.creational.abstractFactory.ResourceFactory;
import com.java.java8.creational.abstractFactory.Storage;

public class GoogleResourceFactory implements ResourceFactory {
    @Override
    public Instance createInstance(Instance.Capacity capacity) {
        return new GoogleComputingEngineInstance(capacity);
    }

    @Override
    public Storage createStorage(int capMib) {
        return new GoogleCloudStorage(capMib);
    }
}
