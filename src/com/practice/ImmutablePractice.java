package com.practice;

final class PracticeImmutable { // make class as final

    public int number;

    PracticeImmutable() {
        this.number = 10;
    }

    //avoid setter methods

//    void setNumber(int number){
//        this.number=number;
//    }

    void getNumber() {
        System.out.println(number);
    }
}

public class ImmutablePractice /*extends PracticeImmutable*/ {

    public static void main(String[] args) {
        PracticeImmutable p = new PracticeImmutable();
//        p.setNumber(11); // state of object changed
        p.getNumber();
        p.number=12; // state of object again changed so make class as final
        p.getNumber();

    }

}
