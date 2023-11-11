package com.junit;

import java.util.Arrays;

public class AnagramExample {

    public boolean isAnagram(String str1,String str2){
        if(str1 == null || str2 == null){
            return false;
        }
        if(str2.length() != str2.length()){
            return false;
        }
        str1 = str1.toLowerCase();
        str2 = str2.toLowerCase();
        char[] arr1 = str1.toCharArray();
        char[] arr2 = str2.toCharArray();
        Arrays.sort(arr1);
        Arrays.sort(arr2);
        return Arrays.equals(arr1,arr2);
    }
}
