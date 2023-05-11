package com.nikolanew.testingnew.helper;

public class FindMultipleMissingNumbers {

    public static void main(String[] args) {

        int[] arrayOfNumbers = {1, 1, 2, 3, 5, 5, 7, 9, 9, 9};
        var newArray = new int[arrayOfNumbers.length];

        for (int n : arrayOfNumbers) {
            newArray[n] = 1;
        }

        for (int i = 1; i < newArray.length; i++) {
            if (newArray[i] == 0) {
                System.out.println("missing number is: " + i);
            }

        }

    }
}
