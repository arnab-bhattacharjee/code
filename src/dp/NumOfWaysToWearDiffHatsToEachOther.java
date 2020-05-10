package dp;

import java.util.ArrayList;
import java.util.List;

public class NumOfWaysToWearDiffHatsToEachOther {

    public static final int MOD = (int)1E9+7;

    public int numberWays(List<List<Integer>> hats) {
        int n = hats.size();
        int maxHat = 0;
        List<Integer>[] h = new List[41];
        for (int i=0; i<h.length; i++)
            h[i] = new ArrayList<>();

        for (int i=0; i<n; i++) {
            for (int j=0; j<hats.get(i).size(); j++) {
                int hatNum = hats.get(i).get(j);
                maxHat= Math.max(hatNum, maxHat);
                h[hatNum].add(i);
            }
        }

        int[][] dp = new int[1<<n][maxHat+1];

        for (int i=0; i <= maxHat; i++)
            dp[0][i] = 1;

        for (int i = 1; i< (1<<n); i++) {
            for (int j = 1; j<=maxHat; j++) {
                dp[i][j] = dp[i][j-1];
                for (int k : h[j]) {
                    if (((1<<k) & i) > 0) {
                        dp[i][j] = (dp[i][j] + dp[i^(1<<k)][j-1]) % MOD;
                    }
                }
            }
        }
        return dp[(1<<n) -1][maxHat];
    }
}
