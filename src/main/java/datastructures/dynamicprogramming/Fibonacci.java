package datastructures.dynamicprogramming;

import java.util.Arrays;

public class Fibonacci {
    static int dp[];


    public static void main(String[] args) {
        int n = 10;
        dp = new int[n + 1];
        Arrays.fill(dp, -1);
        System.out.println(fibBottomUp2(n));
    } // 0, 1, 1, 2, 3

    // Top-down
    static int fib(int n) {
        if (n <= 1) {
            return n;
        }
        if (dp[n] == -1) {
            dp[n] = fib(n - 1) + fib(n - 2);
        }
        return dp[n];
    }

    // Bottom up
    static int fibBottomUp(int n) {
        dp[0] = 0;
        dp[1] = 1;
        for (int i = 2; i <= n; i++) {
            dp[i] = dp[i - 1] + dp[i - 2];
        }
        return dp[n];
    }

    // Bottom up
    static int fibBottomUp2(int n) {
        int a = 0;
        int b = 1;
        for (int i = 2; i <= n; i++) {
            int c = a + b;
            a = b;
            b = c;
        }
        return b;
    }
}
