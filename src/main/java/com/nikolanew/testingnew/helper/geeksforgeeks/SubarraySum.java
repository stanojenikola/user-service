package com.nikolanew.testingnew.helper.geeksforgeeks;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class SubarraySum {

    public static void main(String[] args) {
        //maxSubarraySum(new int[] {1,2,3,-2,5}, 5);
        int arr[] = {1, 3, 5, 8, 9, 2, 6, 7, 6, 8, 9};
    }


    static ArrayList<Integer> subsum(int[] arr, int length, int sum) {
        var currentSum = 0;
        var list = new ArrayList<Integer>();

        for (int i = 0; i < length; i++) {
            currentSum = arr[i];
            for (int j = i + 1; j <= length; j++) {
                if (currentSum == sum) {
                    list.add(i + 1);
                    list.add(j);

                    return list;
                }

                if (currentSum > sum || j == length) {
                    break;
                }

                currentSum = currentSum + arr[j];
            }

        }

        list.add(-1);
        return list;
    }

    static int MissingNumber(int array[], int n) {
        int sum = 0, currentSum = 0;
        for (int i = 0; i <= n; i++) {
            sum += i;
        }
        for (int i : array) {
            currentSum += i;
        }

        return sum - currentSum;
    }


    static int minJumps(int[] arr) {
        // your code here

        int currentNumber = 0;
        for (int i : arr) {
            if (i > currentNumber) {

            }
        }
        return 1;
    }


}
