package thirty_day_challenge_may;

import javafx.util.Pair;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class FrequencySort {

    public String frequencySort(String s) {
        int n = s.length();
        Map<Character, Integer> m = new HashMap<>();
        for (int i=0; i<n; i++) {
            Character c = s.charAt(i);
            if (m.containsKey(c)) {
                int cnt = m.get(c);
                m.put(c, cnt+1);
            } else {
                m.put(c, 1);
            }
        }

        int m_s = m.size();
        Pair<Character, Integer>[] pairs = new Pair[m_s];

        int i=0;
        for (Map.Entry<Character, Integer> e : m.entrySet()) {
            pairs[i++] = new Pair<>(e.getKey(), e.getValue());
        }
        Arrays.sort(pairs, (p1, p2) -> p2.getValue()-p1.getValue());

        StringBuilder sb = new StringBuilder();
        for (i=0; i<m_s; i++) {
            for (int j=0; j<pairs[i].getValue(); j++) {
                sb.append(pairs[i].getKey());
            }
        }
        return sb.toString();
    }
}
