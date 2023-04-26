package com.example.javaproject2.week2.day3;

import java.util.Arrays;
import java.util.Scanner;

public class TwoDimArrEx {
    public static void printArray(int[][] arr){
        System.out.println(Arrays.toString(arr[0]));
        System.out.println(Arrays.toString(arr[1]));
        System.out.println(Arrays.toString(arr[2]));
        System.out.println("-------------------------------");
    }

    public static void changeNum(int[][] arr , int index){
        arr[index][0] = 1;
        arr[index][1] = 1;
        arr[index][2] = 1;

    }
    public static void main(String[] args) {
        int[][] arr = new int[3][3];

        printArray(arr);

        arr[0][0] = 1;
        arr[0][2] = 1;
        arr[1][0] = 1;
        printArray(arr);

        arr[1][1] = 5;
        printArray(arr);

        int[][] arr1 = new int[3][3];
        Scanner sc = new Scanner(System.in);

        int index = sc.nextInt();
        changeNum(arr1, index);
        printArray(arr1);


    }
}
