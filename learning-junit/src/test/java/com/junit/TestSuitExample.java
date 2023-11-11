package com.junit;

import org.junit.platform.suite.api.SelectClasses;
import org.junit.platform.suite.api.Suite;

@Suite
@SelectClasses({EmiCalculatorTest.class,MathOperationsTest.class})
public class TestSuitExample {

}
