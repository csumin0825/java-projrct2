package com.example.javaproject2.week4.day3.OOP;

public class RightTriangleDraw_3 {
    public static String makeALine(int h, int i) {
        return String.format("%s%s\n", " ".repeat(h - i), "*".repeat(2 * i - 1));
    }

    public static void printShape(int height) {
        for (int i = 1; i <= height; i++) {
            System.out.printf("%s", makeALine(height, i));
        }
    }

    public static void main(String[] args) {
        int h = 5;

        RightTriangleDraw_3 rtd = new RightTriangleDraw_3();
        rtd.printShape(h);
    }
}
