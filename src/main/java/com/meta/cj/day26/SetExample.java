package com.meta.cj.day26;

import java.util.HashSet;
import java.util.Set;

public class SetExample {
    public static void main(String[] args) {


        Set<Integer> set = new HashSet<>();
        set.add(10);
        set.add(20);
        set.add(30);
        set.add(10);
        System.out.println(set);
    }
}
