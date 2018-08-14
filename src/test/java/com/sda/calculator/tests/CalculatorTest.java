package com.sda.calculator.tests;

import com.sda.calculator.Calculator;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class CalculatorTest {

    private Calculator calculator;

    @Before
    public void setUp() {
        calculator = new Calculator();
    }

    @Test
    public void addingTest() {
        Assert.assertEquals(5 ,calculator.add("2,3"));
        Assert.assertEquals(12 ,calculator.add("5,7"));
        Assert.assertEquals(0 ,calculator.add(""));
        Assert.assertEquals(5, calculator.add("1,1,1,1,1"));
        Assert.assertEquals(9, calculator.add("0,2,3,4"));
    }
    @Test
    public void subtractTest() {
        Assert.assertEquals(0, calculator.subtract(""));
        Assert.assertEquals(52, calculator.subtract("100,48"));
        Assert.assertEquals(5, calculator.subtract("10,5"));
    }
    @Test
    public void multiplyTest() {
        Assert.assertEquals(0, calculator.multiply(""));
        Assert.assertEquals(45, calculator.multiply("15,3"));
        Assert.assertEquals(330, calculator.multiply("33,10"));

    }
}
