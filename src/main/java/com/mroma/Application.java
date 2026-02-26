package com.mroma;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController //creating API
public class Application {

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }

    @GetMapping//to expose this endpoint/get we use this annotation. this method is a rest endpoint
    public String helloWorld() {
        return "Hello World Spring Boot";
    }

}
