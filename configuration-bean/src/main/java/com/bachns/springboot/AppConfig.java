package com.bachns.springboot;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {

    @Bean
    SimpleBean simpleBeanConfigure() {
        return new SimpleBean("Bachns");
    }

    @Bean("mongodbConnector")
    DatabaseConnector mongodbConfigure() {
        DatabaseConnector connector = new MongoDbConnector();
        connector.setUrl("mongodb://mongodb0.example.com:27017/abcd");
        return connector;
    }

    @Bean("mysqlConnector")
    DatabaseConnector mysqlConfigure() {
        DatabaseConnector connector = new MySqlConnector();
        connector.setUrl("jdbc:mysql://localhost:3306/abcd");
        return connector;
    }

    @Bean("postgresqlConnector")
    DatabaseConnector postgresqlConfigure() {
        DatabaseConnector connector = new PostgreSqlConnector();
        connector.setUrl("postgresql://localhost/abcd");
        return connector;
    }
}
