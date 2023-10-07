package com.meta.cj.day12;

import java.util.ArrayList;
import java.util.List;

public class ListExample {

    public static void main(String[] args) {

        List<String> names = new ArrayList<>();

        names.add("Krish");
        names.add("Manoj");
        names.add("Charan");
        names.add("Tanvi");
        names.add("Aadhya");

        for (int i = 0; i < names.size(); i++) {
            String name = names.get(i);
            System.out.println(name);
        }

        // for each loop

        for (String name : names) {
            System.out.println(name);
        }

        // size returns the number of elements in the list

        System.out.println(names.isEmpty());
        System.out.println(names.size());
        System.out.println(names.get(2));
        System.out.println(names.indexOf("Tanvi"));
        System.out.println(names.remove("Tanvi"));
        names.set(0, "Krishna");
        System.out.println(names);
    }
}
