package com.java.java8.creational.abstractFactory.aws;

import com.java.java8.creational.abstractFactory.Instance;
import com.java.java8.creational.abstractFactory.ResourceFactory;
import com.java.java8.creational.abstractFactory.Storage;

public class AwsResourceFactory implements ResourceFactory {
    @Override
    public Instance createInstance(Instance.Capacity capacity) {
        return new EC2Instance(capacity);
    }

    @Override
    public Storage createStorage(int capMib) {
        return new S3Storage(capMib);
    }
}
