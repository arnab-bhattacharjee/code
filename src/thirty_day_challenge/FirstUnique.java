package thirty_day_challenge;

import java.util.*;

public class FirstUnique {

    Map<Integer, List<Integer>> m;
    PriorityQueue<Integer> q;
    List<Integer> nums;

    public FirstUnique(int[] nums) {
        int n = nums.length;
        m = new HashMap<>();
        q = new PriorityQueue<>();
        this.nums = new ArrayList<>();
        for (int i=0; i<n; i++) {
            this.add(nums[i]);
        }
    }

    public int showFirstUnique() {
        if (!q.isEmpty())
            return nums.get(q.peek());
        else
            return -1;
    }

    public void add(int value) {
        this.nums.add(value);
        if (m.containsKey(value)) {
            if (m.get(value).size() == 1) {
                q.remove(m.get(value).get(0));
            }
            m.get(value).add(nums.size()-1);
        } else {
            m.put(value, new ArrayList<>());
            m.get(value).add(nums.size()-1);
            q.add(nums.size()-1);
        }
    }
}
