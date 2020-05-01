package thirty_day_challenge_may;

public class FirstBadVersion {

    public int firstBadVersion(int n, boolean[] a) {
        int hi = n;
        int lo = 1;
        boolean badVersionExists = false;
        while (true && hi >= lo) {
            int mid = hi - ((hi-lo+1)>>1);;
            boolean badVersion = a[mid];
            if (badVersion) {
                badVersionExists = true;
                if (hi == lo) break;
                hi = mid;
            } else {
                lo = mid+1;
            }
        }
        return badVersionExists ? hi : -1;
    }
}
