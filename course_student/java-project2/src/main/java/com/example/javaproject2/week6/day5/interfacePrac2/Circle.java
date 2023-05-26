package com.example.javaproject2.week6.day5.interfacePrac2;

public class Circle implements Shape {
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public double calculateArea() {
        return Math.pow(radius, 2) * 3.14;
    }

    @Override
    public double calculatePerimeter() {
        return radius * 2 * 3.14;
    }
}
