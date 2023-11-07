package com.meta.cj.day20;


abstract class ACls1 {
    public abstract void m1();

    public abstract void m2();

    public abstract void m3();

    public abstract void m4();
}

abstract class ACls2 extends ACls1 {
    @Override
    public void m1() {
        System.out.println("m1");
    }

    @Override
    public void m2() {
        System.out.println("m2");
    }

}

class ACls3 extends ACls2 {
    @Override
    public void m3() {
        System.out.println("m3");
    }

    @Override
    public void m4() {
        System.out.println("m4");
    }

}

public class AbstractExample {

    public static void main(String[] args) {
        ACls3 obj = new ACls3();
        obj.m1();
    }
}

