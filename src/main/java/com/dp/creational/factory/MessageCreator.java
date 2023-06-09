package com.dp.creational.factory;

import com.dp.creational.factory.message.Message;

/**
 * This is our abstract "creator". 
 * The abstract method createMessage() has to be implemented by
 * its subclasses.
 */
public abstract class MessageCreator {

    public Message getMessage(){
        Message message =  createMessage();
        message.addDefaultHeaders();
        message.encrypt();
        return message;
    }

    public abstract Message createMessage();
}
