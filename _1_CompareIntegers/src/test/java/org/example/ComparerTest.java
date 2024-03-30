package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ComparerTest {

    @Test
    void aIsLess() {
        assertTrue(Comparer.aIsLess(3, 4));
    }

    @Test
    void aIsBigger() {
        assertTrue(Comparer.aIsBigger(5, 4));
    }

    @Test
    void aIsEqualsToB() {
        assertFalse(Comparer.aIsLess(4, 4));
        assertFalse(Comparer.aIsBigger(4,4));
    }
}