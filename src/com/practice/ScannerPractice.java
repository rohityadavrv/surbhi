package com.practice;

import java.util.Scanner;

public class ScannerPractice {

    public static void main(String[] args) {
        int size = 0;
        String str = "";
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the size of array");
//        size = sc.nextInt();
        str=sc.nextLine();
        System.out.println(str);
        System.out.println(size);

    }
}