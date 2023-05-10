package com.example.javaproject2.week4.day2;

public class ParallelogramShapeDrawer extends ShapeDrawer {
    public String makeALine(int h,int i ){
        return String.format("%s %s\n", " ".repeat(i), "*".repeat(h));
    }
}
