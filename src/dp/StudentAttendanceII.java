package dp;

public class StudentAttendanceII {

    private int[][][] dp;
    private int n;
    private static final int MOD = 1000000000 + 7;

    public int checkRecord(int n) {
        if (n == 0) return 0;
        this.n = n;
        dp = new int[n][2][3];

        return checkRecord(0, 0, 0);
    }

    private int checkRecord(int idx, int absents, int lates) {
        if (absents > 1 || lates > 2)
            return 0;

        if (idx == n)
            return 1;

        if (dp[idx][absents][lates] != 0)
            return dp[idx][absents][lates];

        // idx is present
        int val = checkRecord(idx+1, absents, 0);

        // idx is late
        val = (val + checkRecord(idx+1, absents, lates+1)) % MOD;

        // idx is absent
        val = (val +checkRecord(idx+1, absents+1, 0)) % MOD;

        return dp[idx][absents][lates] = val;
    }
}
