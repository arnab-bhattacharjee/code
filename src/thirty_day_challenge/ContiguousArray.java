package thirty_day_challenge;

import java.util.HashMap;
import java.util.Map;

public class ContiguousArray {

    public int findMaxLength(int[] nums) {
        if (nums.length<2) return 0;
        Map<Integer, Integer> m = new HashMap<>();
        int sum = 0;
        int maxLen = 0;
        m.put(0,-1);
        for(int i=0; i<nums.length; i++) {
            if (nums[i] == 1) sum++;
            else sum--;

            if (m.containsKey(sum)) maxLen = Math.max(maxLen,i-m.get(sum));
            else m.put(sum, i);
        }
        return maxLen;
    }
}
