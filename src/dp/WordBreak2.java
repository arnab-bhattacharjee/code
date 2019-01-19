package dp;

import java.util.ArrayList;
import java.util.List;

public class WordBreak2 {

    private ArrayList<ArrayList<Integer>> dp;

    public List<String> wordBreak(String s, List<String> wordDict) {
        dp = new ArrayList<>(s.length());
        for (int i=0; i<s.length(); i++) dp.add(new ArrayList<>());
        int maxWordSize = 0;
        for (int i=0; i<wordDict.size(); i++) maxWordSize = Math.max(maxWordSize, wordDict.get(i).length());

        for (int i=0; i<s.length(); i++) {
            if (i==0 || !dp.get(i-1).isEmpty()) {
                for (int j = 1; j <= maxWordSize && i+j<=s.length(); j++) {
                    if (wordDict.contains(s.substring(i, i + j))) {
                        dp.get(i + j - 1).add(i);
                    }
                }
            }
        }
        List<String> res = new ArrayList<>();
        if (dp.get(s.length()-1).isEmpty()) return res;
        char[] c = new char[s.length()-1];
        constructStrings(s, s.length()-1, "", res);
        return res;
    }

    private void constructStrings(String s, int idx, String t, List<String> res) {
        if (idx<0) {
            res.add(t.toString());
            return;
        }
        for (int prevIdx : dp.get(idx)) {
            String u = s.substring(prevIdx, idx+1) + ((idx == s.length()-1)?"":" ") + t;
            constructStrings(s, prevIdx-1, u, res);
        }
    }
}
