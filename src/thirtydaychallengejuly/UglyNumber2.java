package thirtydaychallengejuly;

public class UglyNumber2 {

    public int nthUglyNumber(int n) {
        int t1 = 0;
        int t2 = 0;
        int t3 = 0;

        if (n < 2) return n;

        int[] uglyNums = new int[n];
        uglyNums[0] = 1;

        for (int i=1; i<n; i++) {
            uglyNums[i] = Math.min(Math.min(uglyNums[t1] * 2, uglyNums[t2] * 3), uglyNums[t3] * 5);

            if (uglyNums[t1] * 2 == uglyNums[i]) {
                t1++;
            }
            if (uglyNums[t2] * 3 == uglyNums[i]) {
                t2++;
            }
            if (uglyNums[t3] * 5 == uglyNums[i]) {
                t3++;
            }
        }

        return uglyNums[n-1];
    }
}
