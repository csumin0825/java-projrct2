package com.example.javaproject2.week7.Day2.tutoopjdbc;


import static org.junit.Assert.assertEquals;

public class MainTest {
    @org.junit.jupiter.api.Test
    void checkLeapYear(){
        assertEquals(false,MyUtils.checkLeapYear(1700));
    }

    @org.junit.jupiter.api.Test
    void testis369(){
        assertEquals("*",MyUtils.game369(3));
        assertEquals("***",MyUtils.game369(369));
        assertEquals("",MyUtils.game369(10));

    }
}