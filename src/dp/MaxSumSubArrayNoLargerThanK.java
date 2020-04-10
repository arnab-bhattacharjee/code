package dp;

import java.util.Set;
import java.util.TreeSet;

public class MaxSumSubArrayNoLargerThanK {

    public int maxSumSubArray(int[] arr, int k) {
        TreeSet<Integer> s = new TreeSet<>();
        int[] c = new int[arr.length];
        int maxSum = Integer.MIN_VALUE;
        for (int i=0; i<arr.length; i++) {
            if (i == 0)
                c[i] = arr[i];
            else
                c[i] = c[i-1] + arr[i];
            Integer ceil = s.ceiling(c[i] - k);
            if (ceil != null)
                maxSum = Math.max(maxSum, c[i]-ceil);
            if (c[i] <= k) {
                maxSum = Math.max(maxSum, c[i]);
            }
            s.add(c[i]);
        }
        return maxSum;
    }
}
