package com.example.javaproject2.week4.day3.OOP;

public class RightTriangleShapeDrawer extends ShapeDrawer2{

    @Override
    public String makeALine(int h, int i) {
        return String.format("%s%s\n", "", "*".repeat(i));
    }

    public static void main(String[] args) {
        ShapeDrawer2 rightTriangle = new RightTriangleShapeDrawer();
        rightTriangle.printShape(5);
    }
}
