package ru.rgs.messagesender;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.ImportResource;

@SpringBootApplication
@ImportResource({"file:config/camel-context.xml", "file:config/beans/*.xml", "file:config/datasources/*.xml", "file:config/endpoints/*.xml"})
@Configuration
public class MessageSender {

	public static void main(String[] args) {
		SpringApplication.run(MessageSender.class, args);
	}

}
