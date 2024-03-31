package org.example;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class ComparerTest {
    @Test
    void isStringEquals() {
        String a = "a343";
        String b = "a343";
        String c = "a543";
        String d = "";
        assertEquals(a, b);
        assertNotEquals(a, c);
        assertNotEquals(a, d);

        assertTrue(Comparer.isStringEquals(a, b));
        assertFalse(Comparer.isStringEquals(a, c));
        assertFalse(Comparer.isStringEquals(a, d));
    }
}