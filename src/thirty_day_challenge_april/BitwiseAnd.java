package thirty_day_challenge_april;

public class BitwiseAnd {

    public int rangeBitwiseAnd(int m, int n) {
        int[] bits = new int[31];

        int diff = n-m+1;

        int i = 0;
        for (; (1<<i)<diff && i<bits.length; i++) {
            System.out.println(1<<i);
            bits[i] = 0;
        }

        for (; i<bits.length; i++) {
            int twoPowerI = 1<<i;
            int div1 = m/twoPowerI;
            int div2 = n/twoPowerI;
            if (div1 != div2) {
                bits[i] = 0;
            } else {
                if (div1%2 == 1)
                    bits[i] = 1;
                else
                    bits[i] = 0;
            }
        }

        int res = 0;
        for (int j=0; j<bits.length; j++) {
            if (bits[j] == 1) {
                res += 1<<j;
            }
        }
        return res;
    }
}
