package com.nikolanew.testingnew.helper.java672;

import java.util.Arrays;

public class Testing {

    public static void main(String[] args) {

        // System.out.println(reverseString("nikola"));
        //permutationOfString("", "NIKOLA");

        //reverseArray(new int[] {2,3,4,5});
        int[] input = { 1, 1, 2, 3, 5, 5, 7, 9, 9, 9 };

        missingNumber(input);
    }


    private static String reverseString(String reverse) {
        if (reverse.length() < 2) {
            return reverse;
        }

        return  reverseString(reverse.substring(1)) +reverse.charAt(0);
    }

    static void permutationOfString(String perm, String str) {
        if (str.isEmpty()) {
            System.out.println(perm + str);
        } else {
            for (int i = 0; i < str.length(); i++) {
                permutationOfString(perm + str.charAt(i), str.substring(0,i) + str.substring(i+1 ,str.length()));

            }
        }

    }

    static void reverseArray(int[] array) {
        var arr = new int[array.length];
        var j = 0;
        for (int i = array.length-1; i>=0; i--) {
            arr[j++]= array[i];
        }

       System.out.println(Arrays.toString(arr));
    }


    static void missingNumber(int[] missingNumbers) {
        var arr = new int[missingNumbers.length];
        for (int i: missingNumbers) {
                arr[i]= 1;
        }

        for (int i = 1;i < arr.length; i++) {
            if (arr[i] == 0) {
                System.out.println("missing number: " + i);
            }
        }
    }


}
