package com.example.javaproject2.week5.day4;

import java.util.Arrays;

public class BracketWithoutStack2 {
    // ()를 기준으로 split한다.
    // 남은 문자열을 join
    // 남지 않을때까지 반복
    public static void main(String[] args) {
        String brackets = "((()()))()";

        while(brackets.indexOf("()")!= -1){
            String[] split = brackets.split("\\(\\)");
            brackets = String.join("",split);
            System.out.println(Arrays.toString(split));
            System.out.println(brackets);
        }
    }
}
