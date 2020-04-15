package dp;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class LargestMultipleOfThree {

    public String largestMultipleOfThree(int[] digits) {
        int n = digits.length;
        List<Integer>[] groups = new List[3];
        for (int i=0; i<3; i++) groups[i] = new ArrayList<>();

        int sum = 0;
        for (int i=0; i<n; i++) {
            sum = (sum + digits[i])%3;
            groups[digits[i]%3].add(digits[i]);
        }

        for (int i=0; i<3; i++)
            Collections.sort(groups[i]);

        if (sum == 1) {
            // remove smallest elem of grp 1
            if (!groups[1].isEmpty())
                groups[1].remove(0);
            // else remove the 2 smallest elems of grp 2
            else if (groups[2].size() >= 2) {
                groups[2].remove(0);
                groups[2].remove(0);
            } else
                return "";
        }

        if (sum == 2) {
            // remove smallest elem of grp 2
            if (!groups[2].isEmpty())
                groups[2].remove(0);
                // else remove the 2 smallest elems of grp 1
            else if (groups[1].size() >= 2) {
                groups[1].remove(0);
                groups[1].remove(0);
            } else
                return "";
        }

        List<Integer> res = new ArrayList<>();
        res.addAll(groups[0]);
        res.addAll(groups[1]);
        res.addAll(groups[2]);
        Collections.sort(res, Collections.reverseOrder());

        if (res.get(0) == 0)
            return "0";

        StringBuilder sb = new StringBuilder();
        for(int v: res)
            sb.append(v);

        return sb.toString();
    }
}
