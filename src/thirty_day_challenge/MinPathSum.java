package thirty_day_challenge;

public class MinPathSum {

    public int minPathSum(int[][] grid) {
        if (grid.length == 0) return 0;
        int r = grid.length;
        int c = grid[0].length;
        int[][] dp = new int[r][c];

        for (int i=0; i<r; i++) {
            for (int j=0; j<c; j++) {
                // base case
                if (i==0 && j==0)
                    dp[i][j] = grid[i][j];
                else {
                    dp[i][j] = Integer.MAX_VALUE;
                    if (i-1 >= 0)
                        dp[i][j] = dp[i-1][j];
                    if(j-1 >= 0)
                        dp[i][j] = Math.min(dp[i][j], dp[i][j-1]);
                    dp[i][j] += grid[i][j];
                }
            }
        }
        return dp[r-1][c-1];
    }
}
