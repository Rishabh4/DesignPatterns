package com.java.designPatterns.creational.abstractfactory2.gcp;

import com.java.designPatterns.creational.abstractfactory2.Instance;
import com.java.designPatterns.creational.abstractfactory2.Instance.Capacity;
import com.java.designPatterns.creational.abstractfactory2.ResourceFactory;
import com.java.designPatterns.creational.abstractfactory2.Storage;

//Factory implementation for Google cloud platform resources
public class GoogleResourceFactory implements ResourceFactory {

    @Override
    public Instance createInstance(Capacity capacity) {
        return new com.java.designPatterns.creational.abstractfactory2.gcp.GoogleComputeEngineInstance(capacity);
    }

    @Override
    public Storage createStorage(int capMib) {
        return new GoogleCloudStorage(capMib);
    }


}
