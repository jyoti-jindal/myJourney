package datastructures.heap;

import java.util.Comparator;
import java.util.PriorityQueue;

public class MaxArraySumAfterBNegations {
    public static void main(String[] args) {
        System.out.println(solve(new int[]{57, 3, -14, -87, 42, 38, 31, -7, -28, -61}, 10)
        );
    }

    public static int solve(int[] A, int B) {
        PriorityQueue<Integer> que = new PriorityQueue<Integer>();
        for (int i = 0; i < A.length; i++) {
            que.add(A[i]);
        }

        for (int i = 0; i < B; i++) {
            int data = que.poll();
            que.add(-1 * data);
        }

        int sum = 0;
        while (!que.isEmpty()) {
            sum += que.poll();
        }
        return sum;
    }
}