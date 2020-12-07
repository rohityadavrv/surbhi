package com.practice;

// Class concept one way
class Dog{
    String breed;
    String name;
    int age;

    void setAge(int age){
        this.age=age;
    }
    void setName(String name){
        this.name=name;
    }

    void getAge(){
        System.out.println(age);
    }


    void bark(){
        System.out.println(name + " barks");
    }
}


class Puppy {

    public static void main(String[] args){

        Dog dog=new Dog();
        dog.setName("lab");
        dog.setAge(10);
        dog.getAge();
        dog.bark();
    }
}

// Class concept other way

//public class Puppy {
//    String owner; // instance variables are initialized when objects are created
//    static String breed; // static or class variable
//    String name;
//    int age;
//
//    void setAge(int age){
//        this.age=age;
//    }
//    void setName(String name){
//        this.name=name;
//    }
//
//    void getAge(){
//        System.out.println(age);
//    }
//
//
//    void bark(){
//        System.out.println(name + " barks");
//    }
//
//    public static void main(String[] args){
//
//
//
//        String color="black"; // local variable can be present in method, constructor or blocks
//        Puppy dog=new Puppy();
//        dog.setName("lab");
//        dog.setAge(10);
//        dog.getAge();
//        dog.bark();
//    }
//}



// Constructor concept
//
//class Dog{
//    String breed;
//    String name;
//    int age;
//
//    public Dog(){
//        this.age=10;
//        this.name="BBBB";
//    }
//
//    public Dog(int age, String name){
//        this.age=age;
//        this.name=name;
//    }
//
//    void getAge(){
//        System.out.println(age);
//    }
//
//
//    void bark(){
//        System.out.println(name + " barks");
//    }
//}
//
//
//public class Puppy {
//
//    public static void main(String[] args){
//        Dog dog=new Dog(12, "labrador");
//        dog.getAge();
//        dog.bark();
//    }
//}


//

