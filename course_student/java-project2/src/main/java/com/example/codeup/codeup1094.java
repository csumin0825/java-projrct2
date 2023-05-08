package com.example.codeup;

import java.util.Arrays;
import java.util.Scanner;

public class codeup1094 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int size = sc.nextInt();
        int[] randomNum = new int[size];
        int idx = 0;

        for (int i = 0; i < size; i++) {
            randomNum[i] = sc.nextInt();
        }
        for (int i = size-1; i >= 0; i--) System.out.printf("%d ", randomNum[i]);
    }
}
