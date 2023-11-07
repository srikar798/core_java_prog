package com.meta.cj.day20;

class A{
    int a = 100;
    A(int num){
        super();
        System.out.println("A");
    }
    public void show(){
        System.out.println(a);
    }
}
class B extends A{
    int a = 20;
    B(){
        super(10);
        System.out.println("B");
    }
    public void show(){
        System.out.println(a);
        System.out.println(super.a);
    }
}
public class SuperManager {



    public static void main(String[] args) {
        A obj = new B();

        obj.show();

    }
}
