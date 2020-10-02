package thirtydaychallengeoct;

import java.util.ArrayList;
import java.util.List;

public class CombinationSum {

    List<List<Integer>> res = new ArrayList<>();

    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        int[] count = new int[candidates.length];
        combinationSum(candidates, count, 0, target);

        return res;
    }

    private void combinationSum(int[] candidates, int[] count, int idx, int target) {
        if (target == 0) {
            List<Integer> combination = new ArrayList<>();
            for (int i=0; i < idx; i++)
                for (int j=0; j < count[i]; j++)
                    combination.add(candidates[i]);

            res.add(combination);
            return;
        }

        if (target < 0 || idx >= candidates.length)
            return;

        // don't include
        combinationSum(candidates, count, idx+1, target);
        // include
        int i=1;
        while (target-i*candidates[idx] >= 0) {
            count[idx] += i;
            combinationSum(candidates, count, idx+1, target - i*candidates[idx]);
            count[idx] -= i;
            i++;
        }
    }
}
