package datastructures.backtracking;

import java.util.ArrayList;
import java.util.List;

public class Sixlets {
    static int count = 0;

    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<Integer>();
        list.add(5);
        list.add(17);
        list.add(1000);
        list.add(1);
        System.out.println(solve(list, 4));
    }

    public static int solve(ArrayList<Integer> A, int B) {
        genSubSet(new ArrayList<Integer>(), 0, A, B, 0);
        return count;
    }

    static void genSubSet(ArrayList<Integer> curlist, int idx, List<Integer> A, int B, int curSum) {
        if (B == curlist.size()) {
            if (curSum <= 1000) {
                count++;
            }
            return;
        }

        if (curlist.size() > B || idx >= A.size()) {
            return;
        }


        curSum += A.get(idx);
        curlist.add(A.get(idx));
        genSubSet(curlist, idx + 1, A, B, curSum);
        int lastIdx = curlist.size() - 1;
        curSum -= curlist.get(lastIdx);
        curlist.remove(lastIdx);
        genSubSet(curlist, idx + 1, A, B, curSum);
    }
}
