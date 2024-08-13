package com.java.designPatterns.creational.factoryMethod;

import com.java.designPatterns.creational.factoryMethod.message.JSONMessage;
import com.java.designPatterns.creational.factoryMethod.message.Message;

/**
 * Provides implementation for creating JSON messages
 */
public class JSONMessageCreator extends MessageCreator {

    @Override
    public Message createMessage() {
        return new JSONMessage();
    }


}
