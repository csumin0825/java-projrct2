package com.example.javaproject2.week4.day3.OOP;

public class RightTriangleDraw_1 {
    public static void main(String[] args) {
        int h = 5;
        for (int i = 1; i <= h; i++) {
            System.out.printf("%s%s\n", " ".repeat(h - i), "*".repeat(2 * i - 1));
        }
    }
}
