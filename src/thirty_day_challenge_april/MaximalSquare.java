package thirty_day_challenge_april;

public class MaximalSquare {

    public int maximalSquare(char[][] matrix) {
        int r = matrix.length;
        if (r == 0) return 0;
        int c = matrix[0].length;
        int maxSide = Math.min(r, c);
        boolean[][][] dp = new boolean[maxSide+1][r][c];

        int max1Side = 0;

        for (int s=1; s<=maxSide; s++) {
            for (int i = 0; i < r; i++) {
                for (int j = 0; j < c; j++) {
                    if (s == 1) {
                        dp[s][i][j] = (matrix[i][j] == '1') ? true : false;
                    } else {
                        if (i-s+1>=0 && j-s+1>=0) {
                            dp[s][i][j] = dp[s - 1][i - 1][j]
                                    && dp[s - 1][i][j - 1]
                                    && (matrix[i][j] == '1')
                                    && (matrix[i - s + 1][j - s + 1] == '1');
                        }
                    }
                    if (dp[s][i][j])
                        max1Side = s;
                }
            }
        }
        return max1Side*max1Side;
    }
}
