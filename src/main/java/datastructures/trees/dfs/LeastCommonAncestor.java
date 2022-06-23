package datastructures.trees.dfs;

import datastructures.trees.TreeNode;

public class LeastCommonAncestor {
    public static void main(String[] args) {
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        System.out.println(lca(root, 2, 3));
    }

    public static int lca(TreeNode A, int B, int C) {
        return lCA(A, Math.min(B, C), Math.max(B, C));
    }

    public static int lCA(TreeNode A, int B, int C) {
        if (A == null) {
            return 0;
        }

        if (A.val >= B && A.val <= C) {
            return A.val;
        } else if (A.val > B && A.val > C) {
            return lCA(A.left, B, C);
        } else if (A.val < B && A.val < C) {
            return lCA(A.right, B, C);
        }

        return A.val;
    }
}
