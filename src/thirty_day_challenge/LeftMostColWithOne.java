package thirty_day_challenge;

import java.util.List;

public class LeftMostColWithOne {

        public int leftMostColumnWithOne(BinaryMatrix binaryMatrix) {
            List<Integer> dim = binaryMatrix.dimensions();
            int r = dim.get(0);
            int c = dim.get(1);

            int memoize[][] = new int[r][c];
            for (int i=0; i<r; i++)
                for (int j=0; j<c; j++)
                    memoize[i][j] = -1;

            int lMost = Integer.MAX_VALUE;

            for (int i=0; i<r; i++) {
                int lo = 0;
                int hi = (i == 0) ? c-1 : lMost-1;
                int mid = -1;
                while (hi>=lo) {
                    mid = (hi+lo) >> 1;
                    int elem;
                    if (memoize[i][mid] != -1) {
                        elem = memoize[i][mid];
                    } else {
                        elem = binaryMatrix.get(i, mid);
                        memoize[i][mid] = elem;
                    }

                    if (mid+1 >= c) break; // there are no 1s

                    int rElem;
                    if (memoize[i][mid+1] != -1) {
                        rElem = memoize[i][mid+1];
                    } else {
                        rElem = binaryMatrix.get(i, mid+1);
                        memoize[i][mid+1] = rElem;
                    }

                    if (elem == 0 && rElem == 1) {
                        lMost = Math.min(lMost, mid+1);
                        break;
                    } else if (elem == 0 && rElem == 0) {
                        lo = mid+1;
                    } else {
                        hi = mid-1;
                    }
                    if (mid == 0 && elem == 1) // there are no 0's
                        return 0;
                }
            }
            return (lMost == Integer.MAX_VALUE) ? -1:lMost;
        }
}
