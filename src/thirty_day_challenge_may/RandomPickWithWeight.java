package thirty_day_challenge_may;

import java.util.Arrays;
import java.util.Random;

public class RandomPickWithWeight {

    private int[] w;
    private int[] c;
    private int n;

    public RandomPickWithWeight(int[] w) {
        this.n = w.length;
        this.w = w;
        this.c = new int[n];
        c[0] = w[0];
        for (int i=1; i<n; i++)
            c[i] = c[i-1]+ w[i];
    }

    public int pickIndex() {
        Random rand = new Random();
        int wt = rand.nextInt(c[n-1]+1);
        int res = Arrays.binarySearch(c, wt);

        if (res >= 0)
            return res;

        else
            return -res-1;
    }
}
