package com.example.javaproject2.week2.day3;

import java.util.Arrays;
import java.util.Scanner;

public class TwoDimArrFillColumn {
    public static void fillColumn(int[][] arr, int columnNum){
        arr[0][columnNum] = 1;
        arr[1][columnNum] = 1;
        arr[2][columnNum] = 1;
        arr[3][columnNum] = 1;
        arr[4][columnNum] = 1;
    }

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

        fillColumn(arr1, val);

        printArray(arr1);
    }
}
