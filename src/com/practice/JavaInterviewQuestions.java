package com.practice;


import java.util.Arrays;

public class JavaInterviewQuestions {

    public static void main(String[] args) {
        int number = 5;
        String str = "DAD";

//fibonnaciPrint(number);

//        for (int i = 0; i < number; i++)
//            System.out.println(fibonnaciRecursion(i));

// Prime number
//        System.out.println(primeNumber(number));

// Print all prime numbers till given range

//        primeNumberPrint(number);

//        To find if given string is palindrome or not
//        palindrome(str);

//        numberPalindrome(number);

        System.out.println(factorial(number));

    }

    // using iteration
    private static void fibonnaciPrint(int number) {
        int number1 = 0;
        int number2 = 1;
        int number3;

        for (int i = 0; i < number; i++) {
            System.out.println(number1);
            number3 = number1 + number2;
            number1 = number2;
            number2 = number3;
        }

    }

    //using recursion

    private static int fibonnaciRecursion(int number) {
        if (number <= 1)
            return number;
        return fibonnaciRecursion(number - 1) + fibonnaciRecursion(number - 2);
    }

    // prime number finder
    private static boolean primeNumber(int number) {
        if (number <= 1)
            return false;
        for (int i = 2; i < number; i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }

    // range of prime numbers
    public static void primeNumberPrint(int number) {

        for (int i = 2; i <= number; i++) {
            boolean isPrime = true;
            for (int factor = 2; factor < i; factor++) {
                if (i % factor == 0) {
                    isPrime = false;
                    break;
                }
            }

            if (isPrime) {
                System.out.println(i);
            }
        }
    }

    private static void palindrome(String givenString) {
//        StringBuilder reverseString= new StringBuilder();
//        reverseString.append(givenString);
//        reverseString=reverseString.reverse();
//
//        if(givenString.equals(reverseString.toString())){
//            System.out.println("Given string is palindrome");
//        }
//        else
//        System.out.println("Given string is not palindrome");

//
        if (givenString == null || givenString.isEmpty()) {
            System.out.println("Given string is palindrome");
        }

        char[] charArray = givenString.toCharArray();
        System.out.println(charArray);

        StringBuilder reverseString= new StringBuilder();

        for(int i=charArray.length-1;i>=0;i--){
            reverseString.append(charArray[i]);
        }

        if(givenString.equals(reverseString.toString()))
        {
            System.out.println("Given String is palindrome");
        }

    }


    private static void numberPalindrome(int number){
        int reverse=0;
        int remainder;
        int palindrom=number;

        while (number!=0){
            remainder=number%10;
            reverse=reverse*10 + remainder;
            number=number/10;
        }

        if(palindrom==reverse){
            System.out.println("Number is palindrome");
        }

        else {
            System.out.println("Number is not palindrome");
        }
    }

    public static int factorial(int number){

//        int factorialResult=1;
//        for(int i=1;i<=number;i++){
//            factorialResult*=i;
//        }
//        System.out.println(factorialResult);
//    }

        if(number == 0){
            return 1;
        }
        return number*factorial(number -1); //is this tail-recursion?
    }

}
