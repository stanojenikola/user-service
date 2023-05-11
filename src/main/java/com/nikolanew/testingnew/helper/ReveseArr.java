package com.nikolanew.testingnew.helper;

import java.util.Arrays;
import java.util.Collections;

public class ReveseArr {

    public static void main(String[] args)
    {

        // Initializing the array
        Integer array[] = { 1, 2, 3, 4, 5 };

        // Sorting the array in descending order
        Arrays.sort(array, Collections.reverseOrder());

        // Printing the elements
        System.out.println(Arrays.toString(array));




        // second

        // Initializing the array
        int arra[] = { 1, 2, 3, 4, 5, 6 };

        // Sorting the array in ascending order
        Arrays.sort(arra);

        // Reversing the array
        reverse2(arra);

        // Printing the elements
        System.out.println(Arrays.toString(array));


    }
    public static void reverse2(int[] array)
    {

        // Length of the array
        int n = array.length;

        // Swapping the first half elements with last half
        // elements
        for (int i = 0; i < n / 2; i++) {

            // Storing the first half elements temporarily
            int temp = array[i];

            // Assigning the first half to the last half
            array[i] = array[n - i - 1];

            // Assigning the last half to the first half
            array[n - i - 1] = temp;
        }
    }
}
