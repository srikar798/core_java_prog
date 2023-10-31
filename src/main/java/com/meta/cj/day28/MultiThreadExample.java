package com.meta.cj.day28;

public class MultiThreadExample implements Runnable{


    private final int threadNumber;
    public MultiThreadExample(int threadNumber){
        this.threadNumber = threadNumber;
    }
    @Override
    public void run() {
        for(int i =1 ; i <= 5; i++){

                System.out.println(i + " thread number " + threadNumber);
            try {
                Thread.sleep(1000);
            }catch (InterruptedException ignored){

            }
        }
    }
}
