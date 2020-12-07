package com.practice;

import java.util.*;

public class CollectionsPractice {

    public static void main(String[] args){

        List arrayList= new ArrayList();
        arrayList.add("rohit");
        arrayList.add("surbhi");
        System.out.println(arrayList);

        List linkedList= new LinkedList();
        linkedList.add("rohit");
        linkedList.add("surbhi");
        System.out.println(arrayList);

        Set hashSet= new HashSet();
        hashSet.add("rohit");
        hashSet.add("surbhi");
        System.out.println(hashSet);


        Map map= new HashMap();
        map.put("rohit", 28);
        map.put("surbhi",27);
        System.out.println(map);

    }
}
