package com.nikolanew.testingnew.helper;

public class BinaryToDecimal {

    private static int binaryToDec(long num) {
        int decimal = 0, i = 0;

        while (num != 0) {
            long rem = num % 10; //last number
            num = num / 10; // last removing
            decimal += rem * Math.pow(2, i);
            i++;
        }
        return decimal;
    }

    public static void main(String[] args) {
        System.out.println(binaryToDec(110110111));
    }


}
