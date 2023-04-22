package com.dp.creational.factory;

import com.dp.creational.factory.message.JSONMessage;
import com.dp.creational.factory.message.Message;

/**
 * Provides implementation for creating JSON messages
 */
public class JSONMessageCreator extends MessageCreator {

    @Override
    public Message createMessage() {
        return new JSONMessage();
    }
}
