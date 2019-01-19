package dp;

public class PalindromePartitioning2 {

    private int[][] dp;

    public int minCut(String s) {
        if (s.length()<2) return 0;

        dp = new int[s.length()][s.length()];
        for (int len=2; len<=s.length(); len++) {
            for (int i=0; i<s.length()-len+1; i++) {
                if (isFib(s.substring(i,i+len))){
                    dp[i][i+len-1] = 0;
                } else {
                    dp[i][i+len-1] = Integer.MAX_VALUE;
                    for (int j=i; j<=i+len-2; j++) {
                        dp[i][i+len-1] = Math.min(dp[i][j] + 1 + dp[j+1][i+len-1], dp[i][i+len-1]);
                    }
                }
            }
        }
        return dp[0][s.length()-1];
    }

    private boolean isFib(String s) {
        if(s.length()<2) return true;
        int j = s.length()-1;
        for (int i=0; i<j; i++,j--) {
            if (s.charAt(i) != s.charAt(j))
                return false;
        }
        return true;
    }
}
