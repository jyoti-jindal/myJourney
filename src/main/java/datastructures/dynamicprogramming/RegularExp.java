package datastructures.dynamicprogramming;

public class RegularExp {

    public static void main(String[] args) {
        RegularExp regularExp = new RegularExp();
        System.out.println(1 | 0);
        System.out.println(
                regularExp.isMatch("a",
                        "*b"));
    }

    // DO NOT MODIFY THE ARGUMENTS WITH "final" PREFIX. IT IS READ ONLY
//    public int isMatch(final String A, final String B) {
//        return isMatch(A, A.length(), B, B.length());
//    }

    int dp[][];

    public int isMatch(final String A, final String B) {
        int n = A.length();
        int m = B.length();
        dp = new int[n + 1][m + 1];
        dp[0][0] = 1;
        // for(int i=0; i<n+1; i++) {
        for (int j = 1; j < m + 1; j++) {
            if (B.charAt(j - 1) == '*') {
                dp[0][j - 1] = 1;
            } else {
                break;
            }
        }

        // }
        return isMatch(A, A.length(), B, B.length());
    }

    public int isMatch(final String A, int n, final String B, int m) {

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= m; j++) {
                if ((A.charAt(i - 1) == B.charAt(j - 1)) || B.charAt(j - 1) == '?') {
                    dp[i][j] = dp[i - 1][j - 1];
                } else if (B.charAt(j - 1) == '*') {
                    dp[i][j] = dp[i - 1][j] | dp[i][j - 1];
                }
            }
        }


        return dp[n][m];
    }

//    public int isMatch(final String A, int la, final String B, int lb) {
//        if (la == 0 && lb == 0) {
//            return 1;
//        }
//        if(lb==0) {
//            return 0;
//        }
//
//        if (la == 0) {
//            if (B.charAt(lb - 1) == '*') {
//                return isMatch(A, la, B, lb - 1);
//            } else {
//                return 0;
//            }
//
//        }
//
//        if (B.charAt(lb - 1) >= 'a' && B.charAt(lb - 1) <= 'z' && A.charAt(la - 1) != B.charAt(lb - 1)) {
//            return 0;
//        }
//
//        if ((A.charAt(la - 1) == B.charAt(lb - 1)) || B.charAt(lb - 1) == '?') {
//            return isMatch(A, la - 1, B, lb - 1);
//        } else {
//            return isMatch(A, la - 1, B, lb) | isMatch(A, la, B, lb - 1);
//        }
//    }
}