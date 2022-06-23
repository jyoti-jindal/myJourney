package datastructures.backtracking;

import java.util.ArrayList;
import java.util.List;

public class GenerateNumber {
    public static void main(String[] args) {
        GenerateNumber generateNumber = new GenerateNumber();
        List<Integer> list = generateNumber.generateNum(2, new int[]{1, 2, 3, 4, 5});
        for (Integer i : list) {
            System.out.print(i + " ");
        }
    }

    List<Integer> generateNum(int n, int[] A) {
        if (n == 0) {
            return new ArrayList<Integer>();
        }
        if (n == 1) {
            ArrayList<Integer> arrayList = new ArrayList<Integer>();
            for (int j = 0; j < A.length; j++) {
                arrayList.add(A[j]);
            }
            return arrayList;
        }
        List<Integer> list = generateNum(n - 1, A);
        ArrayList<Integer> arrayList = new ArrayList<Integer>();
        for (int i = 0; i < list.size(); i++) {
            for (int j = 0; j < A.length; j++) {
                arrayList.add(list.get(i) * 10 + A[j]);
            }
        }
        return arrayList;
    }
}
