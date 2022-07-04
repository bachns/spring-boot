package com.bachns.springboot;

public class MongoDbConnector extends DatabaseConnector {
    @Override
    public void connect() {
        System.out.println("Da ket noi toi Mongodb: " + getUrl());
    }
}
