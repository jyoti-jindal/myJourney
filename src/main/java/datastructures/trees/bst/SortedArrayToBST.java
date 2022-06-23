package datastructures.trees.bst;

import datastructures.trees.TreeNode;

public class SortedArrayToBST {

    public static void main(String[] args) {
        SortedArrayToBST sortedArrayToBST = new SortedArrayToBST();
        TreeNode tree = sortedArrayToBST.sortedArrayToBST
                (new int[]{90, 228, 245, 290, 397, 471, 572, 649, 688, 710, 823, 829, 830, 859, 932, 939, 962});

    }

    public TreeNode sortedArrayToBST(final int[] A) {
        int n = A.length;
        TreeNode root = new TreeNode(A[n / 2]);
        TreeNode node = root;
        for (int i = (n / 2) - 1; i >= 0; i--) {
            node.left = new TreeNode(A[i]);
            node = node.left;
        }
        node = root;
        for (int i = (n / 2) + 1; i < n; i++) {
            node.right = new TreeNode(A[i]);
            node = node.right;
        }
        return root;
    }
}
