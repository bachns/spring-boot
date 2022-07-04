package com.bachns.springboot.annotation;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class App {

    public static void main(String[] args) {
        ApplicationContext context = SpringApplication.run(App.class, args);
        Girl girl = context.getBean(Girl.class);
        System.out.println("Girl instance: " + girl);
        girl.outfit.wear();
    }
}
