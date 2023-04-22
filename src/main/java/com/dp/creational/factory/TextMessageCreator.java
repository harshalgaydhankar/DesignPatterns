package com.dp.creational.factory;

import com.dp.creational.factory.message.Message;
import com.dp.creational.factory.message.TextMessage;

/**
 * Provides implementation for creating Text messages
 */
public class TextMessageCreator extends MessageCreator {


    @Override
    public Message createMessage() {
        return new TextMessage();
    }
}
