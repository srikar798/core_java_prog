package com.meta.cj.day26;

import java.util.ArrayList;
import java.util.List;

public class JavaStreamExample {

    public static void main(String[] args) {


        List<Integer> list = new ArrayList<>();
        list.addAll(List.of(1,2,3,4,5,6,7,8,9,10));

        double sum = list.stream()
                .mapToInt(e -> e)
                .sum();

        System.out.println(sum);

        List<Integer> newList = list.stream().map(e ->e * e).toList();

        System.out.println(newList);

        List<Integer> list1 = list.stream().filter( i -> (i % 3 == 0)).map(i ->(i*2)).toList();

        System.out.println(list1);


    }
}
