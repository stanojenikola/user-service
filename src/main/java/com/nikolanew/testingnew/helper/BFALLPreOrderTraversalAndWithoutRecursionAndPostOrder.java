package com.nikolanew.testingnew.helper;

import java.util.Stack;

public class BFALLPreOrderTraversalAndWithoutRecursionAndPostOrder {

    public static void main(String[] args) {
        BFALLPreOrderTraversalAndWithoutRecursionAndPostOrder preOrderTraversal = new BFALLPreOrderTraversalAndWithoutRecursionAndPostOrder();

        BFALLPreOrderTraversalAndWithoutRecursionAndPostOrder.TreeNode root = new BFALLPreOrderTraversalAndWithoutRecursionAndPostOrder.TreeNode(
            "1");
        preOrderTraversal.node = root;
        preOrderTraversal.node.left = new BFALLPreOrderTraversalAndWithoutRecursionAndPostOrder.TreeNode(
            "2");
        preOrderTraversal.node.left.left = new BFALLPreOrderTraversalAndWithoutRecursionAndPostOrder.TreeNode(
            "3");
        preOrderTraversal.node.left.right = new BFALLPreOrderTraversalAndWithoutRecursionAndPostOrder.TreeNode(
            "4");
        preOrderTraversal.node.right = new BFALLPreOrderTraversalAndWithoutRecursionAndPostOrder.TreeNode(
            "5");
        preOrderTraversal.node.right.right = new BFALLPreOrderTraversalAndWithoutRecursionAndPostOrder.TreeNode(
            "6");

        //preOrderTraversal.preOrder();
        System.out.println();

        // without recursion
        //preOrderWithoutRecursion();

        // postOrder(node);

        // postOrderWithoutRecursion();
        // printLeafsWithReqursion(node);
        // System.out.println(countLeaf(node));
        inOrderTraversal(node);
    }


    static class TreeNode {

        String data;
        TreeNode left, right;

        TreeNode(String value) {
            this.data = value;
            left = right = null;
        }

        boolean isLeaf() {
            return left == null ? right == null : false;
        }
    }

    static TreeNode node;

    public void preOrder() {
        preOrder(node);
    }

    private void preOrder(TreeNode node) {
        if (node == null) {
            return;
        }
        System.out.print("-" + node.data);
        preOrder(node.left);
        preOrder(node.right);
    }

    public static void preOrderWithoutRecursion() {
        Stack<TreeNode> nodes = new Stack<>();
        nodes.push(node);

        while (!nodes.isEmpty()) {
            TreeNode current = nodes.pop();
            System.out.printf("%s ", current.data);

            if (current.right != null) {
                nodes.push(current.right);
            }
            if (current.left != null) {
                nodes.push(current.left);
            }
        }
    }

    private static void postOrder(TreeNode node) {
        if (node == null) {
            return;
        }

        postOrder(node.left);
        postOrder(node.right);
        System.out.printf("%s ", node.data);
    }

    private static void postOrderWithoutRecursion() {
        Stack<TreeNode> stack = new Stack<>();
        stack.push(node);

        while (!stack.isEmpty()) {
            TreeNode current = stack.peek();

            if (current.isLeaf()) {
                TreeNode node = stack.pop();
                System.out.printf("%s ", node.data);
            } else {
                if (current.right != null) {
                    stack.push(current.right);
                    current.right = null;
                }
                if (current.left != null) {
                    stack.push(current.left);
                    current.left = null;
                }
            }

        }

    }

    private static void printLeafsWithReqursion(TreeNode node) {

        if (node == null) {
            return;
        }

        if (node.isLeaf()) {
            System.out.println("leaf: " + node.data);
        }
        printLeafsWithReqursion(node.left);
        printLeafsWithReqursion(node.right);
    }


    // check the nodes!!
    private static int countLeaf(TreeNode input) {
        System.out.println(input);
        if (input == null) {
            return 0;
        }

        if (node.isLeaf()) {
            return 1;
        } else {

            return countLeaf(input.left) + countLeaf(input.right);
        }
    }

    // change the tree
    private static void inOrderTraversal(TreeNode input) {
        if (input == null) {
            return;
        }

        inOrderTraversal(node.left);

        inOrderTraversal(node.right);


    }


}
