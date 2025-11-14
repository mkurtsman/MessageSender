package ru.rgs.messagesender.service;

import org.apache.camel.Exchange;
import org.apache.camel.Processor;
import org.springframework.stereotype.Component;

import java.net.URI;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

@Component
public class FileProcessor implements Processor {
    @Override
    public void process(Exchange exchange) throws Exception {
        Path path = Paths.get("/home/misha/IdeaProjects/MessageSender/src/main/resources/body.xml");
        String body = Files.readString(path);

        exchange.getIn().setBody(body, String.class);
    }
}
