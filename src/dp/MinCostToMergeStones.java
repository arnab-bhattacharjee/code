package dp;

public class MinCostToMergeStones {

    int[][] dp;
    int[] cum;
    int[] stones;
    int n;
    int k;

    public int mergeStones(int[] stones, int K) {
        n = stones.length;
        if (K!=2 && n%(K-1) != 1) return -1;
        this.stones = stones;
        this.k = K;
        dp = new int[n][K+1];
        cum = new int[n];

        cum[0] = stones[0];
        for (int i=1; i<n; i++) {
            cum[i] = cum[i-1] + stones[i];
        }

        return mergeStones(0, 1);
    }

    private int mergeStones(int startIdx, int piles) {
        //System.out.println(startIdx + "\t" + piles);
        if (startIdx == n && piles == 0) return 0;
        if (piles == 0 || startIdx >= n) return -1;
        if (dp[startIdx][piles] != 0)
            return dp[startIdx][piles];

        boolean kMerge = false;

        // first pile is the ith pile
        int c1 = mergeStones(startIdx+1, piles-1);
        if (piles == 1 && startIdx != n-1) {
            c1 = mergeStones(startIdx+1, k-1);
            c1 += cum[n-1]-((startIdx-1>=0) ? cum[startIdx-1] : 0);
        } else {
            c1 = mergeStones(startIdx+1, piles-1);
        }

        // first pile is k-consecutive pile
        int c2;
        if (piles == 1 && n-startIdx > k) {
            c2 = mergeStones(startIdx+k, k-1);
            c2 += cum[n-1]-((startIdx-1>=0) ? cum[startIdx-1] : 0);
        } else {
            c2 = mergeStones(startIdx+k, piles - 1);
        }
        if (c2 != -1) {
            c2 += cum[startIdx + k - 1] - ((startIdx - 1 >= 0) ? cum[startIdx - 1] : 0);
        }

        int res;
        if (c1 == -1)
            res = c2;
        else if (c2 == -1)
            res = c1;
        else
            res = Math.min(c1,c2);

        dp[startIdx][piles] = res;
        System.out.println(startIdx + "\t" + piles + "\t : " + dp[startIdx][piles]);
        return res;
    }
}
