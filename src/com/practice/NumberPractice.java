package com.practice;

public class NumberPractice {

    public static void main(String[] args){
        Integer x=5;
        Integer y = 10;
        Integer z =5;
        Short a = 5;
        Integer r=9;

        System.out.println(x.compareTo(3));
        System.out.println(x.compareTo(5));
        System.out.println(x.compareTo(8));
        System.out.println(x.equals(3));
        System.out.println(x.equals(5));
        System.out.println(x.equals(y));
        System.out.println(x.equals(z));

        System.out.println(Integer.toString(12));
        System.out.println(r.toString());
        System.out.println(Integer.parseInt("10"));

        Integer b = -8; // can be primitive even
        System.out.println(Math.abs(b));
        System.out.println( Math.random() );


    }
}
