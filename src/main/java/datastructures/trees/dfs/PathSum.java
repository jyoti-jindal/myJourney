package datastructures.trees.dfs;

import datastructures.trees.TreeNode;

public class PathSum {
    public static void main(String[] args) {
        TreeNode root = new TreeNode(1000);
        root.left = new TreeNode(2000);
        root.left.left = new TreeNode(-3001);
        System.out.println(hasPathSum(root, -1));
    }

    public static int hasPathSum(TreeNode A, int B) {
        if (A == null) {
            return 0;
        }
        if (B - A.val == 0 && A.left == null && A.right == null) {
            return 1;
        }

        return hasPathSum(A.left, B - A.val) | hasPathSum(A.right, B - A.val);
    }
}
