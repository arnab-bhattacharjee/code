package thirty_day_challenge_may;

public class EditDistance {

    public int minDistance(String word1, String word2) {
        int n1 = word1.length();
        int n2 = word2.length();

        int[][] dp = new int[n1+1][n2+1];
        for (int i=0; i<n1+1; i++) {
            dp[i][0] = i;
        }
        for (int i=0; i<n2+1; i++) {
            dp[0][i] = i;
        }

        for (int i=0; i<n1; i++) {
            for (int j=0; j<n2; j++) {
                dp[i+1][j+1] = Integer.MAX_VALUE;
                if (word1.charAt(i) == word2.charAt(j)) {
                    dp[i+1][j+1] = Math.min(dp[i][j], dp[i+1][j+1]);
                } else {
                    // replace ith char
                    dp[i+1][j+1] = Math.min(1 + dp[i][j], dp[i+1][j+1]);

                    // delete ith char
                    dp[i+1][j+1] = Math.min(1 + dp[i][j+1], dp[i+1][j+1]);

                    // insert ith char
                    dp[i+1][j+1] = Math.min(1 + dp[i+1][j], dp[i+1][j+1]);
                }
            }
        }

        return dp[n1][n2];
    }
}
