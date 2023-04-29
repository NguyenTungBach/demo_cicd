package com.example.demo_cicd1;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class DemoCicd1Application {
    @GetMapping("/test")
    public String welcome(){
        return "Bach test cicd1";
    }

    public static void main(String[] args) {
        SpringApplication.run(DemoCicd1Application.class, args);
    }

}
