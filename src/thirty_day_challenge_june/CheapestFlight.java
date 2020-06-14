package thirty_day_challenge_june;

import java.util.Arrays;

public class CheapestFlight {

    public int findCheapestPrice(int n, int[][] flights, int src, int dst, int K) {
        K++;
        int [][] dp = new int[K+1][n];

        for (int i=0; i<=K; i++)
            Arrays.fill(dp[i], -1);

        dp[0][src] = 0;

        for (int i=1; i<=K; i++) {
            dp[i] = dp[i-1].clone();
            for (int[] flight : flights) {
                int u = flight[0];
                int v = flight[1];
                int cost = flight[2];
                if (dp[i-1][u] != -1)
                    dp[i][v] = (dp[i][v] != -1) ? Math.min(dp[i-1][u] + cost, dp[i][v]) : (dp[i-1][u] + cost);
            }
        }

        return dp[K][dst];
    }
}
