package datastructures.recursion;

import java.util.ArrayList;
import java.util.List;

public class Subsets {

    public static void main(String[] args) {
        ArrayList<Integer> A = new ArrayList<Integer>();
        A.add(12);
        A.add(13);
        ArrayList<ArrayList<Integer>> res = subsets(A);
    }
    public static ArrayList<ArrayList<Integer>> subsets(ArrayList<Integer> A) {
        int n = A.size();
        return genSubSet(n-1, A);
    }

    static ArrayList<ArrayList<Integer>> genSubSet(int n, List<Integer> A) {
        if (n == 0) {
            ArrayList<ArrayList<Integer>> result = new ArrayList<ArrayList<Integer>>();
            ArrayList<Integer> list = new ArrayList<Integer>();
            result.add(list);
            list = new ArrayList<Integer>();
            list.add(A.get(n));
            result.add(list);
            return result;
        }
        Integer i = A.get(n);
        ArrayList<ArrayList<Integer>> result = genSubSet(n-1, A);
        ArrayList<ArrayList<Integer>> outer = new ArrayList<ArrayList<Integer>>();

        for(int k=0; k<result.size(); k++) {
            ArrayList<Integer> in = result.get(k);
            ArrayList<Integer> inner = new ArrayList<Integer>();
            for(Integer integer: in) {
                inner.add(integer);
            }
            outer.add(inner);
        }

        for(int k=result.size()-1; k>=0; k--) {
            ArrayList<Integer> in = result.get(k);
            ArrayList<Integer> inner = new ArrayList<Integer>();
            for(Integer integer: in) {
                inner.add(integer);
            }
            inner.add(i);
            outer.add(inner);
        }
        return outer;
    }
}
