package com.bachns.springboot;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {

    @Value("${com.bachns.mysql.url}")
    String url;

    @Bean
    DatabaseConnector mysqlConfigure() {
        DatabaseConnector connector = new MySqlConnector();
        System.out.println("Config Mysql Url: " + url);
        connector.setUrl(url);
        return connector;
    }
}
