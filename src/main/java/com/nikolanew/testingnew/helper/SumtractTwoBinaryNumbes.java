package com.nikolanew.testingnew.helper;

public class SumtractTwoBinaryNumbes {


    public static void main(String[] args) {
        int b1 = Integer.parseInt("110101", 2);
        int b2 = Integer.parseInt("11001", 2);

        int sum = b1 - b2;

        System.out.println(Integer.toBinaryString(sum));
        System.out.println(Integer.parseInt("11001", 2));

        int a = 2;
        int b = 9;

        a = a + b; //11
        b = a - b; //2
        a = a - b;



    }


}
