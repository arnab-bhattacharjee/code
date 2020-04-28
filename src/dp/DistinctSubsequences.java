package dp;

import java.util.*;

public class DistinctSubsequences {

    public int numDistinct(String s, String t) {
        int s_n = s.length();
        int t_n = t.length();

        int[] suffixCount = new int[t_n];
        Map<Character,Set<Integer>> tAlphabetMap = new HashMap<>();

        for (int i=0; i<t_n; i++) {
            if (!tAlphabetMap.containsKey(t.charAt(i)))
                tAlphabetMap.put(t.charAt(i), new TreeSet<>(Collections.reverseOrder()));

            tAlphabetMap.get(t.charAt(i)).add(i);
        }

        for (int i=0; i<s_n; i++) {
            if (tAlphabetMap.containsKey(s.charAt(i))) {
                for(int idx : tAlphabetMap.get(s.charAt(i))) {
                    if (idx == 0)
                        suffixCount[idx]++;
                    else
                        suffixCount[idx] += suffixCount[idx-1];
                }
            }
            for (int j=0; j<suffixCount.length; j++) {
                System.out.print(suffixCount[j] + "\t");
            }
            System.out.println();
        }

        return suffixCount[t_n-1];
    }
}
