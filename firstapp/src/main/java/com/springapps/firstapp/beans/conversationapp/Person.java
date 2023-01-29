package com.springapps.firstapp.beans.conversationapp;

public class Person {
    private final String name;

    public Person(String name) {
        this.name = name;
    }

    public String sayHello() {
        return "Hello, my name is " + this.name;
    }
}
