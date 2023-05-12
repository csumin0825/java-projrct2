package com.example.javaproject2.week4.day5.HospitalInterface;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

public class InputStreamPrinter implements Printer{
    @Override
    public void print(String fileName) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(new FileInputStream(fileName),"utf8"));
        System.out.println(br.readLine());
    }
}
