package com.meta.cj.day12;

import java.util.ArrayList;
import java.util.List;

public class ListMethods {

    public static void main(String[] args) {

        String names1 = "Krish,Manoj,Charan,Tanvi,Aadhya,Ayush,Aradhaya";
        String names2 = "Balu,Manoj,Charan,Tanvi,Aadhya,Kiran,Aptha";

        String[] arr1 = names1.split(",");
        String[] arr2 = names2.split(",");

        String[] arr3 = new String[arr1.length + arr2.length];
        System.arraycopy(arr1, 0, arr3, 0, arr1.length);
        System.arraycopy(arr2, 0, arr3, arr1.length, arr2.length);

        List<String> uniqueNames = getUniqueNames(arr3);
        System.out.println(uniqueNames);
    }
    private static List<String> getUniqueNames(String[] arr3) {
        List<String> list = new ArrayList<>();
        for(String name:arr3){
            if(!list.contains(name)){
                list.add(name);
            }
        }
        return list;
    }

}
