package dp;

public class MaxDotProductOf2Subs {

    public int maxDotProduct(int[] nums1, int[] nums2) {
        int n1 = nums1.length;
        int n2 = nums2.length;

        int[][] dp = new int[n1][n2];

        for (int i=0; i<n1; i++) {
            for (int j=0; j<n2; j++) {
                dp[i][j] = nums1[i] * nums2[j];
                if (i-1 >= 0 && j-1 >=0 && dp[i-1][j-1] > 0)
                    dp[i][j] += dp[i-1][j-1];
                dp[i][j] = Math.max(dp[i][j], (i-1 >= 0) ? dp[i-1][j] : Integer.MIN_VALUE);
                dp[i][j] = Math.max(dp[i][j], (j-1 >= 0) ? dp[i][j-1] : Integer.MIN_VALUE);

                System.out.print(dp[i][j] + "\t");
            }
            System.out.println();
        }



        return dp[n1-1][n2-1];
    }
}
