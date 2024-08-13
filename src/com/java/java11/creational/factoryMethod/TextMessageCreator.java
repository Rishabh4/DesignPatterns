package com.java.java11.creational.factoryMethod;

import com.java.java11.creational.factoryMethod.message.Message;
import com.java.java11.creational.factoryMethod.message.TextMessage;

/**
 * Provides implementation for creating Text messages
 */
public class TextMessageCreator extends MessageCreator {

    @Override
    public Message createMessage() {
        return new TextMessage();
    }


}
