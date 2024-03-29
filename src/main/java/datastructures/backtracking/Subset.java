package datastructures.backtracking;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Subset {
    static int k = 1;

    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<Integer>();
        list.add(1);
        list.add(2);
        list.add(3);
        ArrayList<ArrayList<Integer>> result = subsets(list);
        for (int i = 0; i < result.size(); i++) {
            ArrayList<Integer> arrayList = result.get(i);
            for (Integer it : arrayList) {
                System.out.print(it + " ");
            }
            System.out.println();
        }
    }

//    static void genSubset(int[][] res, int[] A, int index, int[] cur,  int curSize) {
//        if(index == A.length) {
//            cur[curSize-1] = 0;
//            return;
//        }
//        cur[curSize] = A[index];
//        int[] copy = new int[cur.length];
//        for(int i =0 ; i<=curSize; i++) {
//            copy[i] = cur[i];
//        }
//        res[k++] = copy;
//        genSubset(res, A, index+1, cur, curSize+1);
//        if(curSize == A.length) return;
//        cur[curSize-1] = A[index];
//        copy = new int[cur.length];
//        for(int i =0 ; i<curSize; i++) {
//            copy[i] = cur[i];
//        }
//        res[k++] = copy;
//        genSubset(res, A, index+1, cur, curSize+1);
//    }
//
//    static void genSubSet(ArrayList<Integer> A, int index, List<Integer> cur, int N, List<List<Integer>> result) {
//        if(N==index) {
//            return;
//        }
//        cur.add(A.get(index));
//        result.add(cur.subList(0, index));
//        genSubSet(A,index+1, cur, N, result);
//        // cur.add(list.get(index));
//        // genSubSet(index+1, cur, N, result);
//    }

    public static ArrayList<ArrayList<Integer>> subsets(ArrayList<Integer> A) {
        int n = A.size();
//        Collections.sort(A);
        ArrayList<ArrayList<Integer>> result = new ArrayList<ArrayList<Integer>>();
        ArrayList<Integer> list = new ArrayList<Integer>();
        genSubSet(new ArrayList<Integer>(), 0, A, result, 0);
        return result;
    }

    static void genSubSet(ArrayList<Integer> curlist, int idx, List<Integer> A, ArrayList<ArrayList<Integer>> result, int k) {
        if (idx == A.size()) {
            ArrayList<Integer> l = new ArrayList<Integer>();
            for (int i = 0; i < curlist.size(); i++) {
                l.add(curlist.get(i));
            }
//            Collections.copy(l, curlist);
            result.add(l);
            return;
        }
//        for(int i=idx; i<A.size(); i++) {
        curlist.add(A.get(idx));
        genSubSet(curlist, idx + 1, A, result, k++);
        curlist.remove(curlist.size() - 1);
        genSubSet(curlist, idx + 1, A, result, k++);
//        }
    }
}