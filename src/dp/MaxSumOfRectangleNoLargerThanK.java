package dp;

public class MaxSumOfRectangleNoLargerThanK {
    private MaxSumSubArrayNoLargerThanK maxSumSubArray = new MaxSumSubArrayNoLargerThanK();

    public int maxSumSubmatrix(int[][] matrix, int k) {
        int r = matrix.length;
        int c = matrix[0].length;

        int maxSum = Integer.MIN_VALUE;

        // maintain cumulative array
        int[] cum = new int[c];
        for (int i=0; i<r; i++) {
            for (int j=i; j<r; j++) {
                if (i == j) {
                    cum = matrix[i].clone();
                }
                else {
                    for (int l = 0; l < c; l++) {
                        cum[l] += matrix[j][l];
                    }
                }
                maxSum = Math.max(maxSumSubArray.maxSumSubArray(cum, k), maxSum);
            }
        }
        return maxSum;
    }
}
