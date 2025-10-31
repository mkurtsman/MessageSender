package ru.rgs.messagesender.service;

import org.springframework.stereotype.Component;

import java.util.UUID;

@Component
public class UuidGenerator {

    public String getUuid(){
        return UUID.randomUUID().toString();
    }
}
