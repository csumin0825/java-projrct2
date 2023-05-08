package com.example.javaproject2.week4.day1;

public class PyramidStar1 {
    public static void main(String[] args) {
        int height = 4;
        for (int i = 0; i < height; i++) {
            for (int j = 0; j < height - i -1; j++) {
                System.out.printf("0");
                for (int k = 0; k < 2*j-1; k++) {
                    System.out.printf("*");
                }
            }
            System.out.println();
        }
    }
}
