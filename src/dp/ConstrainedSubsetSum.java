package dp;

import javafx.util.Pair;

import java.util.Collections;
import java.util.Comparator;
import java.util.PriorityQueue;

public class ConstrainedSubsetSum {

    public int constrainedSubsetSum(int[] nums, int k) {
        PriorityQueue<Pair<Integer, Integer>>  q = new PriorityQueue<>(Collections.reverseOrder(Comparator.comparingInt(Pair::getValue)));

        int n = nums.length;

        int[] dp = new int[n];

        // base case
        dp[0] = nums[0];
        q.add(new Pair(0, nums[0]));

        int maxSum = dp[0];
        for (int i=1 ;i<n; i++) {
            while(i-q.peek().getKey() > k)
                q.poll();

            dp[i] = Math.max(nums[i], q.peek().getValue()+nums[i]);
            q.add(new Pair<>(i, dp[i]));
            maxSum = Math.max(maxSum, dp[i]);
        }

        for (int i=0; i<n; i++)
            System.out.println(dp[i]);

        return maxSum;
    }
}
