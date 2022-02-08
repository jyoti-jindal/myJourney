package datastructures.twopointers;

import java.util.HashMap;
import java.util.Iterator;

public class DiffPair {
    public static void main(String[] args) {
        System.out.println(solve(new int[]{1,1}, 0));
    }

    public static int solve(int[] A, int B) {
        int n = A.length;
        HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();

        for(int i=0; i<n; i++) {
            int count = 1;
            if(map.containsKey(A[i])) {
                count = map.get(A[i])+1;
            }
            map.put(A[i], count);
        }

        int ans = 0;

        Iterator<Integer> iterator = map.keySet().iterator();
        while (iterator.hasNext()) {
            int data = iterator.next();
            if (B == 0) {
                if (map.get(data)>1) {
                    ans++;
                }
            } else {
                if(map.containsKey(data+B)) {
                    ans++;
                }
            }
        }
        return ans;
    }
}
