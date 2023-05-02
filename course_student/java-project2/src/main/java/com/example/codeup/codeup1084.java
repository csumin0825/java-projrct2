package com.example.codeup;

import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.util.Scanner;

public class codeup1084 {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);

        int val1 = sc.nextInt();
        int val2 = sc.nextInt();
        int val3 = sc.nextInt();

        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int num = 0;

        for (int i = 0; i < val1; i++) {
            for (int j = 0; j < val2; j++) {
                String line = "";
                for (int k = 0; k < val3; k++) {
                    line += i + " " + j + " " + k + "\n";
                    num++;
                }
                bw.write(line);
                bw.flush();
            }
        }
        System.out.println(num);
    }
}
