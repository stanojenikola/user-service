package com.nikolanew.testingnew.helper;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Hashtable;
import java.util.Map;
import java.util.Stack;
import java.util.stream.Collectors;

public class BinarySearch {

    public static void main(String[] args) {
        // System.out.println(size());
        int[] intarray = {2, 7, 11, 15};
        twoTwoDymensionalArray();
    }
    public static int[] twoSum2(int[] nums, int target) {

        int i = 0;
        int k = nums.length - 1;
        int currentSum;

        while (i < nums.length && k < nums.length) {

            // System.out.println("i: " + i);
            // System.out.println("k: " + k);
            currentSum = nums[i] + nums[k];
            // System.out.println("is ok" + nums[i]);
            // System.out.println("is ok" + nums[k]);
            // System.out.println("currentSum" + currentSum);
            System.out.println("_______________________________________________");
            System.out.println("nums[i]:" + nums[i]);
            System.out.println("nums[k]: " + nums[k]);
            System.out.println("currentSum: " + currentSum);

            System.out.println("_______________________________________________");

            if (currentSum == target) {
                System.out.println("is ok");
                System.out.println("nums[i]:" + nums[i]);
                System.out.println("nums[k]: " + nums[k]);
            } else {
                i++;
                k--;
            }
        }

        int[] a = {2, 3};
        return a;
    }

    private static class Node {

        private int data;
        private Node left, right;

        public Node(int value) {
            data = value;
            left = right = null;
        }
    }

    private static Node root = new Node(2);

    public BinarySearch() {
        root = null;
    }

    public Node getRoot() {
        return root;
    }

    public boolean isEmpty() {
        return null == root;
    }

    private static int size() {
        Node current = root;

        int size = 0;

        Stack<Node> stack = new Stack<Node>();

        while (!stack.isEmpty() || current != null) {
            if (current != null) {
                stack.push(current);
                current = current.left;
            } else {
                size++;
                current = stack.pop();
                current = current.right;
            }
        }

        return size;
    }




    int size2() {
        Node current = root;
        int size2 = 0;
        var stack = new Stack<Node>();
        while(!stack.isEmpty() || current!=null) {


            if (current != null) {
                stack.push(current);
                current = current.left;
            } else {
                size2++;
                stack.pop();
                current = current.right;
            }
        }

        return size2;
    }


    static void twoTwoDymensionalArray() {
        int[][] arr = {{3,4, 5, }, {6, 7, 8}, {9, 10, 11}};

        for (int row = 0; row < arr.length; row++) {
            for (int column = 0; column < arr[0].length; column++) {
                System.out.println(arr.length);
                System.out.println(arr[0].length);
                arr[column][row] = arr[row][column];
            }
        }

        System.out.println(Arrays.toString(arr));
    }
}
