package com.nikolanew.testingnew.helper.leecode;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class FineMedianInSortedArray {

    public static void main(String[] args) {
        int[] arr1 = { 1,2 };
        int[] arr2 = { 3, 4 };
        System.out.println("t: " + findMedianSortedArrays(arr1, arr2));
    }

    public static double findMedianSortedArrays(int[] nums1, int[] nums2) {
        List<Integer> l1 = new ArrayList<>();
        double middleOfTheList=0;

        for (int a: nums1) {
            l1.add(a);
        }
        for (int a: nums2) {
            l1.add(a);
        }
        Collections.sort(l1);
        int sizeOfList = l1.size();
        int middle = sizeOfList/2;

        if (middle %2 != 0) {
            middleOfTheList = l1.get(middle);
            return middleOfTheList;
        } else {
            middleOfTheList = l1.get(middle);
            var midInCaseOfMofEq2 = l1.get(middle-1);
            return (middleOfTheList + midInCaseOfMofEq2) /2;
        }

    }
}
