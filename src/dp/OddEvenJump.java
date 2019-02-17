package dp;

import java.util.Map;
import java.util.TreeMap;

public class OddEvenJump {
    private boolean[] oddJump;
    private boolean[] evenJump;

    public int oddEvenJumps(int[] A) {
        if (A.length <= 1) return A.length;
        oddJump = new boolean[A.length];
        evenJump = new boolean[A.length];

        oddJump[A.length-1] = true;
        evenJump[A.length-1] = true;
        TreeMap<Integer, Integer> map = new TreeMap<>();
        map.put(A[A.length-1], A.length-1);

        for(int i=A.length-2; i>=0; i--) {

            if (map.containsKey(A[i])) {
                int sameValIdx = map.get(A[i]);
                oddJump[i] = evenJump[sameValIdx];
                evenJump[i] = oddJump[sameValIdx];
            } else {
                Map.Entry<Integer, Integer> succ = map.higherEntry(A[i]);
                Map.Entry<Integer, Integer> pred = map.lowerEntry(A[i]);
                if (succ != null) {
                    oddJump[i] = evenJump[succ.getValue()];
                }
                if (pred != null) {
                    evenJump[i] = oddJump[pred.getValue()];
                }
            }
            map.put(A[i], i);
        }

        int count=0;
        for (boolean v: oddJump) {
            if (v) count++;
        }
        return count;
    }
}

