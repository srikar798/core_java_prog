package com.meta.cj.day18;

import java.util.Arrays;

public class SearchingAndSortingAssignment {

    // Bubble sort, Quick sort, Merge sort, Insertion sort, Selection sort
    public int[] bubbleSort(int[] arr) {

        boolean swapped;
        int swap;
        for (int i = 0; i < arr.length - 1; i++) {
            swapped = false;
            for (int j = 0; j < arr.length - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    swap = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = swap;
                    swapped = true;
                }
            }
            if (!swapped) {
                break;
            }
        }
        return arr;
    }

    public int[] mergeSort(int[] arr){
        return null;
    }
    public int linearSearch(int[] arr,int ele){
        return -1;
    }
    public int binarySearch(int[] arr,int ele){
        return -1;
    }

    public static void main(String[] args) {
        // Code to test your methods
        int[] arr = new int[]{1,23,12,7,9,26,11};

        SearchingAndSortingAssignment sort = new SearchingAndSortingAssignment();
        int[] sortedArray = sort.bubbleSort(arr);
        System.out.println(Arrays.toString(sortedArray));
    }
}
