package com.dp.creational.factory;

import com.dp.creational.factory.message.Message;

public class Client {

	public static void main(String[] args) {

		printMessage(new JSONMessageCreator());
		printMessage(new TextMessageCreator());
		
	}
	
	public static void printMessage(MessageCreator creator) {
		Message message = creator.createMessage();
		System.out.println(message.getContent());
	}
}
