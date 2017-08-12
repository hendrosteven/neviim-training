package com.neviim;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.web.ErrorMvcAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Configuration
@ComponentScan(basePackages = {"com.neviim"})
@EnableAutoConfiguration(exclude = {ErrorMvcAutoConfiguration.class})
@SpringBootApplication
@RestController
public class NeviimApiApplication {

    @RequestMapping("/")
    public String info() {
        return "Neviim Server v1.0";
    }

    public static void main(String[] args) {
        SpringApplication.run(NeviimApiApplication.class, args);
    }
}
