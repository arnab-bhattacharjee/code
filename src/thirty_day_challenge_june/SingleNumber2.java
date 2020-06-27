package thirty_day_challenge_june;

public class SingleNumber2 {

    public int singleNumber(int[] nums) {
        int res = 0;
        for (int i=0; i<32; i++) {
            int ithBit = 1<<i;
            int sum = 0;
            for (int num: nums) {
                if ((num & ithBit) != 0) {
                    sum++;
                }
            }
            sum = sum%3;
            if (sum == 1) {
                res = res | ithBit;
            }
        }
        return res;
    }
}
