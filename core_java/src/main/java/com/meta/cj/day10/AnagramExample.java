package com.meta.cj.day10;

import java.util.Arrays;

public class AnagramExample {

        // cat , tac, cat
        public static void main(String[] args) {

                String str1 = "CAT";
                String str2 = "TBC";
                if(isAnagram(str1, str2)){
                    System.out.println("Given strings are anagrams");
                }else{
                    System.out.println("Given strings are not anagrams");
                }


        }
        private static boolean isAnagram(String str1,String str2){
            if(str1.length() != str2.length()){
                return false;
            }
            char[] arr1 = str1.toCharArray();  // { 'C', 'A' , 'T'} => {'A', 'C' , 'T'}
            char[] arr2 = str2.toCharArray();  // { 'T', 'A', 'C'} =>  {'A', 'C', 'T'}
            Arrays.sort(arr1);
            Arrays.sort(arr2);
            return Arrays.equals(arr1, arr2);

        }
}
