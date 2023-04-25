package com.example.javaproject2.week2.day2;

public class StringEquals {
    public static void main(String[] args) {
        System.out.println("GOLD" == "GOLD");
        // 메모리 주소끼리 비교하기 때문에 같다고 나오는 것입니다.

        String str1 = "GOLD";
        String str2 = "G";

        boolean isSame = str1.substring(0,1) == str2;
        System.out.println(isSame);

        isSame = str1.substring(0,1).equals(str2);
        System.out.println(isSame);
    }
}
