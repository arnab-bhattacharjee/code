package thirty_day_challenge_may;

public class MaxSumCircularSubArray {

    public int maxSubarraySumCircular(int[] A) {
        int n = A.length;

        int total = A[0];
        int[] maxSum = new int[n];
        maxSum[0] = A[0];
        int maxVal1 = maxSum[0];

        if (n == 1) return maxVal1;

        for (int i=1; i<n; i++) {
            total += A[i];
            maxSum[i] = Math.max(A[i], maxSum[i-1] + A[i]);
            maxVal1 = Math.max(maxVal1, maxSum[i]);
        }

        if (maxVal1 <= 0) return maxVal1;

        int[] minSum = new int[n];
        minSum[0] = A[0];
        int minVal = minSum[0];

        for (int i=1; i<n; i++) {
            minSum[i] = Math.min(A[i], minSum[i-1] + A[i]);
            minVal = Math.min(minVal, minSum[i]);
        }

        int maxVal2 = total - minVal;

        return Math.max(maxVal1, maxVal2);
    }
}
