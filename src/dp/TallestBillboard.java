package dp;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class TallestBillboard {

    public int tallestBillboard(int[] rods) {
        int n = rods.length;

        int maxCap = Arrays.stream(rods).sum();
        int[] dp = new int[(maxCap<<1) + 1];

        for (int i=0; i<dp.length; i++)
            dp[i] = -1;

        dp[maxCap] = 0;

        for (int i = 0; i < n; i++) {
            int[] t = Arrays.copyOf(dp, dp.length);
            for (int c = 0; c <= maxCap; c++) {
                if (t[c + maxCap - rods[i]] != -1) {
                    dp[c + maxCap] = Math.max(t[c + maxCap - rods[i]] + rods[i], dp[c + maxCap]);
                    dp[-c + maxCap] = dp[c + maxCap];
                }

                if (-c + maxCap - rods[i] >= 0 && t[-c + maxCap - rods[i]] != -1) {
                    dp[-c + maxCap] = Math.max(t[-c + maxCap - rods[i]] + rods[i], dp[-c + maxCap]);
                    dp[c + maxCap] = dp[-c + maxCap];
                }

            }
        }

        return (dp[maxCap] == -1) ? 0 : dp[maxCap]>>1;
    }
}
