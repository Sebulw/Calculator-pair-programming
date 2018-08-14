package com.sda.calculator.tests;

import com.sda.calculator.Calculator;
import com.sda.calculator.exception.MethodDoesNotHaveArgumentException;
import com.sda.calculator.exception.NegativesNotAllowed;
import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

public class ExceptionTest {

    private Calculator calculator;

    @Rule
    public ExpectedException thrown = ExpectedException.none();

    @Before
    public void setUp() {
        calculator = new Calculator();
    }
    @Test
    public void exceptionTest() throws MethodDoesNotHaveArgumentException, NegativesNotAllowed {
        thrown.expect(MethodDoesNotHaveArgumentException.class);
        calculator.add("");
//        thrown.expectMessage("Brak argumentu");
    }
    @Test
    public void exceptionTest2() throws MethodDoesNotHaveArgumentException, NegativesNotAllowed {
        thrown.expect(MethodDoesNotHaveArgumentException.class);
        calculator.add(null);
//        thrown.expectMessage("Brak argumentu");
    }


}
