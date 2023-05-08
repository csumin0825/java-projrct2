package com.example.codeup;

import java.util.Scanner;

public class codeup1096 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num = sc.nextInt();
        int[][] arr = new int[20][20]; // 0~19 1~19

        for (int i = 0; i < num; i++) { // 0~5
            int xLocation = sc.nextInt();
            int yLocation = sc.nextInt();
            arr[xLocation][yLocation] = 1;
        }

        for (int row = 1; row <= 19; row++) {
            for (int col = 1; col <= 19; col++) {
                System.out.printf("%d ", arr[row][col]);
            }
            System.out.println();
        }
    }
}
