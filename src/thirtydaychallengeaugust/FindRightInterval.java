package thirtydaychallengeaugust;

import java.util.Arrays;

public class FindRightInterval {

    public int[] findRightInterval(int[][] intervals) {
        int n = intervals.length;
        int[][] indexedIntervals = new int[n][3];
        for (int i=0; i<n; i++) {
            indexedIntervals[i] = new int[]{i, intervals[i][0], intervals[i][1]};
        }
        Arrays.sort(indexedIntervals, (i1, i2) -> {
            if (i1[2] != i2[2])
                return i1[2]-i2[2];
            else
                return i1[1]-i2[1];
        });
        int[] res = new int[n];
        int j=1;
        for (int i=0; i<n; i++) {
            while(j<n && indexedIntervals[i][2] > indexedIntervals[j][1]) {
                j++;
            }
            if (j >= n)
                res[indexedIntervals[i][0]] = -1;
            else
                res[indexedIntervals[i][0]] = indexedIntervals[j][0];
        }
        return res;
    }
}
