package com.meta.cj.day16;

class One{
    final void perform(int a, int b){
        int re = a+b;
        System.out.println(re);
    }
}

class Two extends One{

}

final class C1{
    public void m1(){
        System.out.println("M1 method");
    }
    public void M2(){
        System.out.println("M2 method");
    }
}

class C2 {
    public void m1(){
        System.out.println("M1 method");
    }
    public void m3(){
        System.out.println("M3 method");
    }
}
public class FinalMethodExample {
    public static void main(String[] args) {

    }

}
