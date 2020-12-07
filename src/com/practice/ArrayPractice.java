package com.practice;

import java.util.Arrays;
import java.util.Scanner;

//public class ArrayPractice {
//
//    public static void main(String[] args){
//
//        int[] numbers= new int[10];
//        int[] primeNumbers={2,3,5,7,9};
//
//
//        for(int i=0;i<10;i++){
//            numbers[i]=i+1;
//            System.out.println(numbers[i]); // one way to print
//        }
//
//        for(int element: primeNumbers){
//            System.out.println(element);
//        }
//
//        System.out.println(Arrays.toString(numbers)); // other way to print
//        System.out.println(Arrays.toString(primeNumbers));
//        // MAx of a number
//        int max=numbers[0];
//        // find the max element in an array
//        for(int i=0; i<numbers.length; i++){
//
//            if(numbers[i]>max){
//                max=numbers[i];
//            }
//        }
//
//        System.out.println("Max array elements is "+ max);
//
//        System.out.println("Max element"+ max(numbers));
//    }
//
//    static int max(int[] arr){
//        int max=arr[0];
//        for(int i=0; i<arr.length; i++){
//
//            if(arr[i]>max){
//                max=arr[i];
//            }
//        }
//        return max;
//    }
//}

// Arrays of Object
//class Student {
//    int rollNo;
//    String name;
//
//    Student() {
//        this.rollNo = 0;
//        this.name = "Rohit";
//    }
//
//    void setRollNo(int rollNo) {
//        this.rollNo = rollNo;
//    }
//
//    void setName(String name) {
//        this.name = name;
//    }
//
//    void getDetails() {
//        System.out.println("Student Details" + rollNo + name);
//    }
//}
//
//
//public class ArrayPractice {
//
//    public static void main(String[] args) {
//
//        Student[] students = new Student[2]; // Defining the Array
//        students[0] = new Student(); // Object creation
//        students[0].setName("rohit");
//        students[0].setRollNo(1);
//        students[0].getDetails();
//        System.out.println(students[0]);
//        System.out.println(students);
//        System.out.println(Arrays.toString(students));
//    }
//
//}


// Another way

//class Student {
//    int rollNo;
//    String name;
//
//    Student() {
//        this.rollNo = 0;
//        this.name = "Rohit";
//    }
//
//    void setRollNo(int rollNo) {
//        this.rollNo = rollNo;
//    }
//
//    void setName(String name) {
//        this.name = name;
//    }
//
//    void getDetails() {
//        System.out.println("Student Details" + rollNo + name);
//    }
//}
//
//class StudentImplementation{
//    Student[] records;
//    int element=0;
//    StudentImplementation(){
//       records= new Student[10];
//    }
//
//    public void add(Student st){
//        records[element]=st;
//        element++;
//    }
//
//    public void printRecords(){
//        for(int i=0; i<element;i++){
//            System.out.println(records[i].name+ records[i].rollNo);
//        }
//    }
//}
//
//public class ArrayPractice {
//
//    public static void main(String[] args) {
//
//        Student st= new Student();
//        st.setName("A");
//        st.setRollNo(1);
//        StudentImplementation stu= new StudentImplementation();
//        stu.add(st);
//        Student st1= new Student();
//        st1.setName("B");
//        st1.setRollNo(2);
//        stu.add(st1);
//
//        stu.printRecords();
//
//    }
//
//}


// 2D Array

public class ArrayPractice {

    public static void main(String[] args) {

        int[][] numbers = new int[2][3];
        Scanner sc = new Scanner(System.in);

        for (int i = 0; i< numbers.length ; i++) {
            System.out.println("see"+numbers[i].length);
            for (int j = 0; j<numbers[i].length; j++) {
                System.out.println("Enter " + i + " " + j + "element");
                numbers[i][j] = sc.nextInt();
            }
        }

        for (int i = 0; i < numbers.length; i++)
            System.out.println(Arrays.toString(numbers[i]));

        int[][] arr = {
                {1, 2, 3},
                {4, 5, 6, 7},
                null,
                {8, 9}
        };

        for (int i = 0; i < arr.length; i++)
            System.out.println(Arrays.toString(arr[i]));
    }
}

// max number in 2d aaray

//public class ArrayPractice {
//
//    public static void main(String[] args) {
//
//        int[][] arr = {
//                {1, 2, 3},
//                {4, 5, 6, 7},
//                {8, 9}
//        };
//
//        for (int i = 0; i < arr.length; i++)
//            System.out.println(Arrays.toString(arr[i]));
//
//        System.out.println("Max elements is"+ max(arr));
//    }
//
//    static int max(int[][] arr){
//        int max=arr[0][0];
//        for(int i=0;i<arr.length;i++){
//            for(int j=0;j<arr[i].length;j++){
//                if(arr[i][j]>max){
//                    max=arr[i][j];
//                }
//            }
//        }
//        return max;
//    }
//}



