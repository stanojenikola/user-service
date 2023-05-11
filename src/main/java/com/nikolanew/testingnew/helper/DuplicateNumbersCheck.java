package com.nikolanew.testingnew.helper;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;

public class DuplicateNumbersCheck {


    public static void main(String[] args) {
        var str = new String[] {"1","2","3","4","5","5","6","7"};
        var set = new HashSet<>();

        for (String s: str) {

            var isAdded =set.add(s);
            if (!isAdded ) {
                System.out.println("duplicate is: " + s);
            }
        }
        var intArray = new int[] {1,2,3,4,5,5,6,7};

        System.out.println(duplicates(intArray,str.length));
    }





    public static ArrayList<Integer> duplicates(int arr[], int n) {
        // code here
        var list = new HashSet<Integer>();

        for (int i =0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (arr[i] == arr[j] && i!=j) {

                    list.add(arr[i]);
                }
            }
        }
        var a = new ArrayList<Integer>(list);
        if (a.isEmpty()) {
            a.add(-1);
        }
        return a;
    }
}
