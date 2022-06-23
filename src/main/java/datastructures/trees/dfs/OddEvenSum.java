package datastructures.trees.dfs;

import datastructures.trees.TreeNode;

public class OddEvenSum {
    public int solve(TreeNode A) {
        Pair p = new Pair(0, 0);
        dfs(A, p, 1);
        return p.sumOdd - p.sumEven;
    }

    void dfs(TreeNode A, Pair pair, int level) {
        if (A == null) {
            return;
        }

        if (level % 2 == 0) {
            pair.sumEven += A.val;
        } else {
            pair.sumOdd += A.val;
        }
        dfs(A.left, pair, level + 1);
        dfs(A.right, pair, level + 1);
    }

}

class Pair {
    int sumOdd;
    int sumEven;

    Pair(int sumOdd, int sumEven) {
        this.sumOdd = sumOdd;
        this.sumEven = sumEven;
    }
}