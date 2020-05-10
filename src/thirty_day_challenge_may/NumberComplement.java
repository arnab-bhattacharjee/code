package thirty_day_challenge_may;

public class NumberComplement {

    public int findComplement(int num) {
        int mask = (getHighBit(num)<<1) - 1;
        return ~num & mask;

    }

    private int getHighBit(int n) {
        n |= (n >>  1);
        n |= (n >>  2);
        n |= (n >>  4);
        n |= (n >>  8);
        n |= (n >> 16);
        return n - (n >> 1);
    }
}
