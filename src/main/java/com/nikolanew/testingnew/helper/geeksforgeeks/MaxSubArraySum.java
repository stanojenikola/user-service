package com.nikolanew.testingnew.helper.geeksforgeeks;

public class MaxSubArraySum {
    static long maxSubarraySum(int[] arr, int n) {
        int finalNumber = Integer.MIN_VALUE, sum = 0;
        for (int i = 0; i< n; i++) {
            sum = sum + arr[i];
            if (finalNumber < sum) {
                finalNumber= sum;
            }

            if ( sum < 0) {
                sum = 0;
            }
        }
        return finalNumber;
    }

}
