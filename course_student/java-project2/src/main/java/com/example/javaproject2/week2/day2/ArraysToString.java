package com.example.javaproject2.week2.day2;

import java.util.Arrays;

public class ArraysToString {
    public static void main(String[] args) {
        int[] iArr = new int[]{1,2,4,6};
        iArr[0] = 3;
        System.out.println(Arrays.toString(iArr));
    }
}
