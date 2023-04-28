package com.example.codeup;

import java.util.Scanner;

public class codeup1120 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int val1 = sc.nextInt();
        int val2 = sc.nextInt();
        int val3 = sc.nextInt();

        System.out.printf("%.2f", (val1 + val2 + val3) / 3.0);
    }
}
