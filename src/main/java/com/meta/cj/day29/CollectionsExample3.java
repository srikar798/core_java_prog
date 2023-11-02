package com.meta.cj.day29;

import java.util.Map;

public class CollectionsExample3 {


    public static void main(String[] args) {

        Map<Integer,String> map1 = Map.of(1008,"Krish",1007,"Manoj",1003,"Charan",1004,"Tanvi",1005,"Manoj");

        map1.keySet().stream().sorted().forEach(key-> System.out.println(key + " -> " + map1.get(key)));

        Map<Integer,String> map2 = Map.of(1008,"Krish",1007,"Manoj",1003,"Charan",1004,"Tanvi",1005,"Manoj");
        System.out.println(map1.keySet().containsAll(map2.keySet()));
    }
}
