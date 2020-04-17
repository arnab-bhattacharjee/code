package dp;

import java.util.HashMap;
import java.util.Map;

public class MinNumOfTapsToOpenToWaterGarden {

    private Map<Integer, Integer>[] dp;

    public int minTaps(int n, int[] ranges) {
        dp = new Map[n+1];
        for (int i=0; i<=n; i++)
            dp[i] = new HashMap<>();
        return minTaps(0, ranges, 0);
    }

    public int minTaps(int i, int[] ranges, int len) {
        if (i+len >= ranges.length-1) return 0;
        if (Math.abs(len) > 100 || (i>ranges.length-1 && len<0)) return -1;
        if (dp[i].containsKey(len)) return dp[i].get(len);

        // don't include ith tap
        int state1 = minTaps(i+1, ranges, len-1);

        // include ith tap

        int state2;
        // if including the ith tap doesn't makeup for the leftover space
        if (ranges[i] == 0 || (len <= 0 && ranges[i] < -len))
            state2 = -1;
        else {
            int val = minTaps(i+1, ranges, Math.max(len-1, ranges[i]-1));
            if (val == -1) state2 = -1;
            else state2 = val+1;
        }

        int res;
        if (state1 == -1) res = state2;
        else if (state2 == -1) res = state1;
        else res = Math.min(state1, state2);

        dp[i].put(len, res);

        //if (res != -1)
        //System.out.println(i + " " + len + "\t" + res);

        return res;
    }
}
