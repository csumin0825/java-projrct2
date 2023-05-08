package com.example.codeup;

import com.example.javaproject2.week1.day5.Point;

import java.util.Scanner;

public class codeup4596 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][] arr = new int[10][10]; //0번대는 비움
        int xIdx = 0;
        int yIdx = 0;

        // O(N^2)
        int maxValue = 0;
        for (int row = 1; row <= 9; row++) {
            for (int col = 1; col <= 9; col++) {
                int now = sc.nextInt();
                if (maxValue < now) {
                    maxValue = now;
                    xIdx = col;
                    yIdx = row;
                }
            }
        }
        System.out.println(maxValue);
        System.out.printf("%d %d\n", yIdx, xIdx);

    }
}
