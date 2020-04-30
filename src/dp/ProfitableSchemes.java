package dp;

public class ProfitableSchemes {

    public static final int MOD = 1000000007;

    public int profitableSchemes(int G, int P, int[] group, int[] profit) {
        int n = profit.length;
        int[][][] dp = new int[P+1][G+1][n];

        for (int i=0; i<=P; i++) { // profit
            for (int j=1; j<=G; j++) { // people
                for (int k=0; k<n; k++) { // schemes
                    // if ith crime isn't committed
                    dp[i][j][k] = (k-1>=0) ? dp[i][j][k-1] : 0;
                    // if ith crime is committed
                    if (i-profit[k] >= 0 && j-group[k] > 0 && k-1>=0)
                        dp[i][j][k] = (dp[i][j][k] + dp[i-profit[k]][j-group[k]][k-1]) % MOD;
                    else if (j-group[k] > 0 && k-1>= 0)
                        dp[i][j][k] = (dp[i][j][k] + dp[0][j-group[k]][k-1]) % MOD;

                    if (profit[k] >= i && group[k] <= j)
                        dp[i][j][k] = (dp[i][j][k] + 1) % MOD;
                }
            }
        }

        return (P == 0) ? (dp[P][G][n-1] + 1)%MOD : dp[P][G][n-1];
    }
}
