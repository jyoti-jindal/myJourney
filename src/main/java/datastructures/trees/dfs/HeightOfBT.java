package datastructures.trees.dfs;

import datastructures.trees.TreeNode;

public class HeightOfBT {
    public static void main(String[] args) {
        TreeNode root = new TreeNode(2);
        root.left = new TreeNode(3);
        root.right = new TreeNode(4);
        root.left.right = new TreeNode(5);
        System.out.println(height(root));
    }

    static int height(TreeNode root) {
        if (root == null) {
            return 0;
        }

        return Math.max(height(root.left),
                height(root.right)) + 1;
    }
}
