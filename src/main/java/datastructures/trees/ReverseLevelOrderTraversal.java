package datastructures.trees;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class ReverseLevelOrderTraversal {
    public static void main(String[] args) {
        TreeNode treeNode = new TreeNode(1);
        treeNode.left = new TreeNode(2);
        treeNode.right = new TreeNode(3);
//        treeNode.left.left = new TreeNode(4);
//        treeNode.left.right = new TreeNode(5);
        treeNode.right.left = new TreeNode(6);
        treeNode.right.right = new TreeNode(7);
        List<Integer> result = levelOrder(treeNode);
        for (Integer c : result) {
            System.out.print(c + " ");
        }
    }

    public static List<Integer> levelOrder(TreeNode root) {
        if (root == null) return null;

        List<Integer> wrapList = new ArrayList<Integer>();
        Queue<TreeNode> que = new LinkedList<TreeNode>();
        que.add(root);
        while (!que.isEmpty()) {
            TreeNode node = que.poll();
            if (node.right != null) que.add(node.right);
            if (node.left != null) que.add(node.left);
            wrapList.add(node.val);
        }
        ArrayList<Integer> list = new ArrayList<Integer>();
        for (int i = wrapList.size() - 1; i >= 0; i--) {
            list.add(wrapList.get(i));
        }
        return list;
    }
}
