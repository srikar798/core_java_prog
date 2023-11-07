package com.meta.cj.day16;

public class FinalVariables {

    public static final int z = 15;
    public static void main(String[] args) {
        int x = 10;
        final int y = 12;
        x++;

        System.out.println(x);
        System.out.println(y);
        System.out.println(z);

    }
}
