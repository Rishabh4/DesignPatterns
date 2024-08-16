package com.java.patterns.creational.abstractfactory2.aws;

import com.java.patterns.creational.abstractfactory2.Instance;
import com.java.patterns.creational.abstractfactory2.Instance.Capacity;
import com.java.patterns.creational.abstractfactory2.ResourceFactory;
import com.java.patterns.creational.abstractfactory2.Storage;

//Factory implementation for Google cloud platform resources
public class AwsResourceFactory implements ResourceFactory {

    @Override
    public Instance createInstance(Capacity capacity) {
        return new com.java.patterns.creational.abstractfactory2.aws.Ec2Instance(capacity);
    }

    @Override
    public Storage createStorage(int capMib) {
        return new com.java.patterns.creational.abstractfactory2.aws.S3Storage(capMib);
    }


}
