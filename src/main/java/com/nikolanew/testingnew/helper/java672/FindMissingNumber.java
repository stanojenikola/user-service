package com.nikolanew.testingnew.helper.java672;

import java.util.Arrays;
import java.util.Collections;

public class FindMissingNumber {

    public static void main(String[] args) {
        missingNumber(new int[]{ 1, 3, 4, 5, 6, 7, 8, 9, 10}, 10);
    }


    public static void missingNumber(int[] arr, int max) {
        int expectedSum = (max * ((max+1))) / 2;
        System.out.println(expectedSum);
        int sum = 0;

        for (int i : arr) {
            sum += i;
        }
        var a = expectedSum - sum;
        System.out.println("a" + a);
    }

}
