package com.example.javaproject2.week4.day3.OOP;
// RightTriangleDraw_4
public abstract class ShapeDrawer2 {
    public abstract String makeALine(int h, int i);
//    {
//        return String.format("%s%s\n", " ".repeat(h - i), "*".repeat(2 * i - 1));
//    }

    public void printShape(int height) {
        for (int i = 1; i <= height; i++) {
            System.out.printf("%s", makeALine(height, i));
        }
    }

//    public static void main(String[] args) {
//        int h = 5;
//
//        RightTriangleDraw_4 rtd = new RightTriangleDraw_4();
//        rtd.printShape(h);
//    }
}
