package com.nikolanew.testingnew.helper;

public class AmstrongNumber {


    public static void main(String[] args) {
        // System.out.println("is amstrong: "+  isAmstrong(153));
    }
    private static boolean isAmstrong(int number) {
        var current = number;
        var result = 0;

        while (current != 0) {
            int remainder = current%10;
            result = result + remainder * remainder* remainder;
            current = current / 10;
        }


        return number == result;
    }
}
