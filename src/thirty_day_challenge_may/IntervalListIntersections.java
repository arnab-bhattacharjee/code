package thirty_day_challenge_may;

import java.util.ArrayList;

public class IntervalListIntersections {

    public int[][] intervalIntersection(int[][] A, int[][] B) {
        int i = 0, j = 0;

        ArrayList<int[]> res = new ArrayList<>();

        while (i < A.length && j < B.length) {
            int s = Math.max(A[i][0], B[j][0]);
            int e = Math.min(A[i][1], B[j][1]);
            if (s <= e) {
                res.add(new int[]{s, e});
            }

            if (B[j][1] > A[i][1]) {
                ++i;
            } else if (B[j][1] < A[i][1]){
                ++j;
            } else {
                ++i; ++j;
            }
        }

        return res.toArray(new int[res.size()][2]);
    }
}
