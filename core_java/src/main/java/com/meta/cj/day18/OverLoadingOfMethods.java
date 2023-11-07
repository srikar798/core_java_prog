package com.meta.cj.day18;

//same method name with different parameters arguments is method overloading
public class OverLoadingOfMethods {
    public int add(int a, int b){
        return a+b;
    }

    public int add(int a,int b, int c){
        return a+b+c;
    }

    public  float add(float a, float b){
        return a+b;
    }

    public  double add(double a, double b){
        return a+b;
    }

    public static void main(String[] args) {
        OverLoadingOfMethods obj = new OverLoadingOfMethods();
        int res = obj.add('a','b');   // char -> int -> float/long/double   (lower datatype can be converted to higher datatype)
        System.out.println(res);
    }
}
