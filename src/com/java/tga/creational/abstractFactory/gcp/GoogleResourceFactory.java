package com.java.tga.creational.abstractFactory.gcp;

import com.java.tga.creational.abstractFactory.Instance;
import com.java.tga.creational.abstractFactory.ResourceFactory;
import com.java.tga.creational.abstractFactory.Storage;

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
