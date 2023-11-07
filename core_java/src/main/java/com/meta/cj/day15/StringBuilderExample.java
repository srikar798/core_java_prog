package com.meta.cj.day15;

public class StringBuilderExample {

    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("ABC12");
        sb.append("XYZ");
        System.out.println(sb);
        sb.reverse();
        System.out.println(sb);
        String str = "madam";
        String str1 = "madam";
        System.out.println(isPalindrome(str));
        System.out.println(str.equals(str1));
    }

    public static boolean isPalindrome(String str){
        return new StringBuilder(str).reverse().toString().equals(str);
    }
}
