package thirty_day_challenge_june;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class PermutationSeqUsingFactoradic {

    public String getPermutation(int n, int k) {
        //generate factoradic representation of k
        int[] nInFactoradic = new int[n];

        int dividend = k-1;
        int divisor=1;
        while(dividend > 0) {
            int q = dividend/divisor;
            int r = dividend%divisor;
            nInFactoradic[divisor-1] = r;
            dividend = q;
            divisor++;
        }

        // factoradic representation to permutation
        List<Integer> vals = new ArrayList<>();
        for (int i=0; i<n; i++) {
            vals.add(i+1);
        }


        int[] res = new int[n];
        for (int i=0; i<n; i++){
            res[i] = vals.get(nInFactoradic[n-1-i]);
            vals.remove(nInFactoradic[n-1-i]);
        }

        int r = res[0];
        for (int i=1; i<n; i++) {
            r = r*10 + res[i];
        }

        return Integer.toString(r);
    }
}
