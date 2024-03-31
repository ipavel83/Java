package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {

    @Test
    void summ() {
        assertEquals(35, Calculator.summ(10, 25));
    }

    @Test
    void diff() {
        assertEquals(85, Calculator.diff(110, 25));
    }

    @Test
    void div() {
        assertEquals(7, Calculator.div(37, 5));
    }

    @Test
    void mul() {
        assertEquals(63, Calculator.mul( 7, 9));
    }
}