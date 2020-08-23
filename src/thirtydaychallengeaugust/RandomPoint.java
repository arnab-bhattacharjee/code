package thirtydaychallengeaugust;

import java.util.Random;

public class RandomPoint {

    private int[] pointCount;
    private int[][] rects;
    private int n;

    public RandomPoint(int[][] rects) {
        this.rects = rects;
        this.n = rects.length;
        pointCount = new int[n];
        for (int i=0; i<n; i++) {
            pointCount[i] = (Math.abs(rects[i][0]-rects[i][2]) + 1) * (Math.abs(rects[i][1]-rects[i][3]) + 1);
            if (i-1 >= 0)
                pointCount[i] += pointCount[i-1];
        }
    }

    public int[] pick() {
        Random rand = new Random();
        int randomInt = rand.nextInt(pointCount[n-1]);
        randomInt++;
        int lo=0;
        int hi=n-1;

        int rectIdx = -1;
        while (lo<hi) {
            int mid = lo + ((hi-lo-1)>>1);
            if (pointCount[mid] == randomInt) {
                rectIdx = mid;
                break;
            } else if (pointCount[mid] > randomInt) {
                hi = mid;
            } else {
                lo = mid+1;
            }
        }
        if (rectIdx == -1)
            rectIdx = hi;

        int pivotX = rects[rectIdx][0];
        int pivotY = rects[rectIdx][1];

        int pointNum = pointCount[rectIdx] - randomInt;

        int breadth = Math.abs(rects[rectIdx][0]-rects[rectIdx][2]) + 1;

        int pX = pivotX + (pointNum%breadth);
        int pY = pivotY + (pointNum/breadth);

        return new int[]{pX, pY};
    }
}
