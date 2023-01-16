package com.java.tga.creational.abstractFactory;

import com.java.tga.creational.abstractFactory.aws.AwsResourceFactory;
import com.java.tga.creational.abstractFactory.gcp.GoogleResourceFactory;

public class Client {

    private ResourceFactory resourceFactory;

    public Client(ResourceFactory resourceFactory) {
        this.resourceFactory = resourceFactory;
    }

    public Instance createServer(Instance.Capacity capacity, int storageMib) {
        Instance instance = resourceFactory.createInstance(capacity);
        Storage storage = resourceFactory.createStorage(storageMib);
        instance.attachStorage(storage);
        return instance;
    }

    public static void main(String[] args) {
        Client aws = new Client(new AwsResourceFactory());
        Instance i1 = aws.createServer(Instance.Capacity.micro, 10240);
        i1.start();
        i1.stop();
        System.out.println("**************************************************************************");
        Client gcp = new Client(new GoogleResourceFactory());
        i1 = gcp.createServer(Instance.Capacity.large, 10240);
        i1.start();
        i1.stop();
    }
}
