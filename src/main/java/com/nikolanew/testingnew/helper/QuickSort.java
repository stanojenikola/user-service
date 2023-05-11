package com.nikolanew.testingnew.helper;

import java.util.Arrays;

public class QuickSort {

    public static void main(String[] args) {
        QuickSort quickSort = new QuickSort();
        var a = new int[] {3,2,4,5,1};
        quickSort.sortRecursion(a, 0, a.length-1);

        System.out.println("aarraar: " + Arrays.toString(a));
    }

    void sortRecursion(int[] numbers, int begin, int end) {

        if (begin < end) {
            int partitionIndex = partition(numbers, begin, end);


            sortRecursion(numbers, begin,partitionIndex-1);
            sortRecursion(numbers, partitionIndex+1, end);
        }
    }

    private static int partition(int[] input, int start, int end) {
        int piv = input[end];
        int i = start - 1;

        for (int j = start; j < end; j++) {
            if (input[j] <= piv) {
                i++;
                int swapTemp = input[i];
                input[i] = input[j];
                input[j] = swapTemp;
            }
        }


        int swapTemp = input[i+1];
        input[i+1] = input[end];
        input[end] = swapTemp;

        return i + 1;
    }

    private void swap(int[] arr, int a, int b) {
        int temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;
    }
}
