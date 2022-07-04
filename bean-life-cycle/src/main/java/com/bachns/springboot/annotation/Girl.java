package com.bachns.springboot.annotation;

import org.springframework.stereotype.Component;
import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

@Component("girl")
public class Girl {

    @PostConstruct
    public void postConstruct() {
        System.out.println("Doi tuong Girl sau khi khoi tao xong se chay ham nay");
    }

    @PreDestroy
    public void preDestroy() {
        System.out.println("Ham nay duoc goi truoc khi huy doi tuong Girl");
    }
}
