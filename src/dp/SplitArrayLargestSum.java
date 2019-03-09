package dp;

public class SplitArrayLargestSum {

    private int[][] dp;
    private int[] cum;

    public int splitArray(int[] nums, int m) {
        if (nums.length ==1 ) return nums[0];

        cum = new int[nums.length];
        cum[0] = nums[0];
        for(int i=1;i<nums.length;i++) {
            cum[i] = cum[i-1]+nums[i];
        }

        dp = new int[m+1][nums.length];

        for (int k=1;k<=m;k++) {
            for (int i = 0; i < nums.length; i++) {
                if (k == 1) {
                    dp[k][i] = cum[i];
                } else {
                    dp[k][i] = Integer.MAX_VALUE;
                    for (int j = k-1; j < i; j++) {
                        dp[k][i] = Math.min(dp[k][i], Math.max(dp[k - 1][j], cum[i] - cum[j]));
                    }
                }
            }
        }

        return dp[m][nums.length-1];
    }
}
