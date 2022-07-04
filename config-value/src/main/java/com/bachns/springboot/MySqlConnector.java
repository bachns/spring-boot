package com.bachns.springboot;

public class MySqlConnector extends DatabaseConnector {

    @Override
    public void connect() {
        System.out.println("Da ket noi toi MySQL: " + getUrl());
    }

}
