package thirty_day_challenge_may;

import java.util.Arrays;
import java.util.Collections;

public class BreakString {

    public boolean checkIfCanBreak(String s1, String s2) {
        char[] c1 = s1.toCharArray();
        char[] c2 = s2.toCharArray();

        Arrays.sort(c1);
        Arrays.sort(c2);

        int n = c1.length;
        boolean res1 = true;
        boolean res2 = true;
        for (int i=0; i<n; i++) {
            res1 &= (c1[i] >= c2[i]);
            res2 &= (c1[i] <= c2[i]);
        }
        return res1 | res2;
    }
}
