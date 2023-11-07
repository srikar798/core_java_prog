package com.meta.cj.day18;

import java.util.ArrayList;
import java.util.List;

public class MethodExamples {

    public List<String> getUniqueNames(List<String> names){
        List<String> uniqueNames = new ArrayList<>();
        for (String name : names){
            if(!uniqueNames.contains(name)){
                uniqueNames.add(name);
            }
        }
        return uniqueNames;
    }

    public static List<String> convertToUpperCase(List<String> names){
        List<String> upperCaseNames = new ArrayList<>();
        for(String name : names){
            upperCaseNames.add(name.toUpperCase());
        }
        return upperCaseNames;
    }

    public static void main(String[] args) {

        List<String> names = List.of("Krish","Manoj","Sai","Tanvi","Srikar","Sai","Krish");
        MethodExamples obj = new MethodExamples();
        List<String> uniqueNames = obj.getUniqueNames(names);
        System.out.println(uniqueNames);
        List<String> upperCaseNames = MethodExamples.convertToUpperCase(uniqueNames);
        System.out.println(upperCaseNames);


    }
}
