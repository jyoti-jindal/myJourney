package datastructures.trees.dfs;

import datastructures.trees.TreeNode;

public class InOrderTraversal {
    void inOrder(TreeNode root) {
        if (root == null) {
            return;
        }
        inOrder(root.left);
        System.out.println(root.val);
        inOrder(root.right);
    }
}
