package com.kainos.ea.resources;

public class User {
    private String firstname;

    public User(String name){
        this.firstname = name;
    }

    public String getFirstname() {
        System.out.println(firstname);
        return firstname;
    }
}
