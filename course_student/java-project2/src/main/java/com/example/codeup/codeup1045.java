package com.example.codeup;

import java.util.Scanner;

public class codeup1045 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int val1 = sc.nextInt();
        int val2 = sc.nextInt();

        System.out.println(val1+val2);
        System.out.println(val1-val2);
        System.out.println(val1*val2);
        System.out.println(val1/val2);
        System.out.println(val1%val2);
        float result = val1/ (float)val2;
        System.out.printf("%.2f", result);
    }
}


