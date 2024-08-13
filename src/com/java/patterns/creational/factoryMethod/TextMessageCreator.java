package com.java.patterns.creational.factoryMethod;

import com.java.patterns.creational.factoryMethod.message.Message;
import com.java.patterns.creational.factoryMethod.message.TextMessage;

/**
 * Provides implementation for creating Text messages
 */
public class TextMessageCreator extends MessageCreator {

    @Override
    public Message createMessage() {
        return new TextMessage();
    }


}
