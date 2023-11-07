package com.meta.cj.day27;

import java.util.HashSet;
import java.util.Set;

public class SetExampleWithLinkedHashSet {

    public static void main(String[] args) {

        Set<String> set = new HashSet<>();
        set.add("Java");
        set.add("Python");
        set.add("C#");
        set.add("JavaScript");
        set.add("Java");
        set.add("PHP");

        System.out.println(set);

    }
}
