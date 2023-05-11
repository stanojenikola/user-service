package com.nikolanew.testingnew.helper.l2;

import java.util.Arrays;

public class RemoveDuplicate {

    public static void main(String[] args) {
        System.out.println(removeD(new int[] {1,1,2,3,4,5}));
    }

   static int removeD(int[] nums) {
        int i = 0;

        for (int n : nums){
            if(i == 0 || n > nums[i-1]) {
                nums[i++] = n;
            }
        }

       System.out.println(Arrays.toString(nums));
        return i;
   }

}
