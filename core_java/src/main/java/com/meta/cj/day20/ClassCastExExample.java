package com.meta.cj.day20;

class CL1 {
    public void show1() {
        System.out.println("CL1");
    }
}

class CL2 extends CL1 {
    public void show2() {
        System.out.println("CL2");
    }
}
public class ClassCastExExample {

    public static void main(String[] args) {


        CL1 obj = new CL2();
        if(obj instanceof CL2 ref) {
            ref.show1();
            ref.show2();
        }
    }
}
