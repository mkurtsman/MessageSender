package ru.rgs.messagesender.service;

import org.springframework.stereotype.Component;

import java.util.UUID;

@Component
public class Math {

    public Long increment(Long i){
        return ++i;
    }


}
