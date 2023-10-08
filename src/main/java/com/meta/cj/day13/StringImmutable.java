package com.meta.cj.day13;

import org.w3c.dom.ls.LSOutput;

public class StringImmutable {
    public static void main(String[] args) {


        String name1 = "Java";
        String name2 = "Java";
        String name3 = new String("Java");
        String name4 = new String("Java");

        System.out.println(name1 == name2);

        System.out.println(name3 == name4);
        System.out.println(name3.equals(name2));
    }
}
