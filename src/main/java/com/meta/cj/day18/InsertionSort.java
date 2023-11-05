package com.meta.cj.day18;

import java.util.Arrays;

public class InsertionSort {

    public static void main(String[] args) {
        int[] arr = new int[]{1,23,12,7,9,26,11,13};
        insertSort(arr);
        System.out.println(Arrays.toString(arr));
    }

    private static void insertSort(int[] arr){

        for(int i = 1; i< arr.length; i++){
            int current = arr[i];
            int j = i -1;
            while( j >= 0 && arr[j] > current){
                arr[j+1] = arr[j];
                j--;
            }
            arr[j+1] = current;
        }

    }
}
