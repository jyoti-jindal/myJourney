package datastructures.backtracking;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayWithOneZero {
    public static void main(String[] args) {
        List<List<Integer>> result = new ArrayList<List<Integer>>();
        int n = 4;
        genArray(0, new int[n], n, result);
        for (int i = 0; i < result.size(); i++) {
            List<Integer> list = result.get(i);
            for (Integer c : list) {
                System.out.print(c + " ");
            }
            System.out.println();
        }
    }

    static void genArray(int index, int[] cur, int N, List<List<Integer>> result) {
        if(N==index) {
            List<Integer> l = new ArrayList<Integer>();
            for(int c: cur) {
                l.add(c);
            }
            result.add(l);
            return;
        }
        cur[index] = 0;
        genArray(index+1, cur, N, result);
        cur[index] = 1;
        genArray(index+1, cur, N, result);
    }
}
