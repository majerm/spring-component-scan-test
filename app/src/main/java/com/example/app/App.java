package com.example.app;

import com.example.shared.SharedService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan("com.example.shared")
public class App {

    public static void main(String[] args) {
        var context = SpringApplication.run(App.class);
        var service = context.getBean(SharedService.class);
    }

}
