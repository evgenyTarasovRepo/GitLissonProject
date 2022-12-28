package com.qaguru.tarasov.gitlissonproject;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class SumClassTest {
    public static int sum(int a, int b) {
        return a + b;
    }

    @Test
    public void testSum() {
        int numberOne = 7;
        int numberTwo = 7;

        Assertions.assertEquals(14, sum(numberOne, numberTwo));
    }
}
