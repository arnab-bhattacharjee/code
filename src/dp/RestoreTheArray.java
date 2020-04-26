package dp;

public class RestoreTheArray {

    public static final int MOD = 1000000007;

    public int numberOfArrays(String s, int k) {
        char[] c = s.toCharArray();
        int n = c.length;
        int[] dp = new int[n];

        // base case
        dp[0] = (c[0] == '0')? 0 : 1;

        if (dp[0] == '0') return 0;

        for (int i = 1; i < n; i++) {
            int num = 0;
            for (int j = 0; j <= i; j++) {
                if ((j == 9 && c[i - j]-'0' > 1)
                        || j >= 10) break;
                num += (int) Math.pow(10, j) * (c[i - j] - '0');
                if (num <= k) {
                    if (num != 0) {
                        if (i - j - 1 >= 0) {
                            dp[i] = (dp[i] + dp[i - j - 1]) % MOD;
                        } else {
                            dp[i] = (dp[i] + 1) % MOD;
                        }
                    }
                } else
                    break;

            }
        }
        for (int i=0; i<n; i++)
            System.out.println(dp[i]);
        return dp[n-1];
    }
}
