package com.openclassrooms.HelloWorld.service;

import com.openclassrooms.HelloWorld.model.HelloWorld;
import org.springframework.stereotype.Component;

@Component
public class BusinessService {
    public HelloWorld getHelloWorld(){
        return new HelloWorld();
    }
}
