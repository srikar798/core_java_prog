package com.meta.cj.day10;

public class ArrayOperations {

    public static void main(String[] args) {

    }

    // if key is present in the arr, it should return index otherwise -1
    private static int getIndexOf(int[] arr, int key) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == key) {
                return i;
            }
        }
        return -1;
    }

    private static boolean isAllElementsPresent(int[] arr, int key1, int key2, int key3) {
        return getIndexOf(arr, key1) != -1 && getIndexOf(arr, key2) != -1 && getIndexOf(arr, key3) != -1;
    }

    private static boolean isSubSet(int[] bigArr, int[] smallArr) {
        for (int ele : smallArr) {
            if (getIndexOf(bigArr, ele) == -1) {
                return false;
            }
        }
        return true;
    }

    private static boolean isPalindrome(int[] arr) {
        for (int i = 0, j = arr.length - 1; i < j; i++, j--) {
            if(arr[i] != arr[j]){
                return  false;
            }
        }
        return true;
    }
}
