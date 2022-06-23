package datastructures.sorting;

import java.util.Arrays;
import java.util.HashMap;

public class UniquePairs {
    public static void main(String[] args) {
        System.out.println(solve(new int[]{51, 6, 10, 8, 22, 61, 56, 48, 88, 85, 21, 98, 81, 76, 71, 68, 18, 6, 14,
                23, 72, 18, 56, 30, 97, 100, 81, 5, 99, 2, 85, 67, 46, 32, 66, 51, 76, 53, 36, 31, 81, 56, 26, 75,
                69, 54, 54, 54, 83, 41, 86, 48, 7, 32, 85, 23, 47, 23, 18, 45, 79, 95, 73, 15, 55, 16, 66, 73, 13,
                85, 14, 80, 39, 92, 66, 20, 22, 25, 34, 14, 51, 14, 17, 10, 100, 35, 9, 83, 31, 60, 24, 37, 69, 62}));
    }

    public static int solve(int[] A) {
        Arrays.sort(A);
        int count = 0;

        HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < A.length; i++) {
            int cnt = 1;
            if (map.containsKey(A[i])) {
                cnt = map.get(A[i]) + 1;
            }
            map.put(A[i], cnt);
            min = Math.min(A[i], min);
        }

        for (int i = 0; i < A.length; ) {
            int x = A[i];
            while (map.containsKey(x) && map.get(x) > 1) {
                int t = map.get(x) - 1;
                count += t;
                map.put(x, 1);
                x = x + 1;
                if (map.containsKey(x)) {
                    t = map.get(x) + 1;
                }
                map.put(x, t);
            }
            i++;
        }
        return count;
    }
}
