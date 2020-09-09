package thirty_day_challenge_sep;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeSet;

public class ContainsDuplicate3 {

    public boolean containsNearbyAlmostDuplicate(int[] nums, int k, int t) {
        int n = nums.length;
        TreeSet<Integer> set = new TreeSet<>();
        Map<Integer, Integer> count = new HashMap<>();
        for (int i=1; i<k; i++) {
            set.add(nums[i]);
            if (!count.containsKey(nums[i]))  {
                count.put(nums[i], 1);
            } else {
                count.put(nums[i], count.get(nums[i])+1);
            }
        }
        for (int i=0; i<n; i++) {
            int j = i+k;

            if (j<n) {
                set.add(nums[j]);
                if (!count.containsKey(nums[j]))  {
                    count.put(nums[j], 1);
                } else {
                    count.put(nums[j], count.get(nums[j])+1);
                }
            }
            if (i-1 >= 0) {
                int cnt = count.get(nums[i]);
                if (cnt == 1) {
                    count.remove(nums[i]);
                    set.remove(nums[i]);
                } else {
                    count.put(nums[i], cnt-1);
                }
            }

            Integer succ = set.ceiling(nums[i]);
            Integer pred = set.floor(nums[i]);
            if ((succ != null && Math.abs((long)nums[i]-succ) <= t)
                    || (pred != null && Math.abs((long)nums[i]-pred) <= t))
                return true;
        }

        return false;
    }
}
