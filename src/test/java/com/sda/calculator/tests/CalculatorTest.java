package com.sda.calculator.tests;

import com.sda.calculator.Calculator;
import com.sda.calculator.exception.MethodDoesNotHaveArgumentException;
import com.sda.calculator.exception.NegativesNotAllowed;
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
    public void addingTest() throws MethodDoesNotHaveArgumentException, NegativesNotAllowed {
        Assert.assertEquals(5 ,calculator.add("2,3"));
    }
    @Test
    public void moreThanOneArgumentAddingTest() throws MethodDoesNotHaveArgumentException, NegativesNotAllowed {
        Assert.assertEquals(5, calculator.add("1,1,1,1,1"));
    }
    @Test
    public void addingTest4() throws MethodDoesNotHaveArgumentException, NegativesNotAllowed {
        Assert.assertEquals(9, calculator.add("0,2,3,4"));
    }
    @Test
    public void valuesHigherThanTousandAreIgnoredTest() throws MethodDoesNotHaveArgumentException, NegativesNotAllowed {
        Assert.assertEquals(1, calculator.add("1000,1000,1000,1"));
    }

}
