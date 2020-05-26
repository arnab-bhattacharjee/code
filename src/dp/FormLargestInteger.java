package dp;

import java.util.HashMap;
import java.util.Map;

public class FormLargestInteger {

    public String largestNumber(int[] cost, int target) {
        int c_n = cost.length;
        Map<Integer, Integer> m = new HashMap<>();
        for (int i=0; i<c_n; i++)
            m.put(cost[i], i+1);

        int n = m.size();
        String[] dp = new String[target+1];

        dp[0] = "";

        for (int i=1; i<=target; i++) {
            dp[i] = null;
            for (Map.Entry<Integer, Integer> e : m.entrySet()) {
                if (i-e.getKey() >= 0 && dp[i-e.getKey()] != null) {
                    String val = dp[i - e.getKey()] + (e.getValue());
                    if (dp[i] == null
                            || val.length() > dp[i].length()
                            || (val.length() == dp[i].length() && val.compareTo(dp[i]) > 0))
                        dp[i] = val;
                }
            }
        }
        return dp[target];
    }
}
