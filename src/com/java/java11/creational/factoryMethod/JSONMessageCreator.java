package com.java.java11.creational.factoryMethod;

import com.java.java11.creational.factoryMethod.message.JSONMessage;
import com.java.java11.creational.factoryMethod.message.Message;

/**
 * Provides implementation for creating JSON messages
 */
public class JSONMessageCreator extends MessageCreator {

    @Override
    public Message createMessage() {
        return new JSONMessage();
    }


}
