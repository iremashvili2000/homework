package com.example.homework.api;

public class Person {
    private String name;
    private String lastname;
    public Person(String name,String lastname){
        this.name=name;
        this.lastname=lastname;
    }

    public Person() {

    }

    public String getLastname() {
        return lastname;
    }

    public String getName() {
        return name;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public void setName(String name) {
        this.name = name;
    }
}
