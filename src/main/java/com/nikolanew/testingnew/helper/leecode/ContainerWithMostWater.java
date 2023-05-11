package com.nikolanew.testingnew.helper.leecode;

public class ContainerWithMostWater {

    public static void main(String[] args) {
        var nums = new int[] { 1,8,6,2,5,4,8,3,7};
        System.out.println(maxArea(nums));
    }
    public static int maxArea(int[] height) {
        int left = 0;
        int right = height.length -1;
        int max = 0;

        while (left < right) {
            int w = right - left;
            int h = Math.min(height[left], height[right]);
            // witch * heigh

            int area = w * h;
            max = Math.max(max, area);

            if(height[left] < height[right]) left++;
            else if(height[left] > height[right]) right++;
            else {
                left++;
                right++;
            }

        }


        return max;
    }
}
