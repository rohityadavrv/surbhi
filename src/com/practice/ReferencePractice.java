package com.practice;

class A{
    int a;
    A(){
       this.a=13;
    }
}

public class ReferencePractice {

    public static void main(String[] args){
        int number= 10;
        int number2= number;

        System.out.println(number2);
        number=11;
        System.out.println(number2); // shows the value is getting stored in this case in other varibale

        A a= new A();
        A b=a;

        System.out.println(b.a);
        a.a=15;
        System.out.println(b.a); // here it stores the address of object so means pointing to same object i.w why it changed




    }
}
