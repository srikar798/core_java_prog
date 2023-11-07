package com.meta.cj.day24;

public class ExceptionExample1 {

    public static void main(String[] args) {
        System.out.println("Main started");
        int[] arr = { 1,2,3,4,5};
        try{
            System.out.println(arr[arr.length]);
        }catch (ArrayIndexOutOfBoundsException e){
            e.printStackTrace();
            System.out.println(e.getCause());
            System.out.println(e.getMessage());
        }catch (NullPointerException e){
            e.printStackTrace();
        }
        System.out.println("Main Ended");
    }
}
