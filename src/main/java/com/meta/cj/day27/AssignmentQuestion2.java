package com.meta.cj.day27;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class AssignmentQuestion2 {

    public static void main(String[] args) {

        List<String> CS = List.of("KVR","NVR","GVR","ALN","PKM","MKR");
        List<String> IS = List.of("KVR","NVR","KRS","TRS","MKR");
        List<String> EC = List.of("KVR","NVR","MVG","MDG","MKR");

        // All unique names from all the lists

        Set<String> uniqueNames = new HashSet<>();
        uniqueNames.addAll(CS);
        uniqueNames.addAll(IS);
        uniqueNames.addAll(EC);

       // Set<String> uniqueNames = Stream.of(CS,IS,EC).flatMap(List::stream).collect(Collectors.toSet());
        uniqueNames.forEach(System.out::println);
        System.out.println("-".repeat(100));
        // Get names who are working in all the departments

        Set<String> allDept = CS.stream().filter(IS::contains).filter(EC::contains).collect(Collectors.toSet());
        allDept.forEach(System.out::println);
        System.out.println("-".repeat(100));
        // Get names who are working for only one department

        List<String> allNames = new ArrayList<>();
        allNames.addAll(IS);
        allNames.addAll(CS);
        allNames.addAll(EC);
        List<String> onlyOneDept = uniqueNames.stream().filter(e-> Collections.frequency(allNames,e) ==1).toList();
        System.out.println(onlyOneDept);

    }
}
