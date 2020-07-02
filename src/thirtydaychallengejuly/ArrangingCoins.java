package thirtydaychallengejuly;

public class ArrangingCoins {

    public int arrangeCoins(int n) {
        int lo=0;
        int hi=((int)Math.sqrt(n))<<1 + 1;

        int mid = 0;
        while (lo<hi) {
            mid = (hi+lo+1) >> 1;
            int prod;
            if (mid % 2 == 0) {
                prod = (mid>>1) * (mid+1);
            } else {
                prod = mid * ((mid+1) >> 1);
            }

            if (prod < n) {
                lo = mid;
            } else if (prod == n) {
                return mid;
            } else {
                hi = mid-1;
            }
        }

        return hi-1;
    }
}
