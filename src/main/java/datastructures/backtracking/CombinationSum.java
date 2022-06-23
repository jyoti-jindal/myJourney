package datastructures.backtracking;

import java.util.ArrayList;
import java.util.Collections;

public class CombinationSum {
    public static void main(String[] args) {
        CombinationSum combinationSum = new CombinationSum();
        ArrayList<Integer> A = new ArrayList<Integer>();
        A.add(2);
        A.add(3);
        A.add(6);
        A.add(7);
        ArrayList<ArrayList<Integer>> res = combinationSum.combinationSum(A, 7);
        for (ArrayList<Integer> a : res) {
            for (Integer i : a) {
                System.out.print(i + ",");
            }
            System.out.println();
        }
    }

    public ArrayList<ArrayList<Integer>> combinationSum(ArrayList<Integer> A, int B) {
        ArrayList<ArrayList<Integer>> res = new ArrayList<ArrayList<Integer>>();
        Collections.sort(A);
        for (int i = 0; i < A.size(); i++) {
            ArrayList<Integer> cur = new ArrayList<Integer>();
            cur.add(A.get(i));
            combinationSum(cur, res, A, B, i, A.get(i));
        }
        return res;
    }


    public void combinationSum(ArrayList<Integer> curlist, ArrayList<ArrayList<Integer>> res, ArrayList<Integer> A, int B, int idx, int sum) {
        if (sum > B) {
            return;
        }

        if (sum == B) {
            ArrayList<Integer> temp = new ArrayList<Integer>();
            for (Integer it : curlist) {
                temp.add(it);
            }

            res.add(temp);
        }
        if (idx == A.size()) {
            return;
        }
        curlist.add(A.get(idx));
        combinationSum(curlist, res, A, B, idx, sum + A.get(idx));
        int n = curlist.size();
//        sum -= A.get(idx);
        curlist.remove(n - 1);
        if (idx + 1 == A.size()) {
            return;
        }
        curlist.add(A.get(idx + 1));
        combinationSum(curlist, res, A, B, idx + 1, sum + A.get(idx + 1));
        curlist.remove(curlist.size() - 1);
    }


}
//     [2, 3]
//       /\
//     [2] [3] B=2

//     [2, 3, 6, 7]
//         /\
//     [2] []
//     /\
// [2]  [2, 3]

