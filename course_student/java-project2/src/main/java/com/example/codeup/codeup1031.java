package com.example.codeup;

import java.util.Scanner;

public class codeup1031 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int decimalNum = sc.nextInt();
        String octalNum = Integer.toOctalString(decimalNum);
        System.out.println(octalNum);

    }
}
