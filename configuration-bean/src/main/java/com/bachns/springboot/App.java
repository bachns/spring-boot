package com.bachns.springboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class App {
    public static void main(String[] args){
        ApplicationContext context = SpringApplication.run(App.class, args);
        DatabaseConnector mongodb =  context.getBean(MongoDbConnector.class);
        mongodb.connect();

        DatabaseConnector mysql = context.getBean(MySqlConnector.class);
        mysql.connect();

        DatabaseConnector postgresql = context.getBean(PostgreSqlConnector.class);
        postgresql.connect();
    }
}
