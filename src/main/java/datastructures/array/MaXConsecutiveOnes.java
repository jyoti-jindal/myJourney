package datastructures.array;

import java.util.HashMap;
import java.util.Iterator;

public class MaXConsecutiveOnes {
    public static void main(String[] args) {
        HashMap<Integer, Boolean> map = new HashMap<Integer, Boolean>();
        Iterator itr = map.keySet().iterator();
        while (itr.hasNext()) {
            Integer key = (Integer) itr.next();
            if (map.containsKey(key)) {

            }
        }
        System.out.println(solve(new int[]{1, 0, 0, 1, 1, 0, 1}, 2));
    }

    public static int solve(int[] A, int B) {
        int n = A.length;
        int count = 0, l = 0;
        int ans = 0;
        for (int i = 0; i < n; i++) {
            if (A[i] == 0) {
                count++;
            }

            while (count > B) {
                if (A[l] == 0) {
                    count--;
                }
                l++;
            }
            ans = Math.max(ans, i - l + 1);
        }
        return ans;
    }
}
