package dp;

import string.PrefixFunction;

import java.util.Arrays;

public class FindAllGoodStrings {

    private static final int MOD = 1000000007;
    int[][][][] goodStrings;
    String s1;
    String s2;
    String evil;
    int[] pi;

    public int findGoodStrings(int n, String s1, String s2, String evil) {
        this.s1 = s1;
        this.s2 = s2;
        this.evil = evil;
        int e_n = evil.length();
        goodStrings = new int[n][e_n][2][2];
        for (int i=0 ;i<n; i++) {
            for (int j=0; j<e_n; j++) {
                Arrays.fill(goodStrings[i][j][0], -1);
                Arrays.fill(goodStrings[i][j][1], -1);
            }
        }
        PrefixFunction pf = new PrefixFunction();
        this.pi = pf.calculate(evil);
        return findGoodStringsRec(0, 0, 0, 0);
    }

    private int findGoodStringsRec(int n, int eIdx, int isLess, int isMore) {
        if (eIdx >= evil.length())
            return 0;

        if (n >= s1.length())
            return 1;

        if (goodStrings[n][eIdx][isLess][isMore] != -1)
            return goodStrings[n][eIdx][isLess][isMore];

        int val = 0;
        int lowerLimit, upperLimit;
        if (isLess == 1) {
            upperLimit = 25;
        } else {
            upperLimit = s2.charAt(n)-'a';
        }

        if (isMore == 1) {
            lowerLimit = 0;
        } else {
            lowerLimit = s1.charAt(n)-'a';
        }
        for (int i=lowerLimit; i<= upperLimit; i++) {
            int idx = eIdx;
            while (idx>0 && i != (evil.charAt(idx) - 'a'))
                idx = pi[idx-1];
            if (i == evil.charAt(idx) - 'a') idx++;
            int nIsLess = isLess;
            if (isLess == 0 && i<upperLimit) nIsLess = 1;
            int nIsMore = isMore;
            if (isMore == 0 && i>lowerLimit) nIsMore = 1;
            val = (val + findGoodStringsRec(n+1, idx, nIsLess, nIsMore)) % MOD;
        }
        return goodStrings[n][eIdx][isLess][isMore] = val;
    }
}
