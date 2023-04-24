package com.example.javaproject2.week2.day1;

public class NarrowingCasting {
    public static void main(String[] args) {
        double dVal = 123.456;

        int iVal = (int)dVal;
        System.out.println("dVal : "+dVal);
        System.out.println("iVal : "+iVal);

        String val1 = "1.5";
        String val2 = "2.5";
        float result = Float.parseFloat(val1) + Float.parseFloat(val2);
        System.out.println(result);

        String val3 = "1.11111111";
        String val4 = "2.11111111";
        double result2 = Double.parseDouble(val3)+ Double.parseDouble(val4);

        float result3 = Float.parseFloat(val3)+ Float.parseFloat(val4);

        System.out.println("double : "+ result2);
        System.out.println("float : "+result3);
    }
}
