package com.nikolanew.testingnew.helper.l2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class ThreeSum {
    public List<List<Integer>> threeSum(int[] nums) {
        var target = 0;

        List<List<Integer>> list = new ArrayList<>();
        Set<List<Integer>> set = new HashSet<>();
        Arrays.sort(nums);
        for (int i = 0; i < nums.length; i++) {
            var j = i+1;
            var k = nums.length-1;

            while ( j < k) {
                var sum = nums[i] + nums[j] +nums[k];
                if (sum == target) {
                    set.add(Arrays.asList(nums[i], nums[j], nums[k]));
                    k--;
                    j++;
                } else if (sum < target) {
                    j++;
                } else {
                    k--;
                }
            }
        }


        list.addAll(set);
        return list;
    }
}
