package com.nikolanew.testingnew.helper.l2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;
import org.junit.Assert;
import org.junit.Test;

public class SubstringWithConcatenationOfAllWords {

    public static void main(String[] args) {
        var words = new String[]{"foo", "bar"};
        System.out.println(findSubstring("foobarfoobar", words));
        System.out.println(findSubstring("foobar", words));
        System.out.println(findSubstring("barfoothefoobarman", new String[]{"foo", "bar"}));
    }

    @Test
    public void isCorrect() {
        Assert.assertEquals(findSubstring("foobarfoobar", new String[]{"foo", "bar"}), List.of(0, 3, 6));
    }

    /*
    [0, 3, 6]
    [0]
    [0, 9]
     */

    public static List<Integer> findSubstring(String s, String[] words) {
        Set<Integer> indexes = new HashSet<>();

        for (String str : generatePermutations(words)) {
            int fromIndex = 0;

            while (fromIndex < s.length()) {
                int indexOfString = s.indexOf(str, fromIndex);
                if (indexOfString != -1) {
                    indexes.add(indexOfString);
                }
                fromIndex++;
            }
        }

        return new ArrayList(indexes);
    }

    private static List<String> generatePermutations(String... arr) {
        var list = new ArrayList<String>();
        int n = arr.length;
        int[] c = new int[n];

        list.add(arrayToString(arr));

        int i = 0;
        while (i < n) {
            if (c[i] < i) {
                if (i % 2 == 0) {

                    swap(arr, 0, i);
                } else {
                    swap(arr, c[i], i);
                }
                list.add(arrayToString(arr));
                c[i]++;
                i = 0;
            } else {
                c[i] = 0;
                i++;
            }
        }
        return list;
    }

    private static String arrayToString(String[] arr) {
        return Stream.of(arr).collect(Collectors.joining());
    }

    private static void generatePermutationsOriginal(String... arr) {
        int n = arr.length;
        int[] c = new int[n];

        System.out.println(Arrays.toString(arr));

        int i = 0;

        while (i < n) {
            if (c[i] < i) {
                if (i % 2 == 0) {
                    swap(arr, 0, i);
                } else {
                    swap(arr, c[i], i);
                }
                System.out.println(Arrays.toString(arr));
                c[i]++;
                i = 0;
            } else {
                c[i] = 0;
                i++;
            }
        }
    }


    private static void swap(String arr[], int i, int j) {
        String temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

}
