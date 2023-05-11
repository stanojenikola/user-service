package com.nikolanew.testingnew.helper;

public class FindLargestAndSmallestNumberInArrayWithoutSoriting {

    public static void main(String[] args) {
        arrayLargestAndSmallestNumber(new int[] {10, 2,3,4,5,6,111, 9});
    }
    static void arrayLargestAndSmallestNumber(int[] arr) {
        int smallest = Integer.MAX_VALUE;
        int largest = Integer.MIN_VALUE;

        for (int number : arr) {
            if (number > largest) {
                largest = number;
            } else if (number < smallest) {
                smallest = number;
            }
        }

        System.out.println("largest: " + largest);
        System.out.println("smallest: " + smallest);
    }
}
