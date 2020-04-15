package dp;

public class MinNumOfRefuelingStops {

    public int minRefuelStops(int target, int startFuel, int[][] stations) {
        if (startFuel>= target) return 0;

        int l = stations.length;
        int[][] dp = new int[l][l+1];
        for (int i=0; i<l; i++) for(int j=0;j<l+1;j++) dp[i][j] = Integer.MIN_VALUE;
        for (int k=0; k<=l ;k++) {
            for (int i = k; i < l; i++) {
                if ( k == 0) {
                    dp[i][k] = startFuel - stations[i][0];
                } else {
                    for (int j = k-1; j < i; j++) {
                        if (dp[j][k-1] >= 0)
                            dp[i][k] = Math.max(dp[j][k-1] + stations[j][1] + stations[j][0] - stations[i][0], dp[i][k]);
                    }
                }
                if (dp[i][k]>=0 && stations[i][0] + dp[i][k] + stations[i][1] >= target)
                    return k+1;
            }
        }
        return -1;
    }
}
