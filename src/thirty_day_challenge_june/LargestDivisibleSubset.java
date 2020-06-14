package thirty_day_challenge_june;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class LargestDivisibleSubset {

    public List<Integer> largestDivisibleSubset(int[] nums) {
        Arrays.sort(nums);
        int n = nums.length;
        int[] dp = new int[n];
        int[] idx = new int[n];

        dp[0] = 1;
        idx[0] = 0;
        int maxIdx = 0;
        int res = 1;
        for (int i=1; i<n; i++) {
            dp[i] = 1;
            idx[i] = i;
            int maxJ = -1;
            for (int j=0; j<i; j++) {
                if (nums[i]%nums[j] == 0) {
                    if (dp[j]+1 > dp[i]) {
                        dp[i] = dp[j]+1;
                        maxJ = j;
                    }
                }
            }
            if (maxJ != -1) {
                maxIdx = i;
                idx[i] = maxJ;
            }
            if (res < dp[i]) {
                res = dp[i];
            }

        }

        int i = maxIdx;
        List<Integer> l = new ArrayList<>();
        l.add(nums[maxIdx]);
        while (idx[i] != i) {
            i = idx[i];
            l.add(nums[i]);
        }

        return l;
    }
}
