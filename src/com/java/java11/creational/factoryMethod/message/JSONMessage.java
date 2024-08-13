package com.java.java11.creational.factoryMethod.message;

public class JSONMessage extends Message {

    @Override
    public String getContent() {
        return "{\"JSON]\":[]}";
    }

}
