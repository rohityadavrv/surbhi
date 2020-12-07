package com.practice;

public class Employee {
    private String name;
   static protected int age;
    String designation;
    double salary;

     Employee() {

    }

    public Employee(String name) {
        this.name = name;
    }

   public void setAge(int age) {
        this.age = age;
    }

    public void setDesignation(String designation) {
        this.designation = designation;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public void printEmployeeDetails() {
        System.out.println("Employee name :" + name);
        System.out.println("Employee age :" + age);
        System.out.println("Employee salary :" + salary);
        System.out.println("Employee designation :" + designation);
    }


}
