package com.example.codeup;

import java.util.Scanner;

public class codeup1097 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[][] arr = new int[20][20]; // 0~19 1~19

        for (int row = 1; row <= 19; row++) { // 1~19
            for (int col = 1; col <= 19; col++) {
                arr[row][col] = sc.nextInt();
            }
        }

        int num = sc.nextInt();
        for (int i = 0; i < num; i++) {
            int turnRow = sc.nextInt();
            int turnCol = sc.nextInt();

            for (int row = 1; row <= 19; row++) {
                arr[row][turnRow] = arr[row][turnRow] == 0 ? 1 : 0;
            }
            for(int col = 1; col<= 19; col++){
                arr[turnCol][col] = arr[turnCol][col] == 0 ? 1 : 0;
            }
        }

        for (int row = 1; row <= 19; row++) {
            for (int col = 1; col <= 19; col++) {
                System.out.printf("%d ", arr[col][row]);
            }
            System.out.println();
        }
    }
}
