package thirty_day_challenge;

public class SingleNumber {

    public int singleNumber(int[] nums) {
        int xorVal = 0;
        for (int num: nums) {
            xorVal ^= num;
        }
        return xorVal;
    }
}
