package com.practice;

public class StringPractice {

    public static void main(String[] args) {
        String greet = "Hello"; // created in constant pool, duplicacy is not allowed
        String greetDuplicate="Hello";

        System.out.println(greet==greetDuplicate);// shows pointing to same string in constant pool

        String salute= new String("Salute");
        String saluteDuplicate= new String("Salute");// showing pointing to different objects

        System.out.println(salute==saluteDuplicate);

        int number = 10;
        number = 11;
        // String creation practice
        char[] helloArray = {'h', 'e', 'l', 'l', 'o'};
        String greetings = new String(helloArray);
        greet = "rohit";
        greetings = "rohit";
        System.out.println(greetings);
        System.out.println(number);
        System.out.println(greet);

        // String methods
        System.out.println(greet.length());

        String concatinated = greet.concat(greetings);
        System.out.println(concatinated);

        String rohit="Rohit";
        String surbhi="rohit";

        System.out.println(rohit==surbhi); // compare references
        System.out.println(rohit.equals(surbhi)); //compare values
        System.out.println(rohit.equalsIgnoreCase(surbhi));
        System.out.println(rohit.compareTo(surbhi));// outputs the difference in ASCII code


        String Str = new String("Welcome-to-Tutorialspoint.com");
        for (String retval: Str.split("-")) {
            System.out.println(retval);
        }


        // String Buffer

        StringBuffer str= new StringBuffer("heerewewewewewewewewewewewewewe");
        System.out.println(str.capacity());


    }
}
