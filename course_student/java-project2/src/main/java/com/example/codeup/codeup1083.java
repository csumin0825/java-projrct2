package com.example.codeup;

import java.util.Scanner;

public class codeup1083 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int val = sc.nextInt();

        for (int i = 1; i <= val; i++) {
            if (i == 3 || i == 6 || i == 9) {
                System.out.printf("X ");
            } else {
                System.out.printf(i + " ");
            }
        }
    }
}
