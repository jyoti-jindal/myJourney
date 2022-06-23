package datastructures.trees.bst;

import datastructures.trees.TreeNode;

public class isBST {
    public static void main(String[] args) {
        TreeNode root = new TreeNode(2147483647);
        NodeInfo node = isBST(root);
        if (node.isBST) {
            System.out.println(1);
        } else {
            System.out.println(0);

        }
    }

    public static NodeInfo isBST(TreeNode A) {
        if (A == null) {
            return new NodeInfo(true, Integer.MIN_VALUE, Integer.MAX_VALUE);
        }

        NodeInfo left = isBST(A.left);
        NodeInfo right = isBST(A.right);

        if (left.isBST && right.isBST && A.val >= left.max && A.val <= right.min) {
            return new NodeInfo(true, Math.max(Math.max(A.val, left.max), right.max),
                    Math.min(Math.min(A.val, left.min), right.min));
        }

        return new NodeInfo(false, Math.max(Math.max(A.val, left.max), right.max),
                Math.min(Math.min(A.val, left.min), right.min));
    }

    static class NodeInfo {
        boolean isBST;
        int max;
        int min;

        NodeInfo(boolean isBST, int max, int min) {
            this.isBST = isBST;
            this.max = max;
            this.min = min;
        }
    }
}