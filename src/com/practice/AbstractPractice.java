package com.practice;

abstract class Demo{

    private String model;
    private String year;

    public abstract void goFast(); // Abstract method example
}

 public class AbstractPractice extends Demo {

    public void goFast(){
        System.out.println("i override the abbstract method");
    }

    public static void main(String[] args){
        AbstractPractice abs= new AbstractPractice();
        abs.goFast();
    }

}
