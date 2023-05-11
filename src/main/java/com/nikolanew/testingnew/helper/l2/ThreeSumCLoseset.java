package com.nikolanew.testingnew.helper.l2;

import java.util.Arrays;

public class ThreeSumCLoseset {
    public int threeSumClosest(int[] nums, int target) {

        int closesSum = Integer.MAX_VALUE;
        int sum = 0;
        Arrays.sort(nums);

        for (int i = 0; i < nums.length -2; i++) {
            int j = i+1;
            int k = nums.length -1;

            while (j < k) {
                sum = nums[i] + nums[j] + nums[k];

                if (sum == target) {
                    return sum;
                } else if (Math.abs(target-sum) < Math.abs(target -closesSum)) {
                    closesSum = sum;
                }

                if (sum <= target) {
                    j++;
                    while (nums[j]  == nums[j-1] && j < k) {
                        j++;
                    }
                } else {
                    k--;
                }
            }
        }

        return closesSum;
    }}
