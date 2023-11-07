package com.meta.cj.day16;

import java.util.Arrays;

public class FinalVariablesByReferenceDatatype {

    public static void main(final String[] args) {

        System.out.println(Arrays.toString(args));

        args[0] = "Hi";
        System.out.println(Arrays.toString(args));
    }
}
