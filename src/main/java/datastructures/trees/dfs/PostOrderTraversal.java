package datastructures.trees.dfs;

import datastructures.trees.TreeNode;

import java.util.ArrayList;
import java.util.Stack;

public class PostOrderTraversal {
    public static void main(String[] args) {
        TreeNode root = new TreeNode(2);
        root.left = new TreeNode(3);
        root.right = new TreeNode(4);
        root.left.right = new TreeNode(5);
//        postOrder(root);
        ArrayList<Integer> list = postorderTraversal(root);
        System.out.println(list.toString());

    }

    static void postOrder(TreeNode root) {
        if (root == null) {
            return;
        }
        postOrder(root.left);
        postOrder(root.right);
        System.out.println(root.val);
    }

    public static ArrayList<Integer> postorderTraversal(TreeNode A) {
        ArrayList<Integer> list = new ArrayList<Integer>();
        Stack<TreeNode> st = new Stack<TreeNode>();
        st.push(A);

        while (!st.isEmpty()) {
            TreeNode node = st.peek();
            if (node.right != null) {
                st.push(node.right);
            }
            if (node.left != null) {
                st.push(node.left);
            }
            if (node.left == null && node.right == null) {
                st.pop();
                list.add(node.val);
                node = null;
            }
        }
        return list;
    }
}
