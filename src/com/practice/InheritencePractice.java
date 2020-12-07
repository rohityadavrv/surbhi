package com.practice;

class PracticeInheritence{

    PracticeInheritence(){
        System.out.println("Constructor of parent");
    }
    int sum(int x, int y){
        return x+y ;
    }
    int sub(int x, int y){
        return x-y ;
    }
}

public class InheritencePractice extends PracticeInheritence{

    InheritencePractice(){
        super();
        System.out.println("Constructor of child");
    }

    int multiply(int x, int y){
        return x*y;
    }

    public static void main(String[] args){
        InheritencePractice ip= new InheritencePractice();
       System.out.println(ip.sum(2,3));

       // one more concept

        PracticeInheritence pi= new InheritencePractice();
        System.out.println(ip.multiply(2,3));

    }
}
