package com.practice;

//public class ErrorHandlingPractice {
//    static int divideByZero(int a, int b){
//        int i=a/b;
//        return i;
//    }
//
//    static int computeDivision(int a, int b){
//        int res=0;
//        try{
//            res=divideByZero(a,b);
//        }
//        catch (NumberFormatException e){
//            System.out.println("Number format exception has occured");
//        }
//        return res;
//    }
//
//    public static void main(String[] args){
//        int a=1;
//        int b=0;
//        try{
//            computeDivision(a,b);
//        }
//        catch(ArithmeticException ex)
//        {
//            System.out.println("Arithmetic exception is caught");
//        }
//    }
//}

// User defined Exception using throw and throws

//public class ErrorHandlingPractice extends Exception{
//
//    private ErrorHandlingPractice(){
//
//    }
//
//    private ErrorHandlingPractice(String str){
//        super(str);
//    }
//    public static void main(String[] args)throws ErrorHandlingPractice{
//        int age=12;
//
//
//            if(age<18){
//                throw new ErrorHandlingPractice("you are minor");
//            }
//            else{
//                System.out.println("you are allowed");
//            }
//
//            System.out.println("I need to be executed so handle your exceptions");
//
//    }
//}

//public class ErrorHandlingPractice extends Exception{
//
//    private ErrorHandlingPractice(){
//
//    }
//
//    private ErrorHandlingPractice(String str){
//        super(str);
//    }
//    public static void main(String[] args){
//        int age=12;
//        try{
//
//        if(age<18){
//            throw new ErrorHandlingPractice("you are minor");
//        }
//        else{
//            System.out.println("you are allowed");
//        }
//
//        }
//        catch(ErrorHandlingPractice ex){
//            System.out.println(ex);
//        }
//
//        System.out.println("I need to be executed so handle your exceptions");
//    }
//}



// throw to handle a built in exception

//public class ErrorHandlingPractice {
//
//    public static void main(String[] args){
//        int age=12;
//        try{
//
//        if(age<18){
//            throw new ArithmeticException("you are minor");
//        }
//        else{
//            System.out.println("you are allowed");
//        }
//
//        }
//        catch(ArithmeticException ex){
//            System.out.println(ex);
//        }
//
//        System.out.println("I need to be executed so handle your exceptions");
//    }
//}

// throws to throw a built in exception and unchecked at same time

//public class ErrorHandlingPractice {
//
//    public static void main(String[] args) throws ArithmeticException{
//        int age=12;
////        try{
//
//            if(age<18){
//                throw new ArithmeticException("you are minor");
//            }
//            else{
//                System.out.println("you are allowed");
//            }
//
////        }
////        catch(ArithmeticException ex){
////            System.out.println(ex);
////        }
//
//        System.out.println("I need to be executed so handle your exceptions");
//    }
//}

