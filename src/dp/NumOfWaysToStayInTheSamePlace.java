package dp;

public class NumOfWaysToStayInTheSamePlace {

    public static final int MOD = 1000000007;

    public int numWays(int steps, int arrLen) {
        if (arrLen>250)
            arrLen = 250;
        int[][] dp = new int[arrLen][steps+1];

        // base case
        for (int i=0; i<arrLen; i++) {
            if (i == 0) dp[i][1] = 1;
            else if (i == 1) dp[i][1] = 1;
            else dp[i][1] = 0;
        }

        for (int k=2; k<= steps; k++) {
            for (int i=0; i<arrLen; i++) {
                int stay = dp[i][k-1];
                int leftMoves = ((i+1<arrLen) ? dp[i+1][k-1] : 0);
                int rightMoves = ((i-1>=0) ? dp[i-1][k-1] : 0);

                dp[i][k] = stay;
                dp[i][k] = (dp[i][k] + leftMoves)%MOD;
                dp[i][k] = (dp[i][k] + rightMoves)%MOD;
            }
        }

        return dp[0][steps];
    }
}
