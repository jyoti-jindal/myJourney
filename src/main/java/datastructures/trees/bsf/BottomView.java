package datastructures.trees.bsf;

import datastructures.trees.Pair;
import datastructures.trees.TreeNode;

import java.util.*;

public class BottomView {
    public static void main(String[] args) {
        BottomView bottomView = new BottomView();
        TreeNode root = new TreeNode(2);
        root.left = new TreeNode(3);
        root.right = new TreeNode(4);
        root.left.left = new TreeNode(1);
        root.left.right = new TreeNode(5);
        ArrayList<Integer> list = bottomView.bottomView(root);
        for (Integer i : list) {
            System.out.print(i + " ");
        }
    }

    ArrayList<Integer> bottomView(TreeNode A) {
        if (A == null) {
            return null;
        }
        ArrayList<Integer> list = new ArrayList<Integer>();
        Queue<Pair> que = new LinkedList<Pair>();
        que.add(new Pair(A, 0));
        HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
        while (!que.isEmpty()) {
            int size = que.size();
            for (int i = 0; i < size; i++) {
                Pair p = que.poll();
                int dist = p.dist;
                TreeNode node = p.treeNode;
                map.put(dist, node.val);
                if (node.left != null) {
                    que.add(new Pair(node.left, dist - 1));
                }
                if (node.right != null) {
                    que.add(new Pair(node.right, dist + 1));
                }
            }
        }

        Iterator itr = map.keySet().iterator();
        while (itr.hasNext()) {
            Integer i = (Integer) itr.next();
            list.add(map.get(i));
        }
        return list;
    }
}
