package com.practice;

public class Rohit {

    public static void main(String[] args){



        for(int i=0;i<10;i++){
            System.out.println(fibonnaci(i));
        }

    }

    private static int fibonnaci(int number){
       if(number<=1)
           return number;
       return fibonnaci(number-1)+fibonnaci(number-2);


    }
}
