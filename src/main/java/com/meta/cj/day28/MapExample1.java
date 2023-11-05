package com.meta.cj.day28;

import lombok.Value;

import java.security.Key;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.Vector;

public class MapExample1 {


    public static void main(String[] args) {

        Map<Integer,String> map = new HashMap<>();
        map.put(1001,"Krish");
        map.put(1002,"Manoj");
        map.put(1003,"Charan");
        map.put(1004,"Ram");

        System.out.println(map.keySet());
        Set<Integer> keys = map.keySet();
        for(Integer k : keys){
            System.out.println(k+ " : "+map.get(k));
        }
        System.out.println("-".repeat(50));

        System.out.println(map.values());

        System.out.println("-".repeat(50));

        Set<Map.Entry<Integer,String>> entrySet = map.entrySet();
        System.out.println(entrySet);
        System.out.println("-".repeat(50));

        map.forEach((key, value)->System.out.println(key + " : " + value));

    }
}
