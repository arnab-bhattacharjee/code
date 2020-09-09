package thirty_day_challenge_sep;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class LargestTime {

    public String largestTimeFromDigits(int[] A) {
        List<int[]> perms = new ArrayList<>();
        int count=0;
        for (int i=0; i<4; i++) {
            for (int j=0; j<4; j++) {
                if (j==i) continue;
                for (int k=0; k<4; k++) {
                    if (k==j || k==i) continue;
                    for (int l=0; l<4; l++) {
                        if (l==i || l==j || l==k) continue;
                        perms.add(new int[]{A[i], A[j], A[k], A[l]});
                    }
                }
            }
        }

        perms = perms
                .stream()
                .filter(perm -> perm[0]*10+perm[1] <= 23)
                .filter(perm -> perm[2]*10+perm[3] <= 59)
                .collect(Collectors.toList());

        if (perms.isEmpty()) return "";

        Collections.sort(perms, (p1, p2) ->
                {
                    if (p1[0]*10+p1[1] != p2[0]*10+p2[1]) {
                        return (p2[0]*10+p2[1]) - (p1[0]*10+p1[1]);
                    } else {
                        return (p2[2]*10+p2[3]) - (p1[2]*10+p1[3]);
                    }
                }
        );

        StringBuilder sb = new StringBuilder();
        int[] perm = perms.get(0);
        return sb.append(perm[0]).append(perm[1]).append(":").append(perm[2]).append(perm[3]).toString();
    }
}
