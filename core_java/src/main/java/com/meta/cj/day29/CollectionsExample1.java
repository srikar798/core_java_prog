package com.meta.cj.day29;

import java.util.*;

public class CollectionsExample1 {
    public static void main(String[] args) {

        List<String> names = new ArrayList<>();
        names.add("KVR");
        names.add("NVR");
        names.add("GVR");
        names.add("ALN");
        names.add("PKM");
        names.add("MKR");

        /*Comparator<String> c = new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return ((String)o2).compareTo((String) o1);
            }
        };*/
        //Comparator<String> c = (e1,e2)-> e2.compareTo(e1);

        names.sort(Comparator.reverseOrder());
        //names.sort((e1,e2)-> e2.compareTo(e1));

        List<String> sortedList = names.stream().sorted(Comparator.reverseOrder()).toList();
        System.out.println(sortedList);

        System.out.println(names);
    }
}
