package datastructures.dynamicprogramming;

public class EditDistance {
    int[][] dp;

    public static void main(String[] args) {
        EditDistance editDistance = new EditDistance();
        System.out.println(editDistance.minDistance("aac", "abac"));
    }

    public int minDistance(String A, String B) {
        int la = A.length();
        int lb = B.length();
        dp = new int[la + 1][lb + 1];
        for (int i = 0; i <= la; i++) {
            for (int j = 0; j <= lb; j++) {
                dp[i][j] = -1;
            }
        }
        return minDistance(A, la, B, lb);
    }

    public int minDistance(String A, int la, String B, int lb) {
        if (dp[la][lb] == -1) {


            if (la == 0 && lb == 0) {
                dp[la][lb] = 0;
            }

            if (la == 0)
                dp[la][lb] = lb;
            if (lb == 0)
                dp[la][lb] = la;

            if (A.charAt(la - 1) == B.charAt(lb - 1)) {
                dp[la][lb] = minDistance(A, la - 1, B, lb - 1);
            } else {
                dp[la][lb] = 1 + Math.min(Math.min(minDistance(A, la - 1, B, lb),
                        minDistance(A, la, B, lb - 1)), minDistance(A, la - 1, B, lb - 1));
            }
        }
        return dp[la][lb];

    }
}
