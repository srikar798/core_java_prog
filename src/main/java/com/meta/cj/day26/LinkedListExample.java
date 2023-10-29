package com.meta.cj.day26;

import java.util.LinkedList;

public class LinkedListExample {

    public static void main(String[] args) {

        LinkedList<String> list = new LinkedList<>();
        list.add("Java");
        list.add("Python");
        list.add("C#");
        list.add("JavaScript");
        System.out.println(list.getFirst());
        System.out.println(list.getLast());
        list.addFirst("Rust");

        System.out.println(list);

    }
}
