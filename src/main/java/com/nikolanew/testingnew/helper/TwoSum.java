package com.nikolanew.testingnew.helper;

import java.util.HashMap;
import java.util.Map;

public class TwoSum {

    public static void main(String[] args) {
        int[] intarray = {2, 7, 11, 15};
        twoSum(intarray, 9);

        String multiline = """
            Two roads diverged in a yellow wood,
            And sorry I could not travel both.""";
        System.out.println(multiline);
    }

    public static int[] twoSum(int[] nums, int target) {
        int n=nums.length;
        Map<Integer,Integer> map=new HashMap<>();
        int[] result=new int[2];
        for(int i=0;i<n;i++){
            if(map.containsKey(target-nums[i])){
                result[1]=i;
                result[0]=map.get(target-nums[i]);
                return result;
            }
            map.put(nums[i],i);
        }
        return result;
    }

}
