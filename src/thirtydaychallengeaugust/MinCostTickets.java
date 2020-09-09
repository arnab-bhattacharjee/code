package thirtydaychallengeaugust;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class MinCostTickets {

    public int mincostTickets(int[] days, int[] costs) {
        int c = days[days.length-1];
        int[] dp = new int[c+1];
        int[] dayCount = new int[]{1,7,30};
        Arrays.fill(dp, Integer.MAX_VALUE);
        dp[0] = 0;
        Set<Integer> daysSet = new HashSet<>();
        for (int day: days) {
            daysSet.add(day);
        }
        for (int i=1; i<dp.length; i++) {
            if (daysSet.contains(i)) {
                for (int j=0; j<costs.length; j++) {
                    if (i-dayCount[j] >= 0)
                        dp[i] = Math.min(dp[i-dayCount[j]] + costs[j], dp[i]);
                    else
                        dp[i] = Math.min(costs[j], dp[i]);
                }
            } else {
                dp[i] = dp[i-1];
            }
        }
        return dp[c];
    }
}
