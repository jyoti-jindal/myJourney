package datastructures.trees.bsf;

import datastructures.trees.TreeNode;

import java.util.LinkedList;
import java.util.Queue;

public class DistanceBetweenNodes {
    public static void main(String[] args) {
        TreeNode A = new TreeNode(13);
        A.left = new TreeNode(27);
        A.right = new TreeNode(19);
        A.right.right = new TreeNode(36);
        System.out.println(solve(A, 27, 36));
    }

    public static int solve(TreeNode A, int B, int C) {
        Queue<Pair> que = new LinkedList<Pair>();
        que.add(new Pair(A, 0));
        Integer first = null, second = null;
        while (!que.isEmpty()) {
            int size = que.size();
            for (int i = 0; i < size; i++) {
                Pair p = que.poll();
                TreeNode node = p.node;
                int dist = p.dist;
                if (node.val == B) {
                    if (first == null) {
                        first = dist;
                    } else {
                        second = dist;
                    }
                } else if (node.val == C) {
                    if (first == null) {
                        first = dist;
                    } else {
                        second = dist;
                    }
                }
                if (node.left != null) {
                    que.add(new Pair(node.left, dist - 1));
                }

                if (node.right != null) {
                    que.add(new Pair(node.right, dist + 1));
                }
            }
        }
        if (first != null && second != null) {
            return Math.abs(first - second);
        } else {
            return 0;
        }
    }

    // root = 0
    // root.left -1
}

//         13
//    27        19
// 44    10   24    36

class Pair {
    TreeNode node;
    int dist;

    Pair(TreeNode node, int dist) {
        this.node = node;
        this.dist = dist;
    }
}
