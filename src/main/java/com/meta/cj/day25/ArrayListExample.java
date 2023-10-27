package com.meta.cj.day25;

import org.apache.commons.collections4.CollectionUtils;

import java.util.ArrayList;
import java.util.List;

public class ArrayListExample {

    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();

        list.add(40);
        list.add(30);
        list.add(0,10);
        list.add(1,20);
        System.out.println(list.size());
        System.out.println(list.isEmpty());
        System.out.println(CollectionUtils.isEmpty(list));
        System.out.println(list);
    }
}
