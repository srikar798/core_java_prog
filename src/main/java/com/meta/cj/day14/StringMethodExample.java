package com.meta.cj.day14;

import java.util.ArrayList;
import java.util.List;

public class StringMethodExample {

    public static void main(String[] args) {

        String name = "ABC1CBA";
        for(int i =0; i< name.length()-1;i++){
            char ch = name.charAt(i);
            System.out.println(ch);
        }

        System.out.println(name.length());
        System.out.println(isPalindrome(name));
        System.out.println(name.substring(2,5));

        String names = "Ravi,Srikar,Roopa,Sai,SS";
        String[] arr = names.split(",");
        for( String i : arr) {
            if (i.length() > 3) {
                System.out.println(i.substring(0, 3));
            }else{
                System.out.println(i);
            }
        }
        String str = "ABCDEFG";
        System.out.println(subStringList(str,4));
        String h = "Hello ";
        System.out.println(h.trim().length());


    }

    private static List<String> subStringList(String str, int n){
        List<String> list = new ArrayList<>();
        for(int i = 0; i<=str.length()-n; i++){
            list.add(str.substring(i,i+n));
        }
        return list;
    }

    private static boolean isPalindrome(String x){

        for(int i = 0, j =x.length()-1;i<j;i++,j--){
            if(x.charAt(i) != x.charAt(j)){
                return false;
            }
        }
        return true;
    }
}
