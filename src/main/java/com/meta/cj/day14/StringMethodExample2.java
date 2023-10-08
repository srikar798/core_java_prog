package com.meta.cj.day14;

import java.util.ArrayList;
import java.util.List;

public class StringMethodExample2 {

    public static void main(String[] args) {
        List<String> names = List.of("Krish","Manoj","Charan","Superman","Tanvi","Sai","Manoj","Charan");

        System.out.println("Hello".toLowerCase().contains("he".toLowerCase()));

        for(String name : names) {
            if (name.toLowerCase().contains("man")) {
                System.out.println(name);
            }
        }

        String str = "Raj";
        System.out.println(str.concat(" Kumar"));
        System.out.println(str);
        str = str.concat(" Kumar");
        System.out.println(str);
    }
}
