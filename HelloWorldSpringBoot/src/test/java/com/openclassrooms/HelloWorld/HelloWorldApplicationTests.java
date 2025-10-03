package com.openclassrooms.HelloWorld;

import com.openclassrooms.HelloWorld.service.BusinessService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.Objects;

@SpringBootTest
class HelloWorldApplicationTests {

    @Autowired
    private BusinessService businessService;

	@Test
	void contextLoads() {
	}

    @Test
    void testHelloWorld() {
        assert Objects.equals(businessService.getHelloWorld().getValue(), "Hello World!");
    }

}
