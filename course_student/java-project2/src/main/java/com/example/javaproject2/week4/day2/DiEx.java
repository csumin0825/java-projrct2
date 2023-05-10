package com.example.javaproject2.week4.day2;

public class DiEx { // ShapeDrawer에 의존
    private ShapeDrawer shapeDrawer;

    public DiEx(ShapeDrawer shapeDrawer){
        this.shapeDrawer = shapeDrawer;
    }

    public void doSth(){
        shapeDrawer.printShape(5);
    }
}
