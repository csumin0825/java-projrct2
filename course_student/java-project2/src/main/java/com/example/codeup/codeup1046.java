package com.example.codeup;

import java.util.Scanner;

public class codeup1046 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int val1 = sc.nextInt();
        int val2 = sc.nextInt();
        int val3 = sc.nextInt();

        int sum = val1 + val2 + val3;
        double average = sum / 3.0;

        System.out.println(sum);
        System.out.printf("%.1f", average);
    }
}


