package com.nikolanew.testingnew.helper.leecode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class ThreeSum {

    public static void main(String[] args) {
        var nums = new int[] {-1,0,1,2,-1,-4};
        threeSum(nums);
    }


    public static List<List<Integer>> threeSum(int[] nums) {
        var target = 0;

        Set<List<Integer>> set = new HashSet<>();
        List<List<Integer>> arrayList = new ArrayList<>();

        for (int i = 0; i < nums.length; i++) {
            int j = i + 1;
            int k = nums.length -1;

            while (j < k) {

                int sum = nums[i] + nums[j] + nums[k];
                System.out.println(sum);
                if (sum == target) {
                    set.add(Arrays.asList(nums[i] , nums[j] , nums[k]));
                    j++;
                    k--;
                }  else if (sum < target) {
                    j++;
                } else {
                    k--;
                }
            }

        }

        arrayList.addAll(set);
        return arrayList;
    }
}
