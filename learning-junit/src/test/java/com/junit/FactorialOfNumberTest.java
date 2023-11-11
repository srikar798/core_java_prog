package com.junit;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DynamicTest;
import org.junit.jupiter.api.TestFactory;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class FactorialOfNumberTest {

    private List<Integer> in = new ArrayList<>(Arrays.asList(0,1,2,3,4,5,6));
    private List<Integer> out = new ArrayList<>(Arrays.asList(1,1,2,6,24,120,720));
    FactorialOfNumber obj = new FactorialOfNumber();

    @TestFactory
    Stream<DynamicTest> factorial(){
        return in.stream().map(i ->
                DynamicTest.dynamicTest("Test factorial of "+ i + " is " + obj.fact(i), ()->{
                    int id = in.indexOf(i);
                    Assertions.assertEquals(out.get(id),obj.fact(i));
                })
        );
    }
}
