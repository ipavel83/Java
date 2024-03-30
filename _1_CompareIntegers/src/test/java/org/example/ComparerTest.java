package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ComparerTest {

    @Test
    void aIsLess() {
        assertTrue(Comparer.aIsLessThanB(3, 4));
    }

    @Test
    void aIsBigger() {
        assertTrue(Comparer.aIsBiggerThanB(5, 4));
    }

    @Test
    void aIsEqualsToB() {
        assertFalse(Comparer.aIsLessThanB(4, 4));
        assertFalse(Comparer.aIsBiggerThanB(4,4));
    }
}