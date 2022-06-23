package datastructures.trees.dfs;

import datastructures.trees.TreeNode;

public class PreOrderTraversal {
    void preOrder(TreeNode root) {
        if (root == null) {
            return;
        }

        System.out.println(root.val);
        preOrder(root.left);
        preOrder(root.right);
    }
}
