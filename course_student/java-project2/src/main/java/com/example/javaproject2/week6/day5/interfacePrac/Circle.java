package com.example.javaproject2.week6.day5.interfacePrac;

public class Circle implements Shape{
    private double radius;

    public Circle(double radius){
        this.radius = radius;
    }
    @Override
    public double calculateArea() {
        return Math.pow(radius,2)*3.14;
    }
}
