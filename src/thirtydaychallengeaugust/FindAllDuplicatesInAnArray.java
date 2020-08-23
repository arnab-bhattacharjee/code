package thirtydaychallengeaugust;

import java.util.ArrayList;
import java.util.List;

public class FindAllDuplicatesInAnArray {
    public List<Integer> findDuplicates(int[] nums) {
        List<Integer> res = new ArrayList<>();
        int n = nums.length;
        for (int i=0; i<n; i++) {
            while (nums[i] != i+1 && nums[i] != -1) {
                if (nums[i] == nums[nums[i]-1]) {
                    res.add(nums[i]);
                    nums[i] = -1;
                    break;
                }
                if (nums[nums[i]-1] != -1) {
                    int tmp = nums[i];
                    nums[i] = nums[nums[i]-1];
                    nums[nums[i]-1] = tmp;
                } else {
                    nums[nums[i-1]] = nums[i];
                    nums[i] = -1;
                }

            }
        }
        return new ArrayList<>(res);
    }
}
