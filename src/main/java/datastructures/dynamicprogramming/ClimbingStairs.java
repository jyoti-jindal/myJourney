package datastructures.dynamicprogramming;

import java.util.Arrays;

public class ClimbingStairs {
    static int dp[];

    public static void main(String[] args) {
        int n = 4;
        dp = new int[n + 1];
        Arrays.fill(dp, -1);
        System.out.println(ways(n));
    }

    static int ways(int n) {
        if (n <= 1) {
            return 1;
        }

        if (dp[n] == -1) {
            dp[n] = ways(n - 1) + ways(n - 2);
        }
        return dp[n];
    }
}
