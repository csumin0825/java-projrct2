package com.example.javaproject2.week5.day1;

import java.util.Arrays;

public class BubbleSort1_3 {
//    Comparator<Integer> comparator;

//    public BubbleSort2_3(Comparator<Integer> comparator){
//        this.comparator = comparator;
//    }
    public int[] sortAround(int[] arr, int until) {
        for (int j = 1; j <= until; j++) {
            for (int i = 0; i < arr.length - j; i++) {
                if (arr[i] > arr[i + 1]) {
                    int temp = arr[i];
                    arr[i] = arr[i + 1];
                    arr[i + 1] = temp;
                }
            }
        }
        return arr;
    }

    public int[] sort(int[] arr) {
        for (int i = 0; i <= arr.length; i++) {
            arr = sortAround(arr, arr.length - 1);
        }
        return arr;
    }

    public static void main(String[] args) {
        BubbleSort1_3 bubbleSort3 = new BubbleSort1_3();
        int[] arr = {7, 2, 3, 9, 28, 11};
        arr = bubbleSort3.sort(arr);
        System.out.println(Arrays.toString(arr));
    }
}
