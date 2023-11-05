package com.meta.cj.day18;

import java.util.Arrays;

public class SearchingAndSortingAssignment {

    // Bubble sort, Quick sort, Merge sort, Insertion sort, Selection sort

    private static int[] quickSort(int[] arr){
        quickSort(arr,0, arr.length -1);
        return arr;
    }
    private static int[] quickSort(int[] arr, int low, int high){
        if(low >= high){
            return arr ;
        }
        int pivot = arr[high];
        int l = low;
        int r = high -1;
        while(l < r){
            while(arr[l] < pivot && l <= r){
                l++;
            }
            while(arr[r] > pivot && l <= r){
                r--;
            }
            swap(arr,l, r);
        }
        swap(arr,l,high);

        quickSort(arr,low,l-1);
        quickSort(arr,l+1,high);

        return arr;
    }

    public int binarySearch(int[] arr, int ele) {
        int left = 0;
        int right = arr.length - 1;

        while (left <= right) {
            int mid = left + (right - left) / 2;

            if (arr[mid] == ele) {
                return mid; // Element found, return its index
            }

            if (arr[mid] < ele) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }

        return -1; // Element not found
    }





    private static void swap(int[] arr, int l, int r) {

        int temp = arr[l];
        arr[l] = arr[r];
        arr[r] = temp;
    }

    public int[] bubbleSort(int[] arr) {

        boolean swapped;
        int swap;
        for (int i = 0; i < arr.length - 1; i++) {
            swapped = false;
            for (int j = 0; j < arr.length - 1 - i; j++) {
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
        for (int i = 0; i < arr.length; i++){
            if(arr[i] == ele){
                return i;
            }
        }
        return -1;
    }


    public static void main(String[] args) {
        // Code to test your methods
        int[] arr = new int[]{1,23,12,7,9,26,11,13};
        int[] arr1 = new int[]{1,23,12,7,9,26,11,15};
        int[] arr2 = new int[]{1,23,12,7,9,26,11,15};

        SearchingAndSortingAssignment sort = new SearchingAndSortingAssignment();
        int[] sortedArray = sort.bubbleSort(arr);

       // int[] quicksort = quickSort(arr1);

       // System.out.println(Arrays.toString(quicksort));

        System.out.println("-".repeat(50));
        System.out.println(Arrays.toString(sortedArray));

        System.out.println(sort.binarySearch(sortedArray,12));

        System.out.println(sort.linearSearch(arr1,9));
    }
}
