package com.meta.cj.day25;

import java.util.ArrayList;
import java.util.List;

public class ListMethodsExample {

    public static void main(String[] args) {

        List<Integer> list1 = new ArrayList<>();
        list1.add(30);
        list1.add(40);
        List<Integer> list2 = new ArrayList<>();
        list2.add(10);
        list2.add(20);

        list1.addAll(0,list2);
        System.out.println(list1);

        List<Integer> list3 = new ArrayList<>();
        list3.add(10);
        list3.add(50);

        System.out.println(list1.containsAll(list3));

        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(10);

        //Auto boxing and unboxing 1.5

        list.remove(Integer.valueOf(10) );
        System.out.println(list);
    }
}
