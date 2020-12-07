package com.practice;


interface Circle{
    final static int radius=10;
    public void draw();

}

public class InterfacePractice implements Circle {

    public void draw(){
        System.out.println("drawing cirle");
    }
    public static void main(String[] args){
        InterfacePractice ip= new InterfacePractice();
        ip.draw();
    }

}
