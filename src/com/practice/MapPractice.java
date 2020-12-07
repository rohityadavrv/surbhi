package com.practice;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class MapPractice {

    public static void main(String[] args){
        Map<String, Integer> map= new HashMap<String, Integer>();

        map.put("Rohit",28);
        map.put("Surbhi", 26);
        map.put("Aasas", 23);
        System.out.println(map);

        for(Map.Entry<String,Integer> me : map.entrySet()){
            System.out.print(me.getKey()+ ":");
            System.out.println(me.getValue());
        }

        map.remove("Aasas");
        System.out.println(map);

        for ( String i : map.keySet()) {
            System.out.println(i);
        }

        for (int i : map.values()) {
            System.out.println(i);
        }

    }

}

//public class MapPractice {
//
//    public static void main(String[] args){
//        Map map=new HashMap();
//        //Adding elements to map
//        map.put(1,"Amit");
//        map.put(5,"Rahul");
//        map.put(2,"Jai");
//        map.put(6,"Amit");
//
//
//        //Traversing Map
//        Set set=map.entrySet();
//        System.out.println(set);
//
//        Iterator itr= set.iterator();
//
//        while(itr.hasNext()){
//            //Converting to Map.Entry so that we can get key and value separately
//            Map.Entry entry=(Map.Entry)itr.next();
////            System.out.println(itr.next());
//            System.out.println(entry.getKey()+ ""+ entry.getValue());
//
//
//        }
//
//        map.remove("Aasas");
//        System.out.println(map);
//
//    }
//
//}