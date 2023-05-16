package com.example.javaproject2.week5.day2;

import java.util.Arrays;

public class InsertionSort03 {
    public int[] sort(int[] arr,boolean isAscending) {
        for (int i = 1; i < arr.length; i++) {
            for (int j = i; j > 0; j--) {
                System.out.printf("i:%d J:%d\n", i, j);
                if((isAscending ? arr[j-1] -arr[j] : arr[j]- arr[j-1])>0){ // true: 내림차순, false: 오른차순
                    int temp = arr[j];
                    arr[j] = arr[j - 1];
                    arr[j - 1] = temp;
                } else {
                    break;
                }
            }
        }
        return arr;
    }

    // 메서드 오버로딩
    public int[] sort(int[] arr){
        return sort(arr, true);
    }

    public static void main(String[] args) {
        int[] arr = {7, 2, 3, 9, 28, 11};
        InsertionSort03 is = new InsertionSort03();
        arr = is.sort(arr);
        System.out.println(Arrays.toString(arr));

    }
}
