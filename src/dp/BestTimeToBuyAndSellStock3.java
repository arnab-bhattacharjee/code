package dp;

public class BestTimeToBuyAndSellStock3 {

    public int maxProfit(int[] prices) {
        int n = prices.length;

        if (n < 2)
            return 0;

        int[] left = new int[n];
        int[] right = new int[n];

        left[0] = 0;
        int localMin = prices[0];
        right[n-1] = 0;
        int localMax = prices[n-1];
        for (int i=1; i<n; i++) {
            if (prices[i] > localMin) {
                left[i] = prices[i]-localMin;
            } else {
                localMin = prices[i];
            }

            if (prices[n-i-1] < localMax) {
                right[n-i-1] = localMax-prices[n-i-1];
            } else {
                localMax = prices[n-i-1];
            }
        }

        int  res = 0;
        for (int i=0; i<n; i++) {
            res = Math.max(left[i] + ((i+1<n) ? right[i+1] : 0), res);
        }

        return res;
    }
}
