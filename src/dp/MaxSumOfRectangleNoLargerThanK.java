package dp;

public class MaxSumOfRectangleNoLargerThanK {

    public int maxSumSubmatrix(int[][] matrix, int k) {
        int r = matrix.length;
        int c = matrix[0].length;
        int[][][][] dp = new int[r+1][c+1][r][c];

        // base case
        dp[1][1] = matrix;

        for (int l=1; l<=r; l++) {
            for (int b=1; b<=c; b++) {
                if (l == 1 && b == 1) continue;
                for (int i=0; i<r-l; i++) {
                    for (int j=0; j<c-b; j++) {
                        dp[l][b][i][j] = dp[l][b-1][i][j] + dp[l][1][i+l][j];
                        System.out.println("dp[" + l +"][" + b + "][" + i + "][" + j + "] = " + dp[l][b][i][j]);
                    }
                }
            }
        }
        return 0;
    }
}
