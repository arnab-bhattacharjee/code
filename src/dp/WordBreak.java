package dp;

import java.util.List;

public class WordBreak {

    private boolean[] dp;

    public boolean wordBreak(String s, List<String> wordDict) {
        dp = new boolean[s.length()];
        int maxWordSize = 0;
        for (int i=0;i<wordDict.size();i++) maxWordSize = Math.max(maxWordSize, wordDict.get(i).length());

        for (int i=0; i<s.length(); i++) {
            if (i==0 || dp[i-1] == true) {
                for (int j = 1; j <= maxWordSize && i+j<=s.length(); j++) {
                    if (wordDict.contains(s.substring(i, i + j))) {
                        dp[i + j - 1] = true;
                    }
                }
            }
        }
        return dp[s.length()-1];
    }

}
