package thirty_day_challenge_may;

public class TwoCityScheduling {

    private int[][] dp;
    private int[][] costs;

    public int twoCitySchedCost(int[][] costs) {
        int n = costs.length;

        this.dp = new int[n][(n>>1) + 1];
        this.costs = costs;

        return twoCitySchedCost(n-1, 0);
    }

    private int twoCitySchedCost(int idx, int cityACount) {
        if (idx < 0) return 0;

        if (dp[idx][cityACount] != 0)
            return dp[idx][cityACount];

        // idx goes to cityA
        int val = Integer.MAX_VALUE;
        if (cityACount+1 <= (costs.length >> 1))
            val = twoCitySchedCost(idx-1, cityACount+1) + costs[idx][0];

        int cityBCount = costs.length-idx-1-cityACount;
        if (cityBCount+1 <= (costs.length >> 1))
        val = Math.min(twoCitySchedCost(idx-1, cityACount) + costs[idx][1], val);

        return dp[idx][cityACount] = val;
    }
}
