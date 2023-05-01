package com.example.codeup;

import java.util.Scanner;

public class codeup1082 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int val = Integer.parseInt(sc.next(), 16);

        for (int i = 1; i <= 0xF; i++) {
            System.out.printf("%X*%X=%X\n", val, i, val * i);
        }
    }
}
