package com.meta.cj.day10;

import java.util.Arrays;

public class ArrayExample {

    public static void main(String[] args) {

        int[] arr = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15};

        int[] temp = new int[5];
        System.arraycopy(arr,5,temp,0,5);

        System.out.println(Arrays.toString(temp));

    }
}
