package thirty_day_challenge_may;

public class CountingBits {

    public int[] countBits(int num) {

        int[] res = new int[num+1];

        res[0] = 0;
        res[1] = 1;

        for (int i=1; (1<<i) <= num; i++) {
            for (int j=1<<i; j<=num && j<(1<<(i+1)); j++) {
                res[j] = 1 + res[j^ (1<<i)];
            }
        }

        return res;
    }
}
