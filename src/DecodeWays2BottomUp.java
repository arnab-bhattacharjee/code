public class DecodeWays2BottomUp {

    private long[] DP;
    private static final int MOD = 1000000007;

    public int numDecodings(String s) {
        DP = new long[s.length()+1];
        DP[s.length()] = 1;

        for (int i=s.length()-1; i >= 0; i--) {
            long num = 0;
            if (s.charAt(i) != '*' && s.charAt(i) != '0') {
                num = (num + DP[i+1])%MOD;
                if (i+1 < s.length()) {
                    if (s.charAt(i+1) != '*') {
                        int val = Integer.parseInt(s.substring(i, i+2));
                        if (val <= 26)
                            num = (num + DP[i+2])%MOD;
                    } else {
                        if (s.charAt(i) == '1') {
                            num = (num + (9*DP[i+2])%MOD)%MOD;
                        } else if (s.charAt(i) == '2') {
                            num = (num + (6*DP[i+2])%MOD)%MOD;
                        }
                    }
                }
            } else if (s.charAt(i) == '*'){
                num = (num + (9*DP[i+1])%MOD)%MOD;
                if (i+1 < s.length()) {
                    if (s.charAt(i+1) != '*') {
                        num = (num + DP[i+2])%MOD; // assuming * as 1
                        if (s.charAt(i+1) <= '0'+6) {
                            num = (num + DP[i+2])%MOD; // assuming * as 1
                        }
                    } else {
                        num = (num + ((9*DP[i+2])%MOD))%MOD; // using 1 as first *
                        num = (num + (6*DP[i+2])%MOD)%MOD; // using 2 as first *
                    }
                }
            }
            DP[i] = num;
        }

        return (int)DP[0];
    }
}
