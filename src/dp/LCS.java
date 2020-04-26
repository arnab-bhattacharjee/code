package dp;

public class LCS {

    public int longestCommonSubsequence(String text1, String text2) {
        int n = text1.length();
        int m = text2.length();

        if (n == 0 || m == 0) return 0;

        int[][] dp = new int[n][m];

        for (int i=0; i<n; i++) {
            for (int j=0; j<m; j++) {
                // base case
                if (i == 0 && j == 0)
                    dp[0][0] = (text1.charAt(0) == text2.charAt(0)) ? 1 : 0;
                else {
                    if (text1.charAt(i) == text2.charAt(j)) {
                        dp[i][j] = 1 + ((i-1>=0 && j-1>=0) ? dp[i-1][j-1] : 0);
                    } else {
                        int lcs1 = (j-1>=0) ? dp[i][j-1] : 0;
                        int lcs2 = (i-1>=0) ? dp[i-1][j] : 0;
                        dp[i][j] = Math.max(lcs1, lcs2);
                    }
                }
            }
        }
        return dp[n-1][m-1];
    }
}
