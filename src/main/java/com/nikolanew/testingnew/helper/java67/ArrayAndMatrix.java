package com.nikolanew.testingnew.helper.java67;

import java.util.Arrays;

public class ArrayAndMatrix {

    public static void main(String[] args) {
        // findMissingNumber(new int[]{1, 2, 3, 4, 6, 7, 9, 8, 10}, 10);
        // System.out.println(Arrays.toString(findDuplicateInIntArrayWithoutUsingCollection(
        //  new int[]{1, 2, 3, 4, 6, 7, 9, 8, 10, 10})));
        //largesAndSmallest(new int[]{1, 2, 3, 4, 6, 7, 9, 8, 10});
        checkIfSumIsEqualToTheNumber(new int[]{1, 2, 3, 4, 6, 7, 9, 8, 10}, 9);
    }

    private static int findMissingNumber(int[] intArray, int expected) {

        int result = expected * ((expected + 1) / 2);

        System.out.println("ex: " + result);
        int actualSum = 0;
        for (int i : intArray) {
            actualSum += i;
        }

        return result - actualSum;
    }

    private static int[] findDuplicateInIntArrayWithoutUsingCollection(int[] numbers) {

        Arrays.sort(numbers);
        int[] result = new int[numbers.length];
        int previous = numbers[0];
        result[0] = previous;

        for (int i = 1; i < numbers.length; i++) {
            int currentNumber = numbers[i];

            if (previous != currentNumber) {
                result[i] = currentNumber;
            }
            previous = currentNumber;
        }

        return result;
    }

    private static void largesAndSmallest(int[] numbers) {
        int largest = Integer.MIN_VALUE;
        int smallest = Integer.MAX_VALUE;

        for (int num : numbers) {
            if (num > largest) {
                largest = num;
            }

            if (num < smallest) {
                smallest = num;
            }
        }

        System.out.println("array: " + Arrays.toString(numbers));
        System.out.println("smalest: " + smallest);
        System.out.println("largest: " + largest);
    }

    private static void checkIfSumIsEqualToTheNumber(int[] numbers, int sum) {
        for (int i = 0; i < numbers.length; i++) {
            int first = numbers[i];
            for (int j = i +1; j < numbers.length; j++) {
                int second = numbers[j];

                if ((first + second) == sum) {
                    System.out.println("first: " +first + " + " + second + " = " + sum);
                }
            }
        }

    }

}
