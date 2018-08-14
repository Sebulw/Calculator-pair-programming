package com.sda.calculator.tests;

import com.sda.calculator.Calculator;
import com.sda.calculator.exception.MethodDoesNotHaveArgumentException;
import com.sda.calculator.exception.NegativesNotAllowed;
import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

public class NegativesValueExceptionTest {

    private Calculator calculator;

    @Rule
    public ExpectedException thrown = ExpectedException.none();

    @Before
    public void setUp() {
        calculator = new Calculator();
    }
    @Test
    public void negativeExceptionTest() throws NegativesNotAllowed, MethodDoesNotHaveArgumentException {
        thrown.expect(NegativesNotAllowed.class);
        calculator.add("-1,5");
    }
    @Test
    public void negativeAndZeroExceptionTest() throws NegativesNotAllowed, MethodDoesNotHaveArgumentException {
        thrown.expect(NegativesNotAllowed.class);
        calculator.add("-1,0");
    }
}
