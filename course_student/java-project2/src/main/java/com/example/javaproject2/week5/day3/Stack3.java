package com.example.javaproject2.week5.day3;

import java.util.EmptyStackException;

public class Stack3 {
    private int[] arr = new int[10000];
    private int pointer = 0;

    public void push(int value) {
        this.arr[pointer++] = value;
//        System.out.println(Arrays.toString(arr));
//        System.out.println(pointer);
    }

    public boolean isEmpty() {
        return this.pointer == 0;
    }

    public int pop() {
        if(isEmpty()) throw new RuntimeException("스택이 비었습니다.");
        return this.arr[--pointer];
//        int temp = this.arr[pointer - 1];
//        pointer--;
//        return temp;
    }

    public static void main(String[] args) {
        Stack3 st = new Stack3();
        System.out.println(st.isEmpty());
        st.push(10);
        System.out.println(st.isEmpty());
        st.pop();
        System.out.println(st.isEmpty());
    }
}
