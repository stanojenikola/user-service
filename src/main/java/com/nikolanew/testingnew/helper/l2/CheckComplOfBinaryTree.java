package com.nikolanew.testingnew.helper.l2;

import java.util.LinkedList;
import java.util.Queue;

public class CheckComplOfBinaryTree {
    public boolean isCompleteTree(TreeNode root) {
        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);

        while (!queue.isEmpty()) {
            TreeNode node = queue.poll();

            // Trick here is that if you encounter  null between two non-null values, it ain't complete binary tree.
            if (node == null && queue.peek() != null) return false;

            if (node != null)  {
                queue.add(node.left);
                queue.add(node.right);
            }
        }

        return true;
    }
}


class TreeNode {
      int val;
      TreeNode left;
      TreeNode right;
      TreeNode() {}
      TreeNode(int val) { this.val = val; }
      TreeNode(int val, TreeNode left, TreeNode right) {
          this.val = val;
          this.left = left;
          this.right = right;
      }
  }
