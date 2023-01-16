package com.java.tga.creational.abstractFactory.gcp;

import com.java.tga.creational.abstractFactory.Instance;
import com.java.tga.creational.abstractFactory.Storage;

public class GoogleComputingEngineInstance implements Instance {

    public GoogleComputingEngineInstance(Capacity capacity) {
        System.out.println("Created Google Computing Engine Instance");
    }

    @Override
    public void start() {
        System.out.println("Google Computing Engine Instance started");
    }

    @Override
    public void attachStorage(Storage storage) {
        System.out.println("Attached " +storage+ " to Google Computing Engine Instance");
    }

    @Override
    public void stop() {
        System.out.println("Google Computing Engine Instance stopped");
    }

    @Override
    public String toString() {
        return "Google Computing Engine Instance";
    }
}
