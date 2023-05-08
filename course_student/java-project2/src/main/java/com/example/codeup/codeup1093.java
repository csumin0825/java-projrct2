package com.example.codeup;

import java.util.Scanner;

public class codeup1093 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int size = sc.nextInt();
        int[] cntArr = new int[24];
        int idx = 0;

        for (int i = 0; i < size; i++) {
            cntArr[sc.nextInt()]++;
        }
        for (int i = 1; i < cntArr.length; i++) System.out.printf("%d ", cntArr[i]);
    }
}
