package dp;

public class WildcardMatching {
    private Boolean DP[][];

    public boolean isMatch(String s, String p) {
        s+= "$";
        p+= "$";
        char str[] = s.toCharArray();
        char pattern[] = p.toCharArray();
        DP = new Boolean[str.length][pattern.length];
        DP[str.length-1][pattern.length-1] = true;
        return isMatch(str, 0, pattern, 0);
    }

    private boolean isMatch(char[] s, int sIdx, char[] p, int pIdx) {
        if (sIdx<0 || pIdx<0 || sIdx>=s.length || pIdx>=p.length) return false;
        if (DP[sIdx][pIdx] != null) return DP[sIdx][pIdx];
        boolean match = false;
        if (s[sIdx] == p[pIdx] || p[pIdx] == '?') {
            match = isMatch(s, sIdx+1, p, pIdx+1);
        } else if (p[pIdx] == '*') {
            match = isMatch(s, sIdx, p, pIdx+1); // zero occurrences
            match = match || isMatch(s, sIdx+1, p, pIdx); // one or more occurrences
        } else {
            match = false;
        }
        DP[sIdx][pIdx] = match;
        return match;
    }
}
