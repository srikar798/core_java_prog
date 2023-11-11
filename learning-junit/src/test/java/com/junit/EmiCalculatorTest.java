package com.junit;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class EmiCalculatorTest {
    @Test
    void testCalculateEmi() {
        EmiCalculator emiCalculator = new EmiCalculator();
        double emi = emiCalculator.calculateEmi(850000, 15, 27);
        System.out.println(emi);
        double expected = 37287;
        Assertions.assertEquals(expected,emi);
    }
}
