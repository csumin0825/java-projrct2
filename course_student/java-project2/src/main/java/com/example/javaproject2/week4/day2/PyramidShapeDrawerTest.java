package com.example.javaproject2.week4.day2;

public class PyramidShapeDrawerTest {
    public static void main(String[] args) {
        ShapeDrawer shapeDrawer = new PyramidShapeDrawer();
        shapeDrawer.printShape(4);

        ShapeDrawer parallelogramSd = new ParallelogramShapeDrawer();
        parallelogramSd.printShape(5);
    }
}
