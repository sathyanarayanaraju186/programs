package com.jacksonDemo.jacksonExample;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;

@SpringBootApplication
@RestController
public class JacksonExampleApplication {

    public static void main(String[] args) {
                SpringApplication.run(JacksonExampleApplication.class, args);
    }
@GetMapping("/hi")
    public String hi(){
        return "hi application.";
}
}
