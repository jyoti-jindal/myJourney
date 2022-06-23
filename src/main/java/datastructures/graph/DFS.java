package datastructures.graph;

import java.util.ArrayList;
import java.util.HashMap;

public class DFS {
    public static void main(String[] args) {
        DFS dfs
                = new DFS();
        System.out.println(dfs.solve(new int[]{1, 1, 1, 3, 3, 2, 2, 7, 6}, 9, 1));// 1->2,3, 3->4,5, 2->6,7, 7->8, 6->9
    }

    public int solve(int[] A, final int B, final int C) {

        HashMap<Integer, ArrayList<Integer>> map = new HashMap<Integer, ArrayList<Integer>>();

        for (int i = 1; i < A.length; i++) {
            ArrayList<Integer> list = new ArrayList<Integer>();
            if (map.containsKey(A[i])) {
                list = map.get(A[i]);
            }
            list.add(i + 1);
            map.put(A[i], list);
        }

        // 1 -> 2-> 3

        return dfs(map, B, C);
    }

    int dfs(HashMap<Integer, ArrayList<Integer>> map, int B, int C) {
        if (C == B) {
            return 1;
        }

        if (!map.containsKey(C)) {
            return 0;
        }


        ArrayList<Integer> list = map.get(C);
        for (Integer i : list) {
            if (dfs(map, B, i) == 1) {
                return 1;
            }
        }
        return 0;
    }
}
