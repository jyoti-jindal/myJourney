package datastructures.trees;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class LevelOrderTraversal {
    public static void main(String[] args) {
        TreeNode treeNode = new TreeNode(1);
        treeNode.left = new TreeNode(2);
        treeNode.right = new TreeNode(3);
        treeNode.left.left = new TreeNode(4);
        treeNode.left.right = new TreeNode(5);
        treeNode.right.left = new TreeNode(6);
        treeNode.right.right = new TreeNode(7);
        List<List<Integer>> result = levelOrder(treeNode);
        for (int i = 0; i < result.size(); i++) {
            List<Integer> list = result.get(i);
            for (Integer c : list) {
                System.out.print(c + " ");
            }
            System.out.println();
        }
    }

    public static List<List<Integer>> levelOrder(TreeNode root) {
        if (root == null) return null;

        List<List<Integer>> wraplist = new ArrayList<List<Integer>>();
        Queue<TreeNode> que = new LinkedList<TreeNode>();
        que.add(root);
        while (!que.isEmpty()) {
            int level = que.size();
            List<Integer> inner = new ArrayList<Integer>();
            for (int i = 0; i < level; i++) {
                TreeNode node = que.poll();
                if (node.left != null) que.add(node.left);
                if (node.right != null) que.add(node.right);
                inner.add(node.val);
            }
            wraplist.add(inner);
        }
        return wraplist;
    }
}
