package dp;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ArithmeticSlices2Subsequence {

    private List<Map<Long, List<Integer>>> dp;
    private Map<Integer, Integer> zeroArithmeticProgressions;
    int count = 0;

    public int numberOfArithmeticSlices(int[] A) {
        if (A.length < 3) return 0;
        dp = new ArrayList<>(A.length);
        zeroArithmeticProgressions = new HashMap<>();
        for (int i=0;i<A.length;i++) {
            dp.add(new HashMap<>());
            if (zeroArithmeticProgressions.containsKey(A[i])) {
                zeroArithmeticProgressions.put(A[i],1+zeroArithmeticProgressions.get(A[i]));
            } else {
                zeroArithmeticProgressions.put(A[i], 1);
            }
        }
        for (int i=A.length-2; i>=0; i--) {
            for (int j=i+1; j<A.length;j++) {
                if (A[j]-A[i] == 0)
                    continue;
                if (!dp.get(i).containsKey((long)A[j]-A[i]))
                    dp.get(i).put((long)A[j]-A[i], new ArrayList<>());
                if (dp.get(j).containsKey((long)A[j]-A[i]))
                    for (int v: dp.get(j).get((long)A[j]-A[i])) {
                        dp.get(i).get((long)A[j] - A[i]).add(v + 1);
                            count += (v-1>0?v-1:0);
                    }
                else
                    dp.get(i).get((long)A[j]-A[i]).add(2);
            }
        }

        for (int zeroApCount: zeroArithmeticProgressions.values()) {
            if (zeroApCount > 2)
                count += (1<<zeroApCount) - 1 - zeroApCount - ((zeroApCount*(zeroApCount-1)) >> 1);
        }

        return count;
    }

}
