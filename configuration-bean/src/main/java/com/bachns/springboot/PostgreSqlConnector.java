package com.bachns.springboot;

public class PostgreSqlConnector extends DatabaseConnector {
    @Override
    public void connect() {
        System.out.println("Da ket noi toi PostgreSQL: " + getUrl());
    }
}
