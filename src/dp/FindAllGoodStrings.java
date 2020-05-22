package dp;

import string.ZFunction;

import java.util.Arrays;

public class FindAllGoodStrings {

    int[][][] goodStrings;
    String s1;
    String s2;
    String evil;
    int[] z;

    public int findGoodStrings(int n, String s1, String s2, String evil) {
        this.s1 = s1;
        this.s2 = s2;
        this.evil = evil;
        int e_n = evil.length();
        goodStrings = new int[n][e_n][2];
        for (int i=0 ;i<n; i++) {
            for (int j=0; j<e_n; j++) {
                Arrays.fill(goodStrings[i][j], -1);
            }
        }
        ZFunction zf = new ZFunction();
        this.z = zf.calculate(evil);
        return findGoodStringsRec(0, 0, 0);
    }

    private int findGoodStringsRec(int n, int eIdx, int isLess) {
        if (eIdx >= evil.length())
            return 0;

        if (n > s1.length())
            return 1;

        if (goodStrings[n][eIdx][isLess] != -1)
            return goodStrings[n][eIdx][isLess];

        int val = 0;
        int lowerLimit, upperLimit;
        if (isLess == 1) {
            lowerLimit = 0;
            upperLimit = 25;
        } else {
            lowerLimit = s1.charAt(n)-'a';
            upperLimit = s2.charAt(n)-'a';
        }
        for (int i=lowerLimit; i<= upperLimit; i++) {
            int idx = eIdx;
            while (idx>0 && i != evil.charAt(eIdx))
                idx = z[idx-1];
            if (i == evil.charAt(idx)) idx++;
            int nIsLess = isLess;
            if (isLess == 0 && i<upperLimit) nIsLess = 1;
            val += findGoodStringsRec(n+1, idx, nIsLess);
        }
        return goodStrings[n][eIdx][isLess] = val;
    }
}
