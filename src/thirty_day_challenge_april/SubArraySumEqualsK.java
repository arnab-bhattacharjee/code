package thirty_day_challenge_april;

import java.util.HashMap;
import java.util.Map;

public class SubArraySumEqualsK {

    public int subarraySum(int[] nums, int k) {
        Map<Integer, Integer> cum = new HashMap<>();
        int n = nums.length;
        int sum = 0;
        int count = 0;
        for (int i=0; i<n; i++) {
            sum += nums[i];
            if (sum == k)
                count++;
            if (cum.containsKey(sum - k)) {
                count += cum.get(sum-k);
            }
            if (cum.containsKey(sum)) {
                cum.put(sum, cum.get(sum) + 1);
            } else {
                cum.put(sum, 1);
            }
        }
        return count;
    }
}
