package com.meta.cj.day16;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class PassByValueAndPassByReference {

    public static void main(String[] args) {
        int a = 10;
        int b = 20;
        int[] arr = { 1,2,3,4,5};
        swap(a,b);
        System.out.println("a value is " + a + " b value is " + b);
        System.out.println(Arrays.toString(arr));
        increment(arr);
        System.out.println(Arrays.toString(arr));

        List<String> list = new ArrayList<>();
        list.add("Krish");
        list.add("Manoj");
        list.add("Charan");
        list.add("Tanvi");
        System.out.println(list);
        removeElement(list,"Manoj");
    }

    private static void increment(int[] arr){
        for(int i= 0; i< arr.length ; i++){
            arr[i] = arr[i] + 1 ;
        }
        System.out.println(Arrays.toString(arr));
    }
    private static void swap(int x , int y){
        System.out.println("a value before swap is " + x + " and b value is " + y);
        int temp = x;
        x = y;
        y = temp;
        System.out.println("a value after swap is " + x + " and b value is " + y);
    }

    private static void removeElement(List<String> arr, String str){
        arr.remove(str);
        arr.add("Hello");
        System.out.println(arr);
    }
}
