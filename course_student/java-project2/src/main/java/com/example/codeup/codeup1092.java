package com.example.codeup;

import java.util.Scanner;

public class codeup1092 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        int num3 = sc.nextInt();

        int i = 2;

        while (true) {
            if (i % num1 == 0 && i % num2 == 0 && i % num3 == 0) break;
            else i++;
        }
        System.out.println(i);
    }
}
