package datastructures.trees.dfs;

import datastructures.trees.TreeNode;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;

public class VerticalOrderTraversal {
    public static void main(String[] args) {
        TreeNode root = new TreeNode(2);
        root.left = new TreeNode(3);
        root.right = new TreeNode(4);
        root.left.right = new TreeNode(5);
        verticalOrderTraversal(root);
    }

    public static ArrayList<ArrayList<Integer>> verticalOrderTraversal(TreeNode A) {
        HashMap<Integer, ArrayList<Integer>> map = new HashMap<Integer, ArrayList<Integer>>();
        verticalOrderTraversal(A, 0, map);
        Iterator itr = map.keySet().iterator();
        ArrayList<ArrayList<Integer>> res = new ArrayList<ArrayList<Integer>>();
        while (itr.hasNext()) {
            Integer key = (Integer) itr.next();
            res.add(map.get(key));
        }
        return res;
    }

    public static void verticalOrderTraversal(TreeNode A, int level,
                                              HashMap<Integer, ArrayList<Integer>> map) {
        if (A == null) {
            return;
        }

        ArrayList<Integer> list = new ArrayList<Integer>();
        if (map.containsKey(level)) {
            list = map.get(level);

        }
        list.add(A.val);
        map.put(level, list);
        verticalOrderTraversal(A.left, level - 1, map);
        verticalOrderTraversal(A.right, level - 1, map);
    }
}
