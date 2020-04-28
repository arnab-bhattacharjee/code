package dp;

import java.util.Arrays;
import java.util.Comparator;

public class RussianDollEnvelopes {

    public int maxEnvelopes(int[][] envelopes) {
        int n = envelopes.length;
        if (n < 2) return n;
        Arrays.sort(envelopes, Comparator.comparingInt(e -> e[0]));

        int[] dp = new int[n];
        int res = 0;

        // base case
        dp[0] = 1;

        for (int i=1; i<n; i++) {
            dp[i] = 1; //  trivially
            for (int j=0; j<i; j++) {
                if (envelopes[i][1]>envelopes[j][1] && envelopes[i][0]>envelopes[j][0]) {
                    dp[i] = Math.max(dp[i], dp[j] + 1);
                }
            }
            res = Math.max(res, dp[i]);
        }

        return res;
    }
}
