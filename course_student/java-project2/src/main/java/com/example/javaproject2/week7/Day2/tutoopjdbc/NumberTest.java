package com.example.javaproject2.week7.Day2.tutoopjdbc;

import junit.framework.TestCase;

public class NumberTest extends TestCase {

    public void testIsPrime() {
        assertEquals(true, CMath.isPrime(7));
    }
    public void testperfectionNum() {
        assertEquals(true, CMath.perfectionNum(6));
        assertEquals(true, CMath.perfectionNum(28));
        assertEquals(false, CMath.perfectionNum(100));
    }
    public void testprime() {
        assertEquals("[1, 2, 3, 6]", CMath.prime(6));
    }

}