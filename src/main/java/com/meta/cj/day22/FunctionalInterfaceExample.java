package com.meta.cj.day22;

// What is functional interface ?
// ans: An interface with only one abstract method is called functional interface

import com.meta.cj.day21.iplstats.JsonUtil;

// What is the use of functional interface?
// ans: To use lambda expression
@FunctionalInterface
interface I1{
    void m1();
    default void m2(){
        System.out.println("I1 m2");
    }
}

// Interface without any abstract method is called marker interface
interface I2{

}

class Outer{
    int a = 10;
    class Inner{
        void show(){
            System.out.println(a);
        }
    }
}

class Outer1{
    static int a = 10;
    class Inner1{
        void show(){
            System.out.println(a);
        }
    }
}

class Outer2{
    int a = 10;
    void show(){
        class Inner2{
            void show(){
                System.out.println(a);
            }
        }
        Inner2 obj = new Inner2();
        obj.show();
    }
}
interface Operator {
    int perform(int a, int b);
}


public class FunctionalInterfaceExample {

    // Inner class
    //1. Static inner class
    //2. Non static inner class
    //3. Anonymous inner class
    //4. Local inner class
    public static void main(String[] args) {


        Operator obj = new Operator() {
            @Override
            public int perform(int a, int b) {
                return a + b;
            }
        };

        Operator obj1 = (a,b) -> a * b;  // lambda expression
        System.out.println(obj.perform(10,12));
        System.out.println(obj1.perform(10, 3));
    }
}
