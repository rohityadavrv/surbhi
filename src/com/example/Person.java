package com.example;

public class Person {

    private int id;
    private String firstName;
    private String lastName;

    Person(int id, String firstName, String lastName){
        this.id=id;
        this.firstName=firstName;
        this.lastName=lastName;
    }

    int getId(){
        return id;
    }

    String getFirstName(){
        return firstName;
    }

    String getLastName(){
        return lastName;
    }
}
