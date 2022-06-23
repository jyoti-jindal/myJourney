package datastructures.trees.bst;

import datastructures.trees.TreeNode;

public class SearchElement {
    public static void main(String[] args) {
        TreeNode root = new TreeNode(20);
        root.left = new TreeNode(10);
        root.right = new TreeNode(30);
        root.left.left = new TreeNode(5);
        root.left.right = new TreeNode(18);
        root.right.right = new TreeNode(50);
        System.out.println(search(root, 18));
        System.out.println(search(root, 15));

    }

    public static boolean search(TreeNode A, int K) {
        if (A == null) {
            return false;
        }

        if (A.val == K) {
            return true;
        }

        if (A.val > K) {
            return search(A.left, K);
        } else {
            return search(A.right, K);
        }
    }
}
