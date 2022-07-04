package com.bachns.springboot.annotation;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class App {

    public static void main(String[] args) {
        System.out.println("Truoc khi IoC Conntainer khoi tao");
        ApplicationContext context = SpringApplication.run(App.class, args);
        System.out.println("Sau khi IoC Connectainer khoi tao xong");

        Girl girl = context.getBean(Girl.class);
        System.out.println("Girl instance: " + girl);
    }
}
