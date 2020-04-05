package dp;

public class CherryPickup {

    public int cherryPickup(int[][] grid) {
        int rows = grid.length;
        int cols = grid[0].length;
        int dp[][][] = new int[rows][rows][(rows-1) + (cols-1)+1];

        dp[0][0][0] = grid[0][0];

        int totalSteps = (rows-1) + (cols-1);

        for (int steps = 1; steps <= (rows-1) + (cols-1); steps++) {
            for (int i=0; i<=steps && i<rows; i++) {
                if (steps -i >= cols) continue;
                for (int j=0; j<=steps && j<rows; j++) {
                    if (steps -j >= cols) continue;
                    dp[i][j][steps] = -1;
                    if (grid[i][steps-i] == -1 || grid[j][steps-j] == -1){
                        dp[i][j][steps] = -1;
                    } else {
                        int value = grid[i][steps - i] + ((i != j) ? grid[j][steps - j] : 0);
                        if (i-1>=0 && j-1>=0 && i-1<=steps-1 && j-1<=steps-1) {
                            if (dp[i-1][j-1][steps-1] != -1) {
                                dp[i][j][steps] = Math.max(dp[i - 1][j - 1][steps - 1] + value, dp[i][j][steps]);
                            }
                        }
                        if (i-1>=0 && i-1<=steps-1 && j<=steps-1) {
                            if (dp[i-1][j][steps-1] != -1) {
                                dp[i][j][steps] = Math.max(dp[i - 1][j][steps - 1] + value, dp[i][j][steps]);
                            }
                        }
                        if (j-1>=0 && j-1<=steps-1 && i<=steps-1) {
                            if (dp[i][j-1][steps-1] != -1) {
                                dp[i][j][steps] = Math.max(dp[i][j - 1][steps - 1] + value, dp[i][j][steps]);
                            }
                        }
                        if (j<=steps-1 && i<=steps-1) {
                            if (dp[i][j][steps - 1] != -1) {
                                dp[i][j][steps] = Math.max(dp[i][j][steps - 1] + value, dp[i][j][steps]);
                            }
                        }
                    }
                }
            }
        }
        return Math.max(0,dp[rows-1][rows-1][totalSteps]);
    }
}
