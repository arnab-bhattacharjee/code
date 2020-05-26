package dp;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collector;

public class MakeArrayStrictlyIncreasing {

    private int[][][] dp;
    private int[] a1;
    private int a1_n;
    private List<Integer> a2;
    private int a2_n;
    private static final int _oo = Integer.MIN_VALUE;

    public int makeArrayIncreasing(int[] arr1, int[] arr2) {
        this.a1 = arr1;
        this.a1_n = arr1.length;
        Arrays.sort(arr2);
        List<Integer> a2 = new ArrayList<>();

        a2.add(arr2[0]);
        for (int i=1; i<arr2.length; i++) {
            if(arr2[i] != arr2[i-1])
                a2.add(arr2[i]);
        }

        this.a2 = a2;
        this.a2_n = a2.size();

        dp = new int[a1_n][a2_n+1][3];

        for (int i=0; i<a1_n; i++)
            for (int j=0; j<a2_n+1; j++)
                Arrays.fill(dp[i][j], _oo);

        return makeArrayIncreasing(0,0, 2);
    }

    private int makeArrayIncreasing(int i, int j, int fromA1) {
        if (i >= a1_n)
            return 0;

        if (dp[i][j][fromA1] != _oo)
            return dp[i][j][fromA1];


        int ll = -1;
        if (fromA1 == 1) {
            ll = a1[i-1];
        } else if (fromA1 == 0){
            if (j-1 >= 0)
                ll = a2.get(j-1);
        }

        dp[i][j][fromA1] = -1;

        if (a1[i] > ll)
            dp[i][j][fromA1] = makeArrayIncreasing(i+1, j, 1);

        int k;
        if (fromA1 == 1) {
            k = Collections.binarySearch(a2, ll);
            if (k<0)
                k = -k-1;
            else
                k++;
        } else {
            k = j;
        }

        if (k<a2_n && a2.get(k) > ll) {
            int val = makeArrayIncreasing(i + 1, k+1, 0);
            if (val != -1)
                dp[i][j][fromA1] = Math.min(val + 1, (dp[i][j][fromA1] != -1) ? dp[i][j][fromA1] : Integer.MAX_VALUE);
        }

        return dp[i][j][fromA1];
    }
}
