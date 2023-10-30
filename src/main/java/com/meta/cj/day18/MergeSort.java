package com.meta.cj.day18;

import java.util.Arrays;

public class MergeSort {

    public static void main(String[] args) {
        int[] arr = new int[]{1,23,12,7,9,26,11,13};

        mergeSort(arr);
        System.out.println(Arrays.toString(arr));

    }

    private static void mergeSort(int[] arr){

        int length = arr.length;
        if(length < 2){
            return;
        }
        int mid = length/2;

        int[] left = new int[mid];
        int[] right = new int[length - mid];

        System.arraycopy(arr, 0, left, 0, mid);
        if (length - mid >= 0) System.arraycopy(arr, mid, right, 0, length - mid);

        mergeSort(left);
        mergeSort(right);

        merge(arr,left,right);
    }

    private static void merge(int[] arr,int[] left, int[] right ) {
        int leftSize = left.length;
        int rightSize = right.length;

        int i =0, j=0, k=0;

        while(i < leftSize && j < rightSize){
            if(left[i] <= right[j]){
                arr[k] = left[i];
                i++;
            }else{
                arr[k] = right[j];
                j++;
            }
            k++;
        }
        while( i< leftSize ){
            arr[k] = left[i];
            i++;
            k++;
        }
        while( j < rightSize){
            arr[k] = right[j];
            j++;
            k++;
        }


    }

}
