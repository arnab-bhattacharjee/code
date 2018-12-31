package dp;

public class BestTimeToBuyAndSellStock4 {
    int DP[][];
    public int maxProfit(int k, int[] prices) {
        if (k<1 || prices.length<1) return 0;
        DP = new int[2][prices.length];
        for (int i=0; i<prices.length; i++) {
            DP[0][i] = 0;
        }
        k = Math.min(k, prices.length>>1);
        for (int i=1;i<=k;i++) {
            for (int j=prices.length-1;j>=0;j--) {
                DP[i%2][j] = DP[(i-1)%2][j];
                if (j+1<prices.length) {
                    DP[i%2][j] = Math.max(DP[i%2][j], DP[i%2][j+1]);
                }
                for (int l=j+1;l<prices.length;l++) {
                    if (((l + 1) < prices.length) && (i != 1)) {
                        DP[i % 2][j] = Math.max(DP[i % 2][j], DP[(i - 1) % 2][l + 1] + prices[l] - prices[j]);
                    } else if (i==1) {
                        DP[i % 2][j] = Math.max(DP[i % 2][j], prices[l] - prices[j]);
                    }
                }
            }
        }
        return DP[k%2][0];
    }
}
