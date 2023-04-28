package com.example.codeup;

import java.util.Scanner;

public class codeup1065 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int val1 = sc.nextInt();
        int val2 = sc.nextInt();
        int val3 = sc.nextInt();

        if (val1 % 2 == 0) {
            System.out.println(val1);
        }
        if (val2 % 2 == 0) {
            System.out.println(val2);
        }
        if (val3 % 2 == 0) {
            System.out.println(val3);
        }
    }
}
