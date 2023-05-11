package com.nikolanew.testingnew.helper.java672;

import java.util.Arrays;

public class RemoveDuplicates {

    public static void main(String[] args) {
        removeDuplicate(new int[] {1, 1, 2, 2, 3, 4, 5});
    }

    static void removeDuplicate(int[] arr) {
        Arrays.sort(arr);

        int[] result = new int[arr.length];

        int previous = arr[0];
        result[0] = previous;

        for (int i = 1; i < arr.length; i++) {
            int ch = arr[i];

            if (previous != ch) {
                result[i] = ch;
            }
            previous = ch;
        }

        System.out.println(Arrays.toString(result));
    }



}
