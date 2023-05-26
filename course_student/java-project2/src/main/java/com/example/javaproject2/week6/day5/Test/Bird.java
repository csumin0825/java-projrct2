package com.example.javaproject2.week6.day5.Test;

public class Bird implements Ani, Shape {
    @Override
    public void makeSound() {
        System.out.println("Shape");
    }

    @Override
    public void run() {
        System.out.println("짹짹");
    }
}
