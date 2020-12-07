package com.practice;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class SetPractice {
    public static void main(String[] args)
    {
        // Set demonstration using HashSet
        Set<String> hash_Set
                = new HashSet<String>();

        hash_Set.add("Geeks");
        hash_Set.add("For");
        hash_Set.add("Geeks");
        hash_Set.add("Example");
        hash_Set.add("Set");

        System.out.println(hash_Set);

        //Iterating through Set

        for(String element: hash_Set){
            System.out.println(element);
        }

        Iterator<String> itr= hash_Set.iterator();
        while(itr.hasNext()){
            System.out.println(itr.next());
        }


    }
}

//public class SetPractice {
//    public static void main(String[] args)
//    {
//        // Set demonstration using HashSet
//        Set<Integer> set1= new HashSet<Integer>();
//        set1.addAll(Arrays.asList(new Integer[] {1,2,3,4,5,6}));
//        Set<Integer> set2= new HashSet<Integer>();
//        set2.addAll(Arrays.asList(new Integer[] {5,2,3,4,6,7}));
//
//        Set<Integer> union= new HashSet<>(set1);
//        union.addAll(set2);
//        System.out.println(union);
//
//        // To find intersection
//        Set<Integer> intersection = new HashSet<Integer>(set1);
//        intersection.retainAll(set2);
//        System.out.print("Intersection of the two Set");
//        System.out.println(intersection);
//
//        // To find the symmetric difference
//        Set<Integer> difference = new HashSet<Integer>(set1);
//        difference.removeAll(set2);
//        System.out.print("Difference of the two Set");
//        System.out.println(difference);
//    }
//}
//
