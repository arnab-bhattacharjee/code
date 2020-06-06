package dp;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class TallestBillboard {

    private int[][] dp;
    private int n;
    private int[] rods;

    public int tallestBillboard(int[] rods) {
        n = rods.length;
        dp = new int[n][10000];
        this.rods = rods;

        for (int i=0; i<n; i++)
            Arrays.fill(dp[i], -1);

        return tallestBillboard(n-1, 0);
    }

    private int tallestBillboard(int idx, int diff) {
        if (idx < 0) return 0;

        if (dp[idx][diff+5000] != -1) {
            return dp[idx][diff+5000];
        }

        int val = tallestBillboard(idx-1, diff + rods[idx]) + rods[idx];

        val = Math.max(tallestBillboard(idx-1, diff - rods[idx]), val);

        val = Math.max(tallestBillboard(idx-1, diff), val);

        return dp[idx][diff+5000] = val;
    }
}
