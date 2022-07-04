package com.bachns.springboot;

public abstract class DatabaseConnector {

    private String url;

    public abstract void connect();

    public void setUrl(String url){
        this.url = url;
    }

    public String getUrl() {
        return url;
    }
}
