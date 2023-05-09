package com.example.javaproject2.week4.day2;

public class Parallelogram {
    public String makeALine(int h,int i ){
        return String.format("%s %s\n", " ".repeat(i), "*".repeat(h));
    }
    public static void main(String[] args) {
        Parallelogram parallelogram = new Parallelogram();
        int height = 4;
        for (int i = 0; i < height; i++) {
            System.out.printf(parallelogram.makeALine(height,i));
        }
    }
}
