package com.example.codeup;

import java.util.Scanner;

public class codeup1078 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int val = sc.nextInt();
        int sum = 0;
        for (int i = 0; i <= val; i++) {
            if (i % 2 == 0) {
                sum += i;
            }
        }
        System.out.println(sum);
    }
}
