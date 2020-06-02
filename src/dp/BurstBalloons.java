package dp;

public class BurstBalloons {

    public int maxCoins(int[] nums) {
        int n = nums.length;

        int[][] dp = new int[n][n];

        for (int i = 0; i < n; i++)
            dp[i][i] = ((i - 1 >= 0) ? nums[i - 1] : 1) * nums[i] * ((i + 1 < n) ? nums[i + 1] : 1);

        for (int l = 2; l <= n; l++) {
            for (int i = 0; i < n-l+1; i++) {
                int j = i+l-1;
                dp[i][j] = Integer.MIN_VALUE;
                for (int k=i; k<=j; k++) {
                    dp[i][j] = Math.max(
                            ((k-1 >= 0) ? dp[i][k-1] : 0)
                                    + ((k+1 < n) ? dp[k+1][j] : 0)
                                    + (nums[k] * ((i - 1 >= 0) ? nums[i - 1] : 1) * ((j + 1 < n) ? nums[j + 1] : 1))
                            , dp[i][j]);
                }
            }
        }
        return dp[0][n-1];
    }
}
