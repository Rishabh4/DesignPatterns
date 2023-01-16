package com.java.tga.creational.abstractFactory.aws;

import com.java.tga.creational.abstractFactory.Instance;
import com.java.tga.creational.abstractFactory.Storage;

public class EC2Instance implements Instance {

    public EC2Instance(Capacity capacity) {
        System.out.println("Created EC2 Instance");
    }

    @Override
    public void start() {
        System.out.println("EC2 Instance started");
    }

    @Override
    public void attachStorage(Storage storage) {
        System.out.println("Attached " +storage+ " to EC2 Instance");
    }

    @Override
    public void stop() {
        System.out.println("EC2 Instance stopped");
    }

    @Override
    public String toString() {
        return "EC2 Instance";
    }
}
