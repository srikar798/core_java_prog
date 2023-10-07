package com.meta.cj.day10;

import java.util.Arrays;

public class ArrayMethods {

    public static void main(String[] args) {

        int[] arr1 = {1, 3, 4, 5, 7, 8, 9, 6};
        Arrays.sort(arr1);
        System.out.println(Arrays.toString(arr1));
        int[] arr2 = {1, 3, 4, 5, 6, 7, 8, 9};
        System.out.println(Arrays.equals(arr1,arr2));
    }
}
