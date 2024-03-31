package org.example;

import org.junit.jupiter.api.Test;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class MainTest {

    @Test
    void getList() {
        List<Integer> actual = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        actual = Main.getListOfEvenIntegers(actual);
        List<Integer> expected = Arrays.asList(2, 4, 6, 8, 10);
        assertEquals(actual, expected);
    }
}