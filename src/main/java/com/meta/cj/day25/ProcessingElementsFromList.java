package com.meta.cj.day25;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class ProcessingElementsFromList {

    public static void main(String[] args) {

        List<String> list = new ArrayList<>();
        list.add("Java");
        list.add("Python");
        list.add("Javascript");
        list.add(".Net");
        list.add("SpringFramework");

        for(String ele : list){
            System.out.println(ele);
        }

        //same output using simple lambda
        //list.forEach(System.out::println);

        //USing Iterator
        Iterator<String> iterator = list.iterator();

        while (iterator.hasNext()){
            String ele = iterator.next();
            if(ele.equals("Python")){
                iterator.remove();
                break;
            }else{
                System.out.println(ele);
            }
        }
        System.out.println("-".repeat(40));
        iterator.forEachRemaining(System.out::println);

        System.out.println("-".repeat(40));

        ListIterator<String> listIterator = list.listIterator();
        while(listIterator.hasNext()){
            String ele = listIterator.next();
            System.out.println(ele);
        }
        System.out.println("-".repeat(50));
        while(listIterator.hasPrevious()){
            String ele = listIterator.previous();
           if(ele.equals("Javascript")) {
               listIterator.add("Python");
           }
           System.out.println(ele);

        }


    }
}

interface I1{

    I2 getI2();
}

interface I2{
    boolean isEven(int num);
}

class C1 implements I1{
    public I2 getI2(){
        return new X();
    }

    class X implements I2{
        public boolean isEven(int num){
            return num % 2 == 0;
        }
    }
}