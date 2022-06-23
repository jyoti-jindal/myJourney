package datastructures.dynamicprogramming;

public class WaysToDecode {
    int[] dp;

    public static void main(String[] args) {
        WaysToDecode waysToDecode = new WaysToDecode();

//        Arrays.fill(dp, -1);
        System.out.println(waysToDecode.numDecodings("2611055971756562"));
    }

    public int numDecodings(String A) {
        int n = A.length();
        dp = new int[n + 1];
        if (n == 0 || (n == 1 && A.charAt(0) == '0')) {
            return 0;
        }
        return waysToDecode(A, n);
    }

    public int waysToDecode(String A, int n) {
        dp[0] = 1;
        dp[1] = 1;

        for (int i = 2; i <= n; i++) {
            if (A.charAt(i - 1) > '0') {
                dp[i] = dp[i - 1];
            }

            if (A.charAt(i - 2) == '1' || (A.charAt(i - 2) == '2' && A.charAt(i - 1) < '7')) {
                dp[i] += dp[i - 2];
            }
        }

        return dp[n];
    }


//    public int waysToDecode(String A, int i) {
//
//        if (i == 0 || i == 1) {
//            return 1;
//        }
//
//        if (A.charAt(0) == '0') {
//            return 0;
//        }
//
//        int count = 0;
//        if (A.charAt(i - 1) != '0') {
//            int c = (A.charAt(i - 1) - '0');
//            if(dp[c] == -1)
//                dp[c] = waysToDecode(A, i - 1);
//
//            count = dp[c];
//        }
//
//        if (A.charAt(i - 2) == '1' ||
//                (A.charAt(i - 2) == '2' && A.charAt(i - 1) < '7')) {
//            StringBuilder builder = new StringBuilder().append(A.charAt(i - 2)).append(A.charAt(i-1));
//            int c = Integer.valueOf(builder.toString());
//            if(dp[c] == -1)
//                dp[c] = waysToDecode(A, i - 2);
//
//            count+= dp[c];
//        }
//        return count;
//    }
}
