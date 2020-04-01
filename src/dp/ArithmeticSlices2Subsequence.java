package dp;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class ArithmeticSlices2Subsequence {

    private int count = 0;
    Map<Long, Integer>[] dp;

    public int numberOfArithmeticSlices(int[] A) {
        if (A.length < 3) return 0;
        dp = new Map[A.length];
        // base case
        dp[0] = new HashMap<>();

        // iterate over prefixes
        for (int i=1; i<A.length; i++) {
            dp[i] = new HashMap<>();
            for (int j=0; j<i; j++) {
                int subsequences = dp[j].getOrDefault((long)A[i] - A[j], 0);
                dp[i].put((long)A[i] - A[j], dp[i].getOrDefault((long)A[i] - A[j], 0)
                        + subsequences + 1);
                count += subsequences;
            }
        }
        return count;
    }

}
