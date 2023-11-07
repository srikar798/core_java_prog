package com.meta.cj.day10;

import java.util.Arrays;

class CustomArray {

    private int[] arr;
    private final int INIT_SIZE = 3;
    private int count = 0;

    CustomArray() {
        arr = new int[INIT_SIZE];
    }

    public void addElement(int ele) {
        if (count == arr.length) {
            int[] temp = new int[arr.length + 3];
            System.arraycopy(arr, 0, temp, 0, arr.length);
            arr = temp;
        }
        arr[count++] = ele;
    }

    public void remove(int ele) {
        int index = indexOf(ele);
        if (index != -1) {
            if(index == 0){
                int[] temp = new int[arr.length-1];
                System.arraycopy(arr,1,temp,0,arr.length-1);
                arr = temp;
                count--;
            }else{
                int[] l = new int[index];
                int[] r = new int[arr.length-index-1];
                System.arraycopy(arr,0,l,0,index);
                System.arraycopy(arr,index+1,r,0,arr.length-index-1);
                int[] temp = new int[arr.length-1];
                System.arraycopy(l,0,temp,0,l.length);
                System.arraycopy(r,0,temp,l.length,r.length);
                arr = temp;
                count--;
            }
        }
    }
    public void addElement(int index,int ele){
        //TODO
    }

    private int indexOf(int ele) {
        if (count == 0) {
            return -1;
        }
        for (int i = 0; i < count; i++) {
            if (arr[i] == ele) {
                return i;
            }
        }
        return -1;
    }

    public void showArrayElements() {
        int[] temp = new int[count];
        System.arraycopy(arr, 0, temp, 0, count);
        System.out.println(Arrays.toString(temp));
    }
}

public class DynamicMemoryAllocation {

    public static void main(String[] args) {

        CustomArray obj = new CustomArray();
        obj.addElement(10);
        obj.addElement(20);
        obj.addElement(30);
        obj.addElement(50);
        obj.addElement(60);
        obj.addElement(70);
        obj.addElement(80);
        obj.addElement(90);
        obj.addElement(100);
        obj.showArrayElements();
        obj.addElement(110);
        obj.addElement(120);
        obj.showArrayElements();
        obj.remove(120);
        obj.remove(10);
        obj.addElement(120);
        obj.showArrayElements();
        obj.addElement(0,10);
    }
}
