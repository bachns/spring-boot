package com.bachns.springboot.annotation;

import com.bachns.springboot.annotation.others.OtherGirl;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ComponentScan;

import javax.print.attribute.standard.MediaSize;
import javax.swing.*;

//@ComponentScan("com.bachns.springboot.annotation.others")
@SpringBootApplication(scanBasePackages = "com.bachns.springboot.annotation.others")
public class App {

    public static void main(String[] args) {
        ApplicationContext context = SpringApplication.run(App.class, args);
        try {
            Girl girl = context.getBean(Girl.class);
            System.out.println("Bean: " + girl.toString());
        } catch (Exception e) {
            System.out.println("Bean Girl khong ton tai");
        }

        try {
            OtherGirl otherGirl = context.getBean(OtherGirl.class);
            System.out.println("Bean: " + otherGirl.toString());
        } catch (Exception e) {
            System.out.println("Bean OtherGirl khong ton tai");
        }
    }
}
