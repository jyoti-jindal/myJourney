package datastructures.trees.bsf;

import datastructures.trees.TreeNode;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class LeftView {
    public static void main(String[] args) {
        TreeNode treeNode = new TreeNode(1);
        treeNode.left = new TreeNode(2);
        treeNode.right = new TreeNode(3);
        treeNode.left.left = new TreeNode(4);
        treeNode.left.right = new TreeNode(5);
        treeNode.right.left = new TreeNode(6);
        treeNode.right.right = new TreeNode(7);
        ArrayList<Integer> list = leftView(treeNode);

        for (Integer c : list) {
            System.out.print(c + " ");
        }
    }

    static ArrayList<Integer> leftView(TreeNode A) {
        if (A == null) {
            return null;
        }
        ArrayList<Integer> list = new ArrayList<Integer>();
        Queue<TreeNode> que = new LinkedList<TreeNode>();
        que.add(A);
        while (!que.isEmpty()) {
            int size = que.size();
            for (int i = 0; i < size; i++) {
                TreeNode node = que.poll();
                if (i == 0) {
                    list.add(node.val);
                }

                if (node.left != null) {
                    que.add(node.left);
                }

                if (node.right != null) {
                    que.add(node.right);
                }
            }
        }
        return list;
    }
}
