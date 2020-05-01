package thirty_day_challenge_april;

public class SingleNumber {

    public int singleNumber(int[] nums) {
        int xorVal = 0;
        for (int num: nums) {
            xorVal ^= num;
        }
        return xorVal;
    }
}
