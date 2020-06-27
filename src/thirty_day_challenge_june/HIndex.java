package thirty_day_challenge_june;

public class HIndex {

    public int hIndex(int[] citations) {
        int n = citations.length;

        int lo=0;
        int hi=n-1;
        int mid = -1;
        while (lo < hi) {
            mid = hi - ((hi-lo+1)>>1);
            if (citations[mid] > n-mid-1) {
                hi = mid-1;
            } else if (citations[mid] < n-mid-1){
                lo = mid+1;
            } else {
                lo = mid;
                if(citations[hi] > n-hi-1)
                    hi = hi-1;
                else
                    return citations[hi];
            }
        }
        return citations[mid];
    }
}
