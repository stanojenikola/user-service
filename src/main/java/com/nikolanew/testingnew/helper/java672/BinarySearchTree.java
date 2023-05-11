package com.nikolanew.testingnew.helper.java672;

public class BinarySearchTree {


    public static void main(String[] args) {
        BinarySearchTree binarySearchTree = new BinarySearchTree();
        binarySearchTree.addNode(5, "node5");
        binarySearchTree.addNode(2, "node2");
        binarySearchTree.addNode(1, "node1");
        binarySearchTree.addNode(6, "node6");
        binarySearchTree.addNode(7, "node7");
        binarySearchTree.inOrderTraverseTree(binarySearchTree.root);

        //main
        // binarySearchTree.preOrderTraverseTree(binarySearchTree.root);
        //binarySearchTree.postOrderTraverseTree(binarySearchTree.root);


    }
    int strstr(String s, String x)
    {
        var a = s.contains(x);

        System.out.println(a);
        return 1;
    }
    void inOrderTraverseTree(TreeNode node) {
        if (node != null) {

            inOrderTraverseTree(node.left);
            System.out.println(node);

            inOrderTraverseTree(node.right);
        }
    }

    void preOrderTraverseTree(TreeNode node) {
        if (node != null) {
            System.out.println(node);

            inOrderTraverseTree(node.left);
            inOrderTraverseTree(node.right);
        }
    }

    void postOrderTraverseTree(TreeNode node) {
        if (node != null) {
            inOrderTraverseTree(node.left);
            inOrderTraverseTree(node.right);
            System.out.println(node);
        }
    }

    TreeNode root;


    void add2(int key, String name) {
        var newNode = new TreeNode(key, name);

        if (root == null) {
            root = newNode;
        } else {
            TreeNode focusNode = root;
            TreeNode parent;

            while (true) {
                parent = focusNode;
                if (key < focusNode.key) {
                    focusNode = focusNode.left;
                    // then place the new node on the left of it
                    if (focusNode == null) {
                        parent.left = newNode;
                        return; // close while(true)
                    }
                } else {
                    focusNode = focusNode.right;
                    if (focusNode == null) {
                        parent.right = newNode;
                        return;
                    }
                }
            }
        }
    }


    void addNode(int key, String name) {
        var newNode = new TreeNode(key, name);

        if (root == null) {
            root = newNode;
        } else {
            TreeNode current = root;
            TreeNode parent;

            while (true) {
                parent = current;

                if (key < current.key) {
                    current = current.left;

                    if (current == null) {
                        parent.left = newNode;
                        return;
                    }
                } else {
                    current = current.right;

                    if (current == null) {
                        parent.right = newNode;
                        return;
                    }
                }
            }
        }
    }
}

class TreeNode {

    TreeNode left, right;

    int key;
    String name;

    TreeNode(int key, String name) {
        this.name = name;
        this.key = key;
    }

    public String toString() {
        return name;
    }
}
