package com.qaguru.tarasov.gitlissonproject;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class SubtractionClassTest {
    public static int subtraction(int a, int b) {
        return a - b;
    }

    @Test
    public void subtractionTest() {
        int numberOne = 10;
        int numberTwo = 5;

        Assertions.assertEquals(5, subtraction(numberOne, numberTwo));
    }
}
