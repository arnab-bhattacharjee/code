package dp;

public class CountDiffPalindromicSubsequences {

    public static final int MOD = 1000000007;

    public int countPalindromicSubsequences(String S) {
        int n = S.length();
        int dp[][] = new int [n][n];

        // base case len = 1
        for (int i=0; i<n; i++) dp[i][i] = 2;

        for (int l=2; l<=n; l++) {
            for (int i=0; i<=n-l; i++) {
                int j = i+l-1;
                if (S.charAt(i) == S.charAt(j)) {
                    if (l == 2) {
                        dp[i][j] = 3;
                    } else {
                        int i1 = i + 1;
                        while (i1 < j) {
                            if (S.charAt(i1) == S.charAt(i))
                                break;
                            i1++;
                        }
                        int j1 = j - 1;
                        while (j1 > i) {
                            if (S.charAt(j1) == S.charAt(i))
                                break;
                            j1--;
                        }

                        if (i1 == j) {
                            dp[i][j] = 2 * dp[i + 1][j - 1] + 1;
                        } else if (i1 == j1) {
                            dp[i][j] = 2 * dp[i + 1][j - 1];
                        }
                        else {
                            if (i1+1>j1-1) {
                                dp[i][j] = 2 * dp[i + 1][j - 1] - 1;
                            } else {
                                dp[i][j] = 2 * dp[i + 1][j - 1] - dp[i1 + 1][j1 - 1];
                            }
                        }
                    }
                } else {
                    if (l == 2) dp[i][j] = 3;
                    else
                        dp[i][j] = dp[i][j-1] + dp[i+1][j] - dp[i+1][j-1];
                }
                dp[i][j] %= MOD;
                //System.out.println(i + "\t" + j + "\t" + dp[i][j]);
            }
        }

        return dp[0][n-1]-1;
    }
}
