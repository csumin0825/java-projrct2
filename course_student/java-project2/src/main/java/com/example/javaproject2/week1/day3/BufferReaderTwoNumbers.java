package com.example.javaproject2.week1.day3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BufferReaderTwoNumbers {
    public void plusTwoNums() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println(br.readLine()+br.readLine());
    }
}
