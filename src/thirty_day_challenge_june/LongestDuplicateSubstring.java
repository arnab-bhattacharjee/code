package thirty_day_challenge_june;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class LongestDuplicateSubstring {

    public static final int MOD = 16411;

    public String longestDupSubstring(String S) {
        int n = S.length();
        int lo = 1;
        int hi = n-1;
        int longestIdxStart = -1;
        int length = 0;
        while (lo <= hi) {
            int mid = (hi+lo)>>1;
            Set<Integer> hashVals = new HashSet<>();
            int prevHash = -1;
            for (int i=0; i<n-mid+1; i++) {
                int j = i+mid-1;
                int hash = 0;
                if (prevHash == -1) {
                    for (int k=i; k<j; k++) {
                        hash = ((hash + S.charAt(k)) % MOD * 256) % MOD;
                    }
                    hash = (hash + S.charAt(j)) % MOD;
                } else {
                    int hashOfPrevFirst = S.charAt(i-1);
                    for (int k=0; k<mid-1; k++) {
                        hashOfPrevFirst = (hashOfPrevFirst*256)%MOD;
                    }
                    hash = ((prevHash + MOD - hashOfPrevFirst) * 256 + S.charAt(j)) % MOD;
                }
                if (hashVals.contains(hash)) {
                    longestIdxStart = i;
                    length = mid;
                    lo = mid+1;
                    break;
                } else {
                    hashVals.add(hash);
                    prevHash = hash;
                }
            }
            if (lo != mid+1) {
                hi = mid-1;
            }
        }

        if (length == 0)
            return "";
        else
            return S.substring(longestIdxStart, longestIdxStart+length);
    }
}
