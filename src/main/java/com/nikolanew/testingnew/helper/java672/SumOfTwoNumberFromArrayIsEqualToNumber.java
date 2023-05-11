package com.nikolanew.testingnew.helper.java672;

public class SumOfTwoNumberFromArrayIsEqualToNumber {

    public static void main(String[] args) {

        sum2(new int[]{ 2, 4, 3, 5, 7, 8, 9 }, 7);

    }

    static void sum2(int[] arr, int input) {

        for (int i = 0; i< arr.length; i++) {
            var first = arr[i];
            for (int j = i + 1; j < arr.length; j++) {
                var second = arr[j];
                if (first + second == input) {

                    System.out.printf("%d %d", first, second);
                }
            }
        }
    }

}
