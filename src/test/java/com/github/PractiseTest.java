package com.github;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class PractiseTest {

    @Test
    void shouldReturnSumOfTwoPositiveNumbers() {

        Practise practise = new Practise();

        int result = practise.sumOfTwoNumbers(10, 10);

        assertEquals(20, result);
    }

    @Test
    void shouldReturnSumWhenNumbersAreDifferent() {

        Practise practise = new Practise();

        int result = practise.sumOfTwoNumbers(5, 15);

        assertEquals(20, result);
    }

    @Test
    void shouldReturnZeroWhenBothNumbersAreZero() {

        Practise practise = new Practise();

        int result = practise.sumOfTwoNumbers(0, 0);

        assertEquals(0, result);
    }

    @Test
    void shouldHandleNegativeNumbers() {

        Practise practise = new Practise();

        int result = practise.sumOfTwoNumbers(-10, -5);

        assertEquals(-15, result);
    }

    @Test
    void shouldHandlePositiveAndNegativeNumbers() {

        Practise practise = new Practise();

        int result = practise.sumOfTwoNumbers(10, -5);

        assertEquals(5, result);
    }
}

