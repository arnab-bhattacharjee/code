package dp;

import java.util.Arrays;

public class MaxStudentsTakingExam {

    private int[][][] dp;
    private int m;
    private int n;

    public int maxStudents(char[][] seats) {
        m = seats.length;
        n = seats[0].length;

        dp = new int[m][n][1<<(n+1)];

        for (int i=0; i<m; i++)
            for (int j=0; j<n; j++)
                Arrays.fill(dp[i][j],-1);

        return maxStudentsRec(0, 0, 0, seats);
    }

    private int maxStudentsRec(int i, int j, int mask, char[][] seats) {
        if (j == n) { i++; j = 0;}
        if (i >= m) return 0;
        System.out.println(i + "\t" + j + "\t" + mask);
        if (dp[i][j][mask] != -1) return dp[i][j][mask];
        int max = 0;
        if ((i-1 < 0 || j-1 < 0 || seats[i-1][j-1] == '#' || ((1<<n) & mask) == 0)
                && (j-1 < 0 || seats[i][j-1] == '#' || ((1<<0) & mask) == 0)
                && (i-1 < 0 || j+1 >= n  || seats[i-1][j+1] == '#' || ((1<<(n-2)) & mask) == 0)
                && seats[i][j] == '.')
            max = 1 + maxStudentsRec(i, j+1, ((mask<<1) ^ 1) & ((1<<(n+1)) - 1),seats);

        max = Math.max(maxStudentsRec(i, j+1, (mask<<1) & ((1<<(n+1)) - 1), seats), max);
        return dp[i][j][mask] = max;
    }
}
