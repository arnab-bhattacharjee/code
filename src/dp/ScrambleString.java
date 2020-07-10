package dp;

import java.util.Arrays;

public class ScrambleString {
    // isScrambled[i][j][l] represents is s1[i]...s1[i+l-1] & s2[j]...s2[j+l-1] are scrambled
    private int[][][] isScrambled;
    private String s1;
    private String s2;

    public boolean isScramble(String s1, String s2) {
        int n = s1.length();
        if (s2.length() != n)
            return false;

        this.s1 = s1;
        this.s2 = s2;

        isScrambled = new int[n][n][n+1];

        for (int i=0; i<n; i++)
            for (int j=0; j<n; j++) {
                Arrays.fill(isScrambled[i][j], -1);
            }

        return (isScramble(0, 0, n) == 1);
    }

    private int isScramble(int idx1, int idx2, int len) {
        if (len == 1 && s1.charAt(idx1) == s2.charAt(idx2)) return 1;

        if (isScrambled[idx1][idx2][len] != -1)
            return isScrambled[idx1][idx2][len];

        if (!isAnagram(idx1, idx2, len))
            return isScrambled[idx1][idx2][len] = 0;

        int isScramble = 0;
        for (int i=1; i<len; i++) {
            isScramble |= isScramble(idx1, idx2, i) & isScramble(idx1+i, idx2+i, len-i);
            // pruning
            if (isScramble == 1)
                break;
            isScramble |= isScramble(idx1, idx2+len-i, i) & isScramble(idx1+i, idx2, len-i);
        }

        return isScrambled[idx1][idx2][len] = isScramble;
    }

    private boolean isAnagram(int idx1, int idx2, int len) {
        int[] s1Count = new int[26];
        int[] s2Count = new int[26];

        for (int i=0; i<s1.length(); i++) {
            s1Count[s1.charAt(idx1+i)-'a']++;
            s2Count[s2.charAt(idx2+i)-'a']++;
        }

        return Arrays.equals(s1Count, s2Count);
    }
}
