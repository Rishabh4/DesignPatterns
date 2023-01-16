package com.java.tga.creational.abstractFactory.aws;

import com.java.tga.creational.abstractFactory.Instance;
import com.java.tga.creational.abstractFactory.ResourceFactory;
import com.java.tga.creational.abstractFactory.Storage;

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
