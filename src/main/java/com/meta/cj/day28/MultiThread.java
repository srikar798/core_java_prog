package com.meta.cj.day28;

public class MultiThread {

    public static void main(String[] args) {

        for(int i = 0; i <= 3; i++){
            MultiThreadExample multiThread = new MultiThreadExample(i);
            Thread myThing = new Thread(multiThread);
            myThing.start();
        }


    }
}
