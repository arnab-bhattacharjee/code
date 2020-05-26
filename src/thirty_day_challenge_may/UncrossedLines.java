package thirty_day_challenge_may;

public class UncrossedLines {

    public int maxUncrossedLines(int[] A, int[] B) {
        int a_n = A.length;
        int b_n = B.length;

        int[][] dp = new int[a_n][b_n];

        for (int i=0; i<a_n; i++) {
            for (int j=0; j<b_n; j++) {
                if (A[i] == B[j]) {
                    dp[i][j] = 1 + ((i-1>=0 && j-1>=0) ? dp[i-1][j-1] : 0);
                } else {
                    dp[i][j] = Math.max((j-1 >= 0) ? dp[i][j-1] : 0, (i-1 >= 0) ? dp[i-1][j] : 0);
                }
            }
        }

        return dp[a_n-1][b_n-1];
    }
}
