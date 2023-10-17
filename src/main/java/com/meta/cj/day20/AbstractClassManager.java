package com.meta.cj.day20;

abstract class Ab1{
    Ab1(){
        System.out.println("Ab1");
    }
    public void show1(){
        System.out.println("Ab1");
    }
}

abstract class Ab2 extends Ab1{
    Ab2( int num){
        System.out.println(num);
    }
    public void show2(){
        System.out.println("Ab2");
    }
}

class Ab3 extends Ab2{
    Ab3(){
        super(10);
        System.out.println("Ab3");
    }

    public void show3(){

        System.out.println("Ab3");
    }
}

public class AbstractClassManager {

    public static void main(String[] args) {
        Ab1 obj = new Ab3();

    }


}
