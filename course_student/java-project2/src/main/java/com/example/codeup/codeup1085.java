package com.example.codeup;

import java.util.Scanner;

public class codeup1085 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Long val1 = sc.nextLong();
        Long val2 = sc.nextLong();
        Long val3 = sc.nextLong();
        Long val4 = sc.nextLong();

        double result = val1*val2*val3*val4/8388608.0;

        System.out.printf("%.1f MB",result);

    }
}
