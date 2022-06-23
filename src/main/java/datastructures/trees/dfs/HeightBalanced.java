package datastructures.trees.dfs;

import datastructures.trees.TreeNode;

public class HeightBalanced {
    public static void main(String[] args) {
        TreeNode root = new TreeNode(2);
        root.left = new TreeNode(3);
        root.right = new TreeNode(4);
        root.left.right = new TreeNode(5);
        root.left.left = new TreeNode(5);
        root.left.left.right = new TreeNode(5);
        root.left.left.left = new TreeNode(5);
        System.out.println(isBalanced(root));
    }

    public static boolean isBalanced(TreeNode A) {
        if (A == null) {
            return true;
        }
        int l = heightBalanced(A.left);
        int r = heightBalanced(A.right);
        if (Math.abs(l - r) > 1) {
            return false;
        }

        return isBalanced(A.left) && isBalanced(A.right);
    }

    public static int heightBalanced(TreeNode A) {
        if (A == null) {
            return 0;
        }
        int l = heightBalanced(A.left);
        int r = heightBalanced(A.right);
        return 1 + Math.max(l, r);
    }
}
