package com.example.codeup;

import java.util.Scanner;

public class codeup1080 {
    public static void main(String[] args) {
        int sum = 0;
        Scanner sc = new Scanner(System.in);
        int val = sc.nextInt();
        int result = 0;

        for(result = 1; sum< val; result++){
            sum += result;
        }
        System.out.println(result-1);
    }
}
