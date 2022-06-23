package datastructures.trees.dfs;

import datastructures.trees.TreeNode;

import java.util.ArrayList;

public class IsSameTree {
    public static void main(String[] args) {
        TreeNode root = new TreeNode(2);
        root.left = new TreeNode(3);
        root.right = new TreeNode(4);
        root.left.right = new TreeNode(5);
        System.out.println(isSameTree(root, root));
    }

    public static int isSameTree(TreeNode A, TreeNode B) {
        ArrayList<Integer> listA = inOrderTraversal(A);
        ArrayList<Integer> listB = inOrderTraversal(B);
        System.out.println(listA.size() + " " + listB.size());
        if (listA.size() != listB.size()) {
            return 0;
        }
        for (int i = 0; i < listA.size(); i++) {
            Integer dataA = listA.get(i);
            Integer dataB = listB.get(i);

            if (dataA.equals(dataB)) {
                System.out.println(dataA + " " + dataB);
                return 0;
            }
        }
        return 1;

    }

    public static ArrayList<Integer> inOrderTraversal(TreeNode A) {
        if (A == null) {
            return new ArrayList<Integer>();
        }

        ArrayList<Integer> list = new ArrayList<Integer>();
        list.addAll(inOrderTraversal(A.left));
        list.add(A.val);
        list.addAll(inOrderTraversal(A.right));
        return list;

    }
}
