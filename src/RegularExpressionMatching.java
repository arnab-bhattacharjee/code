public class RegularExpressionMatching {

    private Boolean DP[][];

    public boolean isMatch(String s, String p) {
        s += "$";
        p += "$";
        char[] str = s.toCharArray();
        char[] pattern = p.toCharArray();
        int sLen = s.length();
        int pLen = p.length();
        DP = new Boolean[sLen][pLen];
        DP[sLen - 1][pLen - 1] = true;
        boolean val = this.isMatch(str, 0, sLen, pattern, 0, pLen);
        //this.print();
        return val;
    }

    private boolean isMatch(char[] s, int sIdx, int sLen, char[] p, int pIdx, int pLen) {
        //System.out.println(sIdx + "\t" + pIdx);
        if (pIdx < 0 || pIdx >= pLen || sIdx < 0 || sIdx >= sLen) return false;
        if (DP[sIdx][pIdx] != null) return DP[sIdx][pIdx];
        boolean match = false;

        if ((s[sIdx] == p[pIdx] || p[pIdx] == '.') && (pIdx == pLen-1 || p[pIdx + 1] != '*')) { // check for pattern ab.....
            match = match || isMatch(s, sIdx + 1, sLen, p, pIdx + 1, pLen);
        } else if (pIdx + 1 < pLen && p[pIdx +1] == '*') { // check for pattern a*.....
            match = match || isMatch(s, sIdx, sLen, p, pIdx + 2, pLen); // zero occurrences
            if (s[sIdx] == p[pIdx] || p[pIdx] == '.')
                match = match || isMatch(s, sIdx + 1, sLen, p, pIdx, pLen); // one or more occurrences
        } else {
            match = false;
        }
        DP[sIdx][pIdx] = match;
        return match;
    }

    public void print() {
        for (int i = 0; i < DP.length; i++) {
            for (int j = 0; j < DP[0].length; j++) {
                System.out.print(DP[i][j] + "\t");
            }
            System.out.println();
        }
    }
}