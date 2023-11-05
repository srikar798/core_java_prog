package com.meta.cj.day20;

import java.util.concurrent.ThreadLocalRandom;

class C1{
    public void show1(){
        System.out.println("C1");
    }
}

class C2 extends C1{
    @Override
    public void show1(){
        System.out.println("C2");
    }
    public void show1(int num){
        System.out.println("C2 of show1 with num");
    }
    public void show2(){
        System.out.println("C2");
    }
}

class C3 extends C1 {
    public void show1() {
        System.out.println("C3");
    }
    public void show1(int num){
        System.out.println("C3 of show1 with num");
    }
    public void show2(){
        System.out.println("C3");
    }
}
public class OverrideExample {

    public static void main(String[] args) {
        C1 obj = getInstance();
        if( obj instanceof C2 ref) {
            ref.show1();
            ref.show1(10);
            ref.show2();
        } else if (obj instanceof C3 ref) {
            ref.show1();
            ref.show1(10);
            ref.show2();
        }
    }

    private static C1 getInstance(){
        int num = ThreadLocalRandom.current().nextInt(1,10);
        if(num % 2 == 0 ){
            return new C2();
        }else{
            return new C3();
        }
    }
}
