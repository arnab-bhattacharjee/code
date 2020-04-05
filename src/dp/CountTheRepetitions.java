package dp;

import javafx.util.Pair;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class CountTheRepetitions {

    public int getMaxRepetitions(String s1, int n1, String s2, int n2) {
        Map<Integer, Pair<Integer, Integer>>[] matchingIdx = new Map[s2.length()];
        for (int i=0; i<s2.length(); i++) {
            matchingIdx[i] = new HashMap<>();
        }
        int countBeforePeriod = 0;
        int firstOccurence = -1;
        int s1Window = 0;
        int s2Window = 0;
        for (int i=0,j=0; i<s1.length()*n1-1; i++) {
            if(s1.charAt(i%s1.length()) == s2.charAt(j%s2.length())) {
                if (matchingIdx[j%s2.length()].containsKey(i%s1.length())) {
                    firstOccurence = matchingIdx[j%s2.length()].get(i%s1.length()).getKey();
                    s1Window = i - matchingIdx[j%s2.length()].get(i%s1.length()).getKey();
                    s2Window = j - matchingIdx[j%s2.length()].get(i%s1.length()).getValue();
                    break;
                } else {
                    matchingIdx[j%s2.length()].put(i%s2.length(), new Pair<>(i,j));
                    j++;
                }
            }
        }
        if (firstOccurence == -1) return -1;

        int count = 0;
        count = ((s1.length()*n1 - firstOccurence)*(s2Window/s2.length()))/(s1Window*n2);

        return count;
    }
}
