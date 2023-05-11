package com.nikolanew.testingnew.helper.java672;

public class SpringPermutation {

    public static void main(String[] args) {
        permutation("","nikola");




    }


    /*int finalNumber = Integer.MIN_VALUE;
    int sum = 0;
        for (int i = 0; i< n; i++) {

        sum = sum + arr[i];
         if (finalNumber < sum) {
            finalNumber= sum;
        }

        if ( sum < 0) {
            sum = 0;
        }



    }
        return finalNumber; */
    private static void permutation(String temp, String str) {

        if (str.isEmpty()) {
            System.out.println(temp + str);
        } else {
            for (int i = 0; i < str.length(); i++) {
                permutation(temp + str.charAt(i), str.substring(0, i) + str.substring(i+1, str.length()));
            }
        }
    }

}
