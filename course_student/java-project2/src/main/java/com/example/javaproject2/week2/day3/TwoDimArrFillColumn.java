package com.example.javaproject2.week2.day3;

import java.util.Arrays;
import java.util.Scanner;

public class TwoDimArrFillColumn {

    public static void printArray(int[][] arr){
        System.out.println(Arrays.toString(arr[0]));
        System.out.println(Arrays.toString(arr[1]));
        System.out.println(Arrays.toString(arr[2]));
        System.out.println(Arrays.toString(arr[3]));
        System.out.println(Arrays.toString(arr[4]));
        System.out.println("-------------------------------");
    }
    public static void main(String[] args) {
        int[][] arr1 = new int[5][5];

        Scanner sc = new Scanner(System.in);
        int val = sc.nextInt();

        arr1[0][val] = 1;
        arr1[1][val] = 1;
        arr1[2][val] = 1;
        arr1[3][val] = 1;
        arr1[4][val] = 1;

        printArray(arr1);
    }
}
