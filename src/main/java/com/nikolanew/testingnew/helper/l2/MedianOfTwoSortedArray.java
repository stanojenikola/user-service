package com.nikolanew.testingnew.helper.l2;

import java.util.ArrayList;
import java.util.Collections;

public class MedianOfTwoSortedArray {

    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        var list = new ArrayList<Integer>();

        for (int i : nums1) {
            list.add(i);
        }
        for (int i : nums2) {
            list.add(i);
        }
        Collections.sort(list);
        var size = list.size();
        var middle = size /2;
        double middleOfTheList =0;

        if (size % 2 !=0) {
            middleOfTheList = list.get(middle);
            return (double) list.get(middle);
        } else {
            var middleOfTheList2 = 0;
            middleOfTheList = list.get(middle);

            if (middle > 0) {
                middleOfTheList2 = list.get(middle -1);
            }

            return (double)((middleOfTheList2 + middleOfTheList)/2);
        }

    }
}
