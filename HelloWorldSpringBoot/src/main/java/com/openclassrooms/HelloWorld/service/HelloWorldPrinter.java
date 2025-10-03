package com.openclassrooms.HelloWorld.service;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class HelloWorldPrinter implements CommandLineRunner {

    @Override
    public void run(String... args) throws Exception {
        System.out.println("Hello World ! From HelloWorldPrinter");
    }
}
