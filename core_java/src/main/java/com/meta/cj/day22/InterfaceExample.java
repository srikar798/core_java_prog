package com.meta.cj.day22;

interface One{
    void m1();

}

interface Two{
    void m2();
}

interface Three{
    void m1();
    void m2();
    void m3();
}

interface Four extends One,Two,Three{

}
class CLS1 implements Four{
    @Override
    public void m1() {
        System.out.println("m1");
    }

    public void m2(){
        System.out.println("m2");
    }

    @Override
    public void m3() {
        System.out.println("m3");
    }
}
public class InterfaceExample {

    public static void main(String[] args) {
        CLS1 one = new CLS1();
        one.m1();
    }
}
