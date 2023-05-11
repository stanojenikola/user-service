package com.nikolanew.testingnew.helper.l2;

import java.util.Arrays;

public class TotalNumberOfWater {

    public static void main(String[] args) {
        var arr = new int[] {0,1,0,2,1,0,1,3,2,1,2,1};
        //trap(arr);

        //System.out.println(solution(new int[] {1,2,3}));

        var a = "Deal, as a full stack developer, I have been responsible for the software which is installed in most of 70% of the biggest banks in the world(ex. Bank of America). Can say that I am a team player, communicative, and motivated to finish tasks on time. Familiar with best practices, clean code, and design.Due to private problems, I want to change my current job.";

        System.out.println(a.length());
    }


    public int solution(int[] A) {
        // Implement your solution here

        int count = 0;
        Arrays.sort(A);
        int last= 0;
        int sum = 0;
        int correntSumInCaseOfMissingNumber = 0;
        for (int i = 0; i < A.length; i++) {
            if (A[i] < 0) {
                count++;
            }
            if ((i+1) != A[i]) {
                last = i+1;
            }

            sum += A[i];
            correntSumInCaseOfMissingNumber = i+1;
        }


        if (count == A.length) {
            return 1;
        }
        if (sum == correntSumInCaseOfMissingNumber) {
            return (A.length +1);
        }

        return last;
    }
    static int trap(int[] height) {
        int left = 0, right = height.length-1, maxLeft = 0, maxRight =0;


        if (height == null || height.length == 0) {
            return 0;
        }

        int totalWater =0;

        while (left < right) {
            if (height[left] < height[right]) {
                if ( maxLeft <= height[left]) {
                    maxLeft = height[left];
                } else {
                    totalWater += maxLeft - height[left];
                }
                left++;
            } else {
                if (maxRight <= height[right]) {
                    maxRight = height[right];
                } else {
                    totalWater += maxRight -height[right];
                }
                right--;
            }
        }


        return totalWater;

    }
}
