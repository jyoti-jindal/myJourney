package datastructures.trees.dfs;

import datastructures.trees.TreeNode;

import java.util.ArrayList;

public class FindPath {
    public static void main(String[] args) {
        TreeNode root = new TreeNode(2);
        root.left = new TreeNode(3);
        root.right = new TreeNode(4);
        root.left.right = new TreeNode(5);
        root.left.left = new TreeNode(10);
        ArrayList<Integer> path = solve(root, 10);
        for (Integer i : path) {
            System.out.print(i + " ");
        }
        System.out.println();
        path = solve(root, 3);
        for (Integer i : path) {
            System.out.print(i + " ");
        }
    }

    public static ArrayList<Integer> solve(TreeNode A, int B) {
        ArrayList<Integer> list = new ArrayList<Integer>();
        findPath(A, B, list);
        return list;
    }

    static boolean findPath(TreeNode A, int B, ArrayList<Integer> list) {
        if (A == null) {
            return false;
        }

        if (A.val == B) {
            list.add(A.val);
            return true;
        }

        if (findPath(A.left, B, list) ||
                findPath(A.right, B, list)) {
            list.add(0, A.val);
            return true;
        }
        return false;
    }
}
