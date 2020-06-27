package thirty_day_challenge_june;

import java.util.Arrays;

public class PermutationSequence {

    public void getPermutation(int n, int k) {
        int[] a = new int[n];
        for (int i=0; i<n; i++)
            a[i] = i+1;

        while (k > 1) {
            int i = n-2;
            while (a[i] > a[i+1])
                i--;

            int j = n-1;
            while (a[j] < a[i])
                j--;

            int t = a[i];
            a[i] = a[j];
            a[j] = t;
            Arrays.sort(a, i+1, n);
            k--;
        }
    }
}
