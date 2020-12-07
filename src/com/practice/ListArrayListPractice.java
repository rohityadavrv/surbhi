package com.practice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

//public class ListArrayListPractice {
//
//    public static void main(String[] args) {
//        // Creating a list
//        List<Integer> l1
//                = new ArrayList<Integer>();
//
//        // Adds 1 at 0 index
//        l1.add(0, 1);
//
//        // Adds 2 at 1 index
//        l1.add(1, 2);
//        System.out.println(l1);
//
//        // Creating another list
//        List<Integer> l2
//                = new ArrayList<Integer>();
//
//        l2.add(1);
//        l2.add(2);
//        l2.add(3);
//
//        // Will add list l2 from 1 index
//        l1.addAll(1, l2);
//        System.out.println(l1);
//
//        // Removes element from index 1
//        l1.remove(1);
//        System.out.println(l1);
//
//        // Prints element at index 3
//        System.out.println(l1.get(3));
//
//        // Replace 0th element with 5
//        l1.set(0, 5);
//        System.out.println(l1);
//    }
//
//
//}


// Iterating a List
//public class ListArrayListPractice {
//
//    public static void main(String[] args) {
//        List<String> al
//                = new ArrayList<>();
//
//        al.add("Geeks");
//        al.add("Geeks");
//        al.add(1, "For");
//
//        for(int index=0; index<al.size(); index++){
//            System.out.println(al.get(index));
//        }
//
//        for( String element : al){
//            System.out.println(element);
//        }
//
//    }
//
//
//}


// Converting arrays to list

//public class ListArrayListPractice {
//
//    public static void main(String[] args) {
//        String[] array = {"Java", "Python", "PHP", "C++"};
//        System.out.println("Printing Array: " + Arrays.toString(array));
////Converting Array to List
//        List<String> list = new ArrayList<String>();
//        for (String lang : array) {
//            list.add(lang);
//        }
//        System.out.println("Printing List: " + list);
//
//        List<String> list2= new ArrayList<String>();
//        list2=Arrays.asList(array);
//        System.out.println(list2);
//
//    }
//}


// Converting list to Arrays

//public class ListArrayListPractice {
//
//    public static void main(String[] args) {
//        List<String> fruitList = new ArrayList<>();
//        fruitList.add("Mango");
//        fruitList.add("Banana");
//        fruitList.add("Apple");
//        fruitList.add("Strawberry");
//        //Converting ArrayList to Array
//
//        String[] array1= new String[fruitList.size()];
//        System.out.println(Arrays.toString(fruitList.toArray(array1)));
//
//        String[] array2 = fruitList.toArray(new String[fruitList.size()]);
//        System.out.println("Printing Array: "+Arrays.toString(array2));
//    }
//}

// Sorting the List

public class ListArrayListPractice {

    public static void main(String[] args) {
        List<String> fruitList = new ArrayList<>();
        fruitList.add("Mango");
        fruitList.add("Banana");
        fruitList.add("Apple");
        fruitList.add("Strawberry");

        Collections.sort(fruitList);
        System.out.println(fruitList);
    }
}





