package com.java.java8.creational.factory;

public class JSONMessageCreator extends MessageCreator {

    @Override
    public Message createMessage() {
        return new JSONMessage();
    }

}
