package dp;

import java.util.HashMap;
import java.util.Map;

public class ArithmeticSlices {

    public int numberOfArithmeticSlices(int[] A) {
        Map<Long, Integer>[] dp;
        int count = 0;
        if (A.length < 3) return 0;
        dp = new Map[A.length];

        // base case
        dp[0] = new HashMap<>();

        for (int i = 1; i < A.length; i++) {
            dp[i] = new HashMap<>();
            int slices = dp[i - 1].getOrDefault((long)A[i] - A[i - 1], 0);
            dp[i].put((long) A[i] - A[i - 1], dp[i].getOrDefault((long)A[i] - A[i - 1], 0) + slices + 1);
            count += slices;
        }
        return count;
    }
}
