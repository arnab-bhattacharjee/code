package dp;

import java.util.*;

public class ConcatenatedWords {

    public List<String> findAllConcatenatedWordsInADict(String[] words) {
        if (words.length  < 2) return new ArrayList<>();
        Set<String> s = new HashSet<>();
        Arrays.sort(words, Comparator.comparingInt(String::length));
        int maxLen = 0;

        List<String> res = new ArrayList<>();
        for (String word: words) {
            if (word.length() == 0) continue;
            boolean wordBreak = wordBreak(word, s, maxLen);
            if (wordBreak)
                res.add(word);
            else {
                maxLen = Math.max(maxLen, word.length());
                s.add(word);
            }
        }
        return res;
    }

    private boolean wordBreak(String word, Set<String> s, int maxLen) {
        int n = word.length();
        boolean[] dp = new boolean[n];

        for (int i=-1; i<n; i++) {
            if (i == -1 || dp[i]) {
                StringBuilder sb = new StringBuilder();
                for (int j = i + 1; j - i <= maxLen && j < n; j++) {
                    sb.append(word.charAt(j));
                    if (s.contains(sb.toString()))
                        dp[j] = true;
                }
            }
        }
        return dp[n-1];
    }
}
