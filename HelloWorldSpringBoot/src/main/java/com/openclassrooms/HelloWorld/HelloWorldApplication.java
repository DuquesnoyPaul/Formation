package com.openclassrooms.HelloWorld;

import com.openclassrooms.HelloWorld.model.HelloWorld;
import com.openclassrooms.HelloWorld.service.BusinessService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class HelloWorldApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(HelloWorldApplication.class, args);
	}

    @Autowired
    private BusinessService businessService;

    @Override
    public void run(String... args) throws Exception {
        HelloWorld helloWorld = businessService.getHelloWorld();
        System.out.println(helloWorld + " From HelloWorldApplication");
    }
}
