package com.nikolanew.testingnew.helper.geeksforgeeks;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Deque;
import java.util.HashMap;

public class GeeksForGeeks {

    public static void main(String[] args) {
        int A[] = {63, 70, 80, 33, 33, 47, 20};
        // System.out.println(leaders(A, A.length));

        // kthSmallest(A, 0, A.length - 1, 4);

        int[] b = {6, 1, 15, 19, 9, 13, 12, 6, 7, 2, 10, 4, 1, 14, 11, 14, 14, 13};
        // System.out.println(majorityElement2(b, b.length));
        var newCharArray = "[()]{}{[(";
        int Arr[] = {1, 5, 8, 10};
        int arr2[] = {2, 6, 3, 4, 7, 2, 10, 3, 2, 1};
        System.out.println("test: " + getMinDiff(arr2, Arr.length, 5));
        long At[] = {1, 3, 5, 2, 2};
        equilibriumPoint(At, At.length);
    }

    static ArrayList<Integer> leaders(int arr[], int n) {
        var list = new ArrayList<Integer>();
        int i = 0;
        int j = 0;
        while (j <= n) {
            j = i + 1;
            if (j < n) {
                if (arr[i] < arr[j]) {
                    if (j + 1 < n) {
                        if (arr[j + 1] < arr[j]) {
                            list.add(arr[j]);
                        }
                    }
                }
            }
            i++;
        }

        if (n > 1) {
            list.add(arr[n - 1]);
        }
        return list;
    }

    static int majorityElement(int a[], int size) {
        var map = new HashMap<Integer, Integer>();
        Arrays.sort(a);
        for (int i = 0; i < a.length; i++) {
            if (map.get(a[i]) == null) {
                map.put(a[i], 1);
            } else {
                map.put(a[i], map.get(a[i]) + 1);
            }
        }

        final int[] finalValue = {0};
        // AtomicInteger key = new AtomicInteger();
        final int[] key = new int[1];
        map.forEach((k, v) -> {
            if (v > finalValue[0]) {
                finalValue[0] = v;
                key[0] = k;

            }
        });
        return key[0];
    }

    static int majorityElement2(int a[], int size) {
        int finalCount = 0;
        int finalNumber = 0;
        for (int i = 0; i < size; i++) {
            int tempCount = 0;
            int currentNumber = 0;
            for (int j = 0; j < size; j++) {
                if (a[i] == a[j]) {
                    tempCount++;
                    currentNumber = a[i];
                }
            }

            if (finalCount < tempCount) {
                finalCount = tempCount;
                finalNumber = currentNumber;
            }

        }

        return finalCount == 1 ? -1 : finalNumber;
    }

    static boolean ispar(String expr) {
        Deque<Character> deque = new ArrayDeque<Character>();
        for (int i = 0; i < expr.length(); i++) {
            char c = expr.charAt(i);

            if (c == '[' || c == '{' || c == '(') {
                deque.push(c);
                continue;
            }

            if (deque.isEmpty()) {
                return false;
            }
            char check;
            switch (c) {
                case ']': {
                    check = deque.pop();
                    if (check == '(' || check == '{') {
                        return false;
                    }
                    break;
                }
                case ')': {
                    check = deque.pop();
                    if (check == '[' || check == '{') {
                        return false;
                    }
                    break;

                }
                case '}': {
                    check = deque.pop();
                    if (check == '(' || check == '[') {
                        return false;
                    }
                    break;

                }
            }
        }
        return deque.isEmpty();
    }

    static int getMinDiff(int[] arr, int n, int k) {
        Arrays.sort(arr);

        int maxHeight = arr[n - 1] - arr[0];
        int min = arr[0];
        int max = arr[n - 1];

        for (int i = 1; i < n; i++) {
            if (arr[i] - k < 0) {
                continue;
            }
            min = Math.min(arr[0] + k, arr[i] - k);
            max = Math.max(arr[i - 1] + k, arr[n - 1] - k);
            maxHeight = Math.min(maxHeight, max - min);
        }

        return maxHeight;
    }

    boolean isBST(Node root) {
        return isBSTUtil(root, Integer.MIN_VALUE, Integer.MAX_VALUE);
    }

    boolean isBSTUtil(Node node, int min, int max) {
        if (node == null) {
            return true;
        }

        if (node.data < min || node.data > max) {
            return false;
        }

        return (isBSTUtil(node.left, min, node.data - 1) && isBSTUtil(node.right, node.data + 1,
            max));
    }

    public static int equilibriumPoint(long arr[], int n) {
        var index = n % 2 == 1 ? (n / 2) + 1 : n / 2;
        var sumLeft = 0;
        var sumRight = 0;

        if (n == 1) {
            return 1;
        }

        for (int i = 0; i < n; i++) {

            if (i < index) {
                sumLeft += arr[i];
            }
            if (index > i) {
                sumRight += arr[i];
            }
        }

        if (sumRight == sumLeft) {
            return index;
        }

        return -1;

        // Your code here
    }
}


class Node {

    int data;
    Node left, right;

}
