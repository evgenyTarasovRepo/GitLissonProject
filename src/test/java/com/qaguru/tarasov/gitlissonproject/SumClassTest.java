package com.qaguru.tarasov.gitlissonproject;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class SumClassTest {
    public static int sum(int a, int b) {
        return a + b;
    }

    @Test
    public void testSum() {
        int numberOne = 9;
        int numberTwo = 5;

        Assertions.assertEquals(14, sum(numberOne, numberTwo));
    }
}
