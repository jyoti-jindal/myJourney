package datastructures.backtracking;

import java.util.ArrayList;
import java.util.Collections;

public class Permutation {
    public static void main(String[] args) {
        Permutation permutation = new Permutation();
        ArrayList<Integer> list = new ArrayList<Integer>();
        list.add(1);
        list.add(2);
        list.add(3);
        ArrayList<ArrayList<Integer>> res = permutation.permute(list);
        for (ArrayList<Integer> a : res) {
            for (Integer i : a) {
                System.out.print(i + " ");
            }
            System.out.println();
        }
    }

    public ArrayList<ArrayList<Integer>> permute(ArrayList<Integer> A) {
        ArrayList<ArrayList<Integer>> res = new ArrayList<ArrayList<Integer>>();
        permute(A, 0, res);
        return res;
    }

    public void permute(ArrayList<Integer> A, int idx, ArrayList<ArrayList<Integer>> res) {
        if (idx == A.size() - 1) {
            add(A, res);
            return;
        }

        for (int i = idx; i < A.size(); i++) {
            Collections.swap(A, i, idx);
            permute(A, idx + 1, res);
            Collections.swap(A, i, idx);
        }
    }

    void add(ArrayList<Integer> curlist, ArrayList<ArrayList<Integer>> result) {
        ArrayList<Integer> l = new ArrayList<Integer>();
        for (int i = 0; i < curlist.size(); i++) {
            l.add(curlist.get(i));
        }
        result.add(l);
    }

}
