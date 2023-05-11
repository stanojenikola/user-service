package com.nikolanew.testingnew.helper.geeksforgeeks;

import java.util.Collection;
import java.util.Collections;

public class SortArray012 {


    public static void main(String[] args) {
        int[] arr = new int[]{0, 1, 2, 0, 1, 2};
        // Collections.sort(list);
    }



    /*

 public static int equilibriumPoint(long arr[], int n) {
        int sum = 0;
        int leftSum = 0;
        for (int i = 0; i < n; ++i) {
            sum += arr[i];
        }
        for (int i = 0; i < n; ++i) {
            sum-= arr[i];

            if (leftSum == sum) {
                return i;
            }

            leftSum += arr[i];
        }

        return -1;

        // Your code here
    }
     */

    public static void sort012(int a[], int n) {
        int low = 0;
        int mid = 0;
        int hid = a.length - 1;
        int temp = 0;

        while (mid <= hid) {

            switch (a[mid]) {
                case 0: {
                    temp = a[low];
                    a[low] = a[mid];
                    a[mid] = temp;
                    low++;
                    mid++;
                    break;
                }
                case 1: {
                    mid++;
                    break;
                }
                case 2: {
                    temp = a[mid];
                    a[mid] = a[hid];
                    a[hid] = temp;
                    hid--;
                    break;
                }
            }
        }

        // code here
    }


}
