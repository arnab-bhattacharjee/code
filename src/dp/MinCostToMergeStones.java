package dp;

import org.omg.CORBA.MARSHAL;

public class MinCostToMergeStones {

    int[][] dp;
    int[] cum;
    int[] stones;
    int n;
    int k;

    public int mergeStones(int[] stones, int K) {
        n = stones.length;
        if ((n-1)%(K-1) > 0) return -1;
        this.stones = stones;
        this.k = K;
        dp = new int[n][n];
        cum = new int[n];

        cum[0] = stones[0];
        for (int i=1; i<n; i++) {
            cum[i] = cum[i-1] + stones[i];
        }

        return mergeStones(0, n-1);
    }

    private int mergeStones(int startIdx, int endIdx) {
        if (startIdx == endIdx)
            return 0;

        if (dp[startIdx][endIdx] != 0)
            return dp[startIdx][endIdx];

        dp[startIdx][endIdx] = Integer.MAX_VALUE;

        for (int i=startIdx; i<endIdx; i+=k-1) {
            dp[startIdx][endIdx] = Math.min(dp[startIdx][endIdx]
            , mergeStones(startIdx, i) + mergeStones(i+1, endIdx));
        }
        if ((endIdx-startIdx) % (k-1) == 0)
            dp[startIdx][endIdx] += cum[endIdx]-(startIdx-1 >= 0 ? cum[startIdx-1] : 0);

        return dp[startIdx][endIdx];
    }
}
