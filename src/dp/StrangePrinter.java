package dp;

public class StrangePrinter {

    public int strangePrinter(String s) {
        int n = s.length();
        int dp[][] = new int[n][n];

        for (int i=0 ; i<n; i++) {
            dp[i][i] = 1;
        }

        for (int l=2; l<=n; l++) {
            for (int i = 0; i < n-l+1; i++) {
                int j = i+l-1;
                dp[i][j] = dp[i][j-1] + 1;
                int k;
                for (k=j-1; k>=i; k--) {
                    if (s.charAt(j) == s.charAt(k))
                        if (k == j-1) {
                            dp[i][j] = dp[i][j-1];
                            break;
                        } else {
                            dp[i][j] = Math.min(dp[i][k] + dp[k+1][j-1], dp[i][j]);
                        }
                }
            }
        }

        return dp[0][n-1];
    }
}
