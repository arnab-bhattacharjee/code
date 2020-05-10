package dp;

import java.util.HashMap;
import java.util.Map;

public class TallestBillboard {

    public int tallestBillboard(int[] rods) {
        int n = rods.length;
        int sum = 0;
        for (int i=0; i<n; i++)
            sum += rods[i];

        int targetSum = sum/2;
        if (sum%2 == 1) return 0;

        Map<Integer, Integer>[] dp = new Map[n];
        for (int i=0; i<n; i++) {
            dp[i] = new HashMap<>();
            dp[i].put(0, 0);
        }

        for (int i=0; i<n; i++) {
            for (int j=-targetSum; j<=targetSum; j++) {
                int tallest = Integer.MIN_VALUE;
                if (i-1 >= 0)
                    tallest = dp[i-1].getOrDefault(j, Integer.MIN_VALUE);
                tallest = Math.max(tallest, dp[i].getOrDefault(j - rods[i], Integer.MIN_VALUE));
                tallest = Math.max(tallest, dp[i].getOrDefault(j + rods[i], Integer.MIN_VALUE));
                if (tallest != Integer.MIN_VALUE)
                    dp[i].put(j, tallest);
            }
        }
        return dp[n-1].get(0);

    }
}
