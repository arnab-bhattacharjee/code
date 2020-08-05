package thirtydaychallengejuly;

import javafx.util.Pair;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class TopKFrequent {

    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer, Integer> m = new HashMap<>();

        for (int num: nums) {
            if (m.containsKey(num)) {
                int count = m.get(num);
                m.put(num, count+1);
            } else {
                m.put(num, 1);
            }
        }

        Pair<Integer, Integer>[] countToElem = new Pair[m.size()];
        int i=0;
        for (Map.Entry<Integer, Integer> e: m.entrySet()) {
            countToElem[i++] = new Pair<>(e.getValue(), e.getKey());
        }

        Arrays.sort(countToElem, (p1, p2) -> p2.getKey().compareTo(p1.getKey()));

        int[] res = new int[k];
        for (i=0; i<k; i++)
            res[i] = countToElem[i].getValue();

        return res;
    }
}
