package ru.rgs.messagesender;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.ImportResource;

@SpringBootApplication
public class MessageSender {

	public static void main(String[] args) {
		SpringApplication.run(MessageSender.class, args);
	}

}
