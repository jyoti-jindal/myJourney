package datastructures.trees.dfs;

import datastructures.trees.TreeNode;

import java.util.Stack;

public class InorderIterativeTraversal {
    public static void main(String[] args) {
        TreeNode root = new TreeNode(2);
        root.left = new TreeNode(3);
        root.right = new TreeNode(4);
        root.left.right = new TreeNode(5);
        inOrder(root);
    }

    public static void inOrder(TreeNode A) {
        Stack<TreeNode> st = new Stack<TreeNode>();
//        st.push(A);
        TreeNode cur = A;
        while (cur != null || !st.isEmpty()) {
            if (cur != null) {
                st.push(cur);
                cur = cur.left;
            } else {
                TreeNode node = st.pop();
                System.out.println(node.val);
                cur = node.right;
            }
        }
    }
}
