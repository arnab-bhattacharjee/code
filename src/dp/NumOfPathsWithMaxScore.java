package dp;

import java.util.*;

public class NumOfPathsWithMaxScore {

    public static final int MOD = 1000000007;

    public int[] pathsWithMaxScore(List<String> board) {
        int r = board.size();
        int c = board.get(0).length();
        int dp[][][] = new int[r][c][2];
        for (int i=r-1; i>=0; i--) {
            for (int j=c-1; j>=0; j--) {
                if (i==r-1 && j==c-1) {
                    dp[i][j][0] = 0;
                    dp[i][j][1] = 1;
                }
                else {
                    char ch = board.get(i).charAt(j);
                    int val;
                    if (ch == 'X') {
                        dp[i][j][0] = -1;
                        continue;
                    } else if (ch == 'E') {
                        val = 0;
                    } else {
                        val = ch - '0';
                    }

                    Integer[][] paths = new Integer[2][3];
                    if (i+1<r && dp[i+1][j][0] != -1) {
                        paths[0][0] = (dp[i + 1][j][0] + val)%MOD;
                        paths[1][0] = dp[i+1][j][1];
                    }
                    else {
                        paths[0][0] = -1;
                        paths[1][0] = 0;
                    }
                    if (j+1<c && dp[i][j+1][0] != -1) {
                        paths[0][1] = (dp[i][j + 1][0] + val)%MOD;
                        paths[1][1] = dp[i][j+1][1];
                    }
                    else {
                        paths[0][1] = -1;
                        paths[1][1] = 0;
                    }
                    if (i+1<r && j+1<c && dp[i+1][j+1][0] != -1) {
                        paths[0][2] = (dp[i + 1][j + 1][0] + val)%MOD;
                        paths[1][2] = dp[i + 1][j + 1][1];
                    }
                    else {
                        paths[0][2] = -1;
                        paths[1][2] = 0;
                    }
                    int maxPath = Collections.max(Arrays.asList(paths[0]));
                    int count = 0;
                    for (int k=0; k<3; k++) {
                        if (paths[0][k] == maxPath)
                            count+= paths[1][k];
                    }
                    dp[i][j][0] = maxPath;
                    dp[i][j][1] = count;
                }
            }
        }
        return new int[]{Math.max(0,dp[0][0][0]), dp[0][0][1]};
    }
}
