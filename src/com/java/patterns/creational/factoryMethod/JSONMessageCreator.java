package com.java.patterns.creational.factoryMethod;

import com.java.patterns.creational.factoryMethod.message.JSONMessage;
import com.java.patterns.creational.factoryMethod.message.Message;

/**
 * Provides implementation for creating JSON messages
 */
public class JSONMessageCreator extends MessageCreator {

    @Override
    public Message createMessage() {
        return new JSONMessage();
    }


}
