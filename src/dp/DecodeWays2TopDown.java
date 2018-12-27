package dp;

public class DecodeWays2TopDown {

    private Integer[] DP;
    private static final int MOD = 1000000007;

    public int numDecodings(String s) {
        DP = new Integer[s.length()+1];
        DP[s.length()] = 1;
        return numDecodings(s, 0);
    }

    public int numDecodings(String s, int idx) {
        if (DP[idx] != null) return DP[idx];
        int num = 0;
        if (s.charAt(idx) != '*' && s.charAt(idx) != '0') {
            num = (num + numDecodings(s, idx+1))%MOD;
            if (idx+1 < s.length()) {
                if (s.charAt(idx+1) != '*') {
                    int val = Integer.parseInt(s.substring(idx, idx+2));
                    if (val <= 26)
                        num = (num + numDecodings(s, idx+2))%MOD;
                } else {
                    if (s.charAt(idx) == '1') {
                        num = (num + (9*numDecodings(s, idx+2))%MOD)%MOD;
                    } else if (s.charAt(idx) == '2') {
                        num = (num + (6*numDecodings(s, idx+2))%MOD)%MOD;
                    }
                }
            }
        } else if (s.charAt(idx) == '*'){
            num = (num + (9*numDecodings(s, idx+1))%MOD)%MOD;
            if (idx+1 < s.length()) {
                if (s.charAt(idx+1) != '*') {
                    num = (num + numDecodings(s, idx+2))%MOD; // assuming * as 1
                    if (s.charAt(idx+1) <= 'A'+5) {
                        num = (num + numDecodings(s, idx+2))%MOD; // assuming * as 1
                    }
                } else {
                    num = (num + (9*numDecodings(s, idx+2))%MOD)%MOD; // using 1 as first *
                    num = (num + (6*numDecodings(s, idx+2))%MOD)%MOD; // using 2 as first *
                }
            }
        }
        DP[idx] = num;
        return num;
    }
}
