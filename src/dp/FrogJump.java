package dp;

import java.util.Arrays;

public class FrogJump {

    public boolean canCross(int[] stones) {
        int n = stones.length;

        // dp[i][k] represents if i is reachable by taking a jump of k units
        boolean[][] dp = new boolean[n][n];

        if (stones[1] != 1) return false;
        if (n == 2) {
            if (stones[n-1] == 1)
                return true;
            else return false;
        }
        // base case
        dp[1][1] = true;

        for (int i=2; i<n; i++) {
            for (int k=1; k<n; k++) {
                int idx;
                if (stones[i]-k+1>=1) {
                    idx = Arrays.binarySearch(stones, stones[i] - k);
                    if (idx >= 0) {
                        dp[i][k] |= dp[idx][k];
                    }
                }
                if (k-1 > 0 && stones[i]-k+1>=1) {
                    idx = Arrays.binarySearch(stones, stones[i] - k + 1);
                    if (idx >= 0) {
                        dp[i][k-1] |= dp[idx][k];
                    }
                }
                if (stones[i]-k-1 >= 1 && k+1<n) {
                    idx = Arrays.binarySearch(stones, stones[i] - k - 1);
                    if (idx >= 0) {
                        dp[i][k+1] |= dp[idx][k];
                    }
                }
                if (i == n-1 && (dp[i][k-1] || dp[i][k] || dp[i][k+1])) return true;
            }
        }
        return false;
    }
}
