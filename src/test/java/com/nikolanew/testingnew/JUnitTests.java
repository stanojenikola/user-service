package com.nikolanew.testingnew;


import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;
import org.junit.jupiter.api.DisplayName;

class Calculator {

    public int multiply(int a, int b) {
        return a * b;
    }
}

public class JUnitTests {

    Calculator calculator;

    @Before
    public void setUp() {
        calculator = new Calculator();
    }

    @Test
    @DisplayName("Simple multiplication should work")
    public void testMultiply() {
        assertEquals(10, calculator.multiply(2, 5));
    }

    @Test
    @DisplayName("Ensure correct handling of zero")
    public void testMultiplayWithZero() {
        assertEquals("When one param is zero return 0", 0, calculator.multiply(2,0));
    }
}
