package com.nikolanew.testingnew.helper;

import java.util.Stack;

public class BinarySearchTreeBST {

    private static class Node {

        private int data;
        Node left, right;

        Node(int data) {
            this.data = data;
            this.left = right = null;
        }
    }

    private static Node root;

    BinarySearchTreeBST() {
        root = null;
    }

    private static int size() {
        Node current = root;
        int _size = 0;

        Stack<Node> stack = new Stack<Node>();
        while (!stack.isEmpty() || current != null) {
            if (current != null) {
                stack.push(current);
                current = current.left;
            } else {
                _size++;
                current = stack.pop();
                current = current.right;
            }
        }

        return _size;
    }
}
