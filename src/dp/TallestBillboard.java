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
        this.rods = rods;

        dp = new int[10001][n];

        int maxCap = Arrays.stream(rods).sum();

        for (int i = 0; i < n; i++) {
            for (int c = 0; c <= maxCap; c++) {
                dp[c + 5000][i] = -1;
                dp[-c + 5000][i] = -1;
                if (c - rods[i] == 0) {
                    dp[c + 5000][i] = Math.max(rods[i], dp[c + 5000][i]);
                    dp[-c + 5000][i] = Math.max(rods[i], dp[-c + 5000][i]);
                }


                if (i - 1 >= 0 && dp[c + 5000 - rods[i]][i - 1] != -1) {
                    // adding to positive capacity
                    dp[c + 5000][i] = Math.max(dp[c + 5000 - rods[i]][i - 1] + rods[i], dp[c + 5000][i]);
                }

                if (i - 1 >= 0 && -c + 5000 - rods[i] >= 0 && dp[-c + 5000 - rods[i]][i - 1] != -1) {
                    // adding to negative capacity
                    dp[-c + 5000][i] = Math.max(dp[-c + 5000 - rods[i]][i - 1] + rods[i], dp[-c + 5000][i]);
                }

                if (i - 1 >= 0 && dp[-c + 5000 + rods[i]][i - 1] != -1) {
                    // reducing from negative capacity
                    dp[-c + 5000][i] = Math.max(dp[-c + 5000 + rods[i]][i - 1] + rods[i], dp[-c + 5000][i]);
                }

                if (i - 1 >= 0 && c + 5000 + rods[i] <= 10000 && dp[c + 5000 + rods[i]][i - 1] != -1) {
                    // reducing from positive capacity
                    dp[c + 5000][i] = Math.max(dp[c + 5000 + rods[i]][i - 1] + rods[i], dp[c + 5000][i]);
                }

                dp[c + 5000][i] = Math.max((i - 1 >= 0) ? dp[c + 5000][i - 1] : 0, dp[c + 5000][i]);
                dp[-c + 5000][i] = Math.max((i - 1 >= 0) ? dp[-c + 5000][i - 1] : 0, dp[-c + 5000][i]);
            }
        }

        return dp[5000][n-1]>>1;
    }

}
