package com.java.java8.creational.factory;

public class JSONMessage extends Message {

    @Override
    public String getContent() {
        return "{\"JSON\":[]}";
    }

}
