package datastructures.trees.dfs;

import datastructures.trees.TreeNode;

public class SearchElement {
    public static void main(String[] args) {
        TreeNode root = new TreeNode(2);
        root.left = new TreeNode(3);
        root.right = new TreeNode(4);
        root.left.right = new TreeNode(5);
        System.out.println(search(root, 2));
        System.out.println(search(root, 20));

    }

    static int search(TreeNode A, int K) {
        if (A == null) return 0;
        if (A.val == K) return 1;
        search(A.left, K);
        search(A.right, K);
        return 0;
    }
}
