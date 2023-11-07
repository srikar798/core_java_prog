package com.meta.cj.day18;

public class RecursiveExample {
    public int gcd(int num1,int num2){
        if(num1 == num2){
            return num1;
        }
        while(num1 != num2){
            if(num1 > num2){
                num1 = num1 - num2;
            }else {
                num2 = num2 - num1;
            }
        }
        return num1;
    }

    public int gcdWithRecursion( int num1, int num2){
        if (num1 == num2){
            return num1;
        }

            if(num1 > num2){
                return gcd(num1-num2, num2);
            }else{
                return gcd(num1 , num2-num1);
            }

    }
    public static void main(String[] args) {
        RecursiveExample obj = new RecursiveExample();
        int n = obj.gcdWithRecursion(18,24);
        System.out.println(n);
        int n1 = obj.gcd(18,24);
        System.out.println(n1);
    }
}
