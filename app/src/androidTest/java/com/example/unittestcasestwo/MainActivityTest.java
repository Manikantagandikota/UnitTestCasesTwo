package com.example.unittestcasestwo;

import junit.framework.TestCase;

import org.junit.Test;

public class MainActivityTest extends TestCase {


    @Test
    public void addition_isCorrect() {
        assertEquals(5, new MainActivity().addTwoNumbers(2,3),0);
    }


    @Test
    public void subtraction_isCorrect() {
        assertEquals(5, new MainActivity().subtractTwoNumbers(8,3),0);
    }

    @Test
    public void multiplication_isCorrect() {
        assertEquals(24, new MainActivity().multiplyTwoNumbers(8,3),0);
    }

    @Test
    public void division_isCorrect() {
        assertEquals(3, new MainActivity().divideTwoNumbers(9,3),0);
    }

    @Test
    public void percentage_isCorrect() {
        assertEquals(0.03, new MainActivity().calculatePercentage(3),0);
    }
}