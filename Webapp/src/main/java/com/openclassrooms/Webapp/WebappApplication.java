package com.openclassrooms.Webapp;

import com.openclassrooms.Webapp.configuration.CustomProperties;
import com.openclassrooms.Webapp.repository.EmployeeProxy;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class WebappApplication {

	public static void main(String[] args) {
		SpringApplication.run(WebappApplication.class, args);
	}

}
