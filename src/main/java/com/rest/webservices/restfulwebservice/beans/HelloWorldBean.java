package com.rest.webservices.restfulwebservice.beans;

public class HelloWorldBean {
    private String message;

    public HelloWorldBean(String message) {
        this.message = message;
    }

    public String getMessage(){
        return this.message;
    }

    @Override
    public String toString() {
        return String.format("HelloWorldBean [message=%s]", this.message);
    }
}
