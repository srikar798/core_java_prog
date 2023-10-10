package com.meta.cj.day16;

import  java.io.PrintStream;
class Lwl{
    public static final PrintStream out = System.out;
}
public class StaticMethodExample {
    public static void main(String[] args) {


        Lwl.out.print("Hello");
    }
}
