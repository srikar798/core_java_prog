package com.meta.cj.day24;

import java.io.FileNotFoundException;
import java.io.IOException;


class E1Exception extends Exception {

}

class E2Exception extends E1Exception{

}
class E3Exception extends E2Exception{

}
class One{
    void m1(){
        System.out.println("m1");
    }
    void m1(int a) throws E1Exception {
        System.out.println("m1 with one argument");
    }
    void m1(int a, int b){
        System.out.println("m1 with two arguments");
    }
}

class Two extends One{
    public void m1(){

        System.out.println("Class two of m1");

    }

    void m1(int a) throws E3Exception {
        System.out.println("Class two of m1");
    }
}
public class OverRidingVsOverLoading {
}
