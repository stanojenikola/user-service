package com.nikolanew.testingnew.helper.l2;

public class ContainerWIthMostWater {
    public int maxArea(int[] height) {
        int left = 0, right = height.length - 1, max =0;

        while(left < right) {
            int w = right - left;
            int h = Math.min(height[left], height[right]);

            int area = w * h;
            max = Math.max(max, area);

            if (height[left] < height[right]) left++;
            else if(height[left] > height[right]) right--;
            else{
                right--;
                right++;
            }


        }
        return max;
    }
}
