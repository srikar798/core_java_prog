package com.meta.cj.day28;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class MapExample3 {
    public static void main(String[] args) {

        Map<String, Integer> ageMap = new HashMap<>();
        ageMap.put("Krish", 30);
        ageMap.put("Manoj", 25);
        ageMap.put("Charan", 28);
        ageMap.put("Rama", 35);

        ageMap.putIfAbsent("RK",33);

        System.out.println(ageMap);

        Set<Map.Entry<String,Integer>> entrySet = ageMap.entrySet();
        System.out.println(entrySet);

        Set<String > keys = ageMap.keySet();
        for(String key:keys){
            Integer value = ageMap.get(key);
            if(value > 30){
                value++;
                ageMap.put(key,value);
            }
        }
        System.out.println(entrySet);
     }
}
