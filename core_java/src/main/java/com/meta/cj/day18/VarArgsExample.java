package com.meta.cj.day18;

// Var args (data_type... var)
// 1. Var args should be last parameter
// 2. Var args should be only one in a method
public class VarArgsExample {

    public  int add(int a, int b){
        return a+b;
    }
    public int add(int a, int b, int c){
        return a+b+c;
    }
    public int add(int a, int b, int c,int d){
        return a+b+c+d;
    }


    public int add(int... a){
        int sum = 0;
        for (int ele : a){
            sum += ele;
        }
        return sum;
    }

    public static void main(String[] args) {
        VarArgsExample obj = new VarArgsExample();
        int sum = obj.add(10,20,30,40,50);
        System.out.println(sum);
    }
}
