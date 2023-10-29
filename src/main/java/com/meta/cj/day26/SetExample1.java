package com.meta.cj.day26;

import java.util.*;

public class SetExample1 {

    public static void main(String[] args) {

        List<String> list = List.of("Java","Python","C#","JavaScript","Java","Python","Java");

        List<String> uniqueList = new ArrayList<>();
        for(String ele:list){
            if(!uniqueList.contains(ele))
                uniqueList.add(ele);
        }
        System.out.println(uniqueList);
        System.out.println("-".repeat(40));
        Set<String > uniqueNames = new HashSet<>(list);
        System.out.println(uniqueNames);
        System.out.println("-".repeat(40));
        uniqueNames.forEach(System.out::println);
        System.out.println("-".repeat(40));
        for(String i : uniqueNames)
            System.out.println(i);
        System.out.println("-".repeat(40));

        Iterator<String> itr = uniqueNames.iterator();
        while(itr.hasNext()){
            String name = itr.next();
            System.out.println(name);
        }

        uniqueNames.add("PHP");
        uniqueNames.addAll(List.of("Java","Python","Ruby"));
        System.out.println(uniqueNames);
    }
}
