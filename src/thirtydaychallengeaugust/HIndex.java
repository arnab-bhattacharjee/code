package thirtydaychallengeaugust;

import java.util.Arrays;

public class HIndex {

    public int hIndex(int[] citations) {
        Arrays.sort(citations);
        int max = Integer.MIN_VALUE;
        for (int i=0; i<citations.length ;i++) {
            max = Math.max(Math.min(citations[i], i), max);
        }
        return max+1;
    }
}
