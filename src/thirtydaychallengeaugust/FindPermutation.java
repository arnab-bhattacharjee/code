package thirtydaychallengeaugust;

import java.util.ArrayList;
import java.util.List;

public class FindPermutation {

    public int[] findPermutation(String s) {
        char[] str = s.toCharArray();
        int n = str.length;

        int firstElem = 0;
        int sum = 0;
        for (int i=0; i<n; i++) {
            sum += (str[i] == 'D') ? 1 : -1;
            firstElem = Math.max(sum, firstElem);
        }
        firstElem++;

        List<Integer> nums = new ArrayList<>();
        for (int i=1; i<=n+1; i++) {
            nums.add(i);
        }

        int[] res = new int[n+1];
        res[0] = firstElem;
        int prevIdx = firstElem-1;
        nums.remove(firstElem-1);
        for (int i=0; i<n; i++) {
            int idx;
            if (str[i] == 'D') {
                idx = prevIdx-1;
                if (idx < 0) idx = 0;
            } else {
                idx = prevIdx;
            }
            res[i+1] = nums.remove(idx);
            prevIdx = idx;
        }

        return res;
    }
}
