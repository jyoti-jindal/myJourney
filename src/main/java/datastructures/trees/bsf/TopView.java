package datastructures.trees.bsf;

import datastructures.trees.Pair;
import datastructures.trees.TreeNode;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.Queue;

public class TopView {
    public static void main(String[] args) {
        TopView topView = new TopView();
        TreeNode root = new TreeNode(2);
        root.left = new TreeNode(3);
        root.right = new TreeNode(4);
        root.left.left = new TreeNode(1);
        root.left.right = new TreeNode(5);
        ArrayList<Integer> res = topView.topView(root);
        for (Integer i : res) {
            System.out.print(i + " ");
        }
    }

    ArrayList<Integer> topView(TreeNode A) {
        if (A == null) {
            return null;
        }

        ArrayList<Integer> list = new ArrayList<Integer>();
        Queue<Pair> que = new LinkedList<Pair>();
        HashSet<Integer> set = new HashSet<Integer>();
        que.add(new Pair(A, 0));
        while (!que.isEmpty()) {
            int size = que.size();
            for (int i = 0; i < size; i++) {
                Pair p = que.poll();
                int dist = p.dist;
                TreeNode node = p.treeNode;
                if (!set.contains(dist)) {
                    list.add(node.val);
                    set.add(dist);
                }

                if (node.left != null) {
                    que.add(new Pair(node.left, dist - 1));
                }
                if (node.right != null) {
                    que.add(new Pair(node.right, dist + 1));
                }
            }
        }
        return list;
    }
}
