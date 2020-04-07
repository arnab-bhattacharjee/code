package dp;
/*
dp[i][j] represents the number of k-inverse pairs in array 1...i

recurrence relation :
    dp[i][j] =   dp[i-1][j] - fixing ith element at index i(zero new inversions), and adding count of k inverse pairs in array 1...i-1
               + dp[i-1][j-1] - fixing ith element at index i-1(1 new inversion), and adding count of k-1 inverse pairs in array 1...i-1
               + ...
               + dp[i-1][j-i+1] - fixing ith element at index 1(i-1 new inversion), and adding count of k-1 inverse pairs in array 1...i-1
 */
public class KInversePairsArray {

    public int kInversePairs(int n, int k) {
        if (k==0) return 1;
        if (n<2) return 0;
        int[][] dp = new int[n+1][k+1];
        // base case
        dp[2][0] = 1;
        dp[2][1] = 1;

        for (int i=3; i<=n; i++) {
            for (int j=0; j<=k; j++) {
                dp[i][j] = 0;
                for (int l=0; l<i && j-l >= 0; l++) {
                    dp[i][j] += dp[i-1][j-l];
                }
            }
        }
        return dp[n][k];
    }
}
