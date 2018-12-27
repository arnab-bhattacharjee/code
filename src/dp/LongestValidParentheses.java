package dp;

public class LongestValidParentheses {

    private int DP[];

    public int longestValidParentheses(String s) {
        if (s.isEmpty()) return 0;
        DP = new int[s.length()];
        DP[s.length()-1] = 0;

        for (int i=s.length()-2; i>=0; i--) {
            if (s.charAt(i) == '(' && i+DP[i+1]+1<s.length() && s.charAt(i+DP[i+1]+1) == ')') {
                DP[i] = DP[i+1] + 2;
                if (i+DP[i+1]+2 < s.length())
                        DP[i] += DP[i+DP[i+1]+2];
            } else {
                DP[i] = 0;
            }
        }

        int longest = 0;
        for (int i=0;i<s.length();i++) longest = Math.max(longest, DP[i]);
        return longest;
    }

}
