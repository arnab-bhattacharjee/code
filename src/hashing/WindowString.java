package hashing;

import java.util.Deque;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;

public class WindowString {

       public String minWindow(String A, String B) {
            int left = -1, right = -1;
            Map<Character, Integer> reqdCharacterCount = new HashMap<>();
            Map<Character, Integer> windowCharacterCount = new HashMap<>();
            int minWindowSize = Integer.MAX_VALUE;
            int minWindowLeft = -1;
            Deque<Integer> dq = new LinkedList<>();

            for (int i=0; i<B.length(); i++) {
                if (reqdCharacterCount.containsKey(B.charAt(i))) {
                    reqdCharacterCount.put(B.charAt(i), reqdCharacterCount.get(B.charAt(i))+1);
                } else {
                    reqdCharacterCount.put(B.charAt(i), 1);
                }
            }
            System.out.println(reqdCharacterCount.toString());


            for (int i=0; i<A.length(); i++) {
                if (reqdCharacterCount.containsKey(A.charAt(i))) {
                    if (left == -1)
                        left = i;
                    dq.addLast(i);
                    if (windowCharacterCount.containsKey(A.charAt(i))) {
                        windowCharacterCount.put(A.charAt(i), windowCharacterCount.get(A.charAt(i))+1);
                    } else {
                        windowCharacterCount.put(A.charAt(i), 1);
                    }
                    if (isContainedIn(reqdCharacterCount, windowCharacterCount)) {
                        right = i;
                        System.out.println(dq.toString());
                        while (windowCharacterCount.get(A.charAt(dq.peekFirst()))
                                >reqdCharacterCount.get(A.charAt(dq.peekFirst()))) {
                            int idx = dq.pollFirst();
                            windowCharacterCount.put(A.charAt(idx), windowCharacterCount.get(A.charAt(idx))-1);
                        }
                        left = dq.peekFirst();
                        if (right-left+1 < minWindowSize) {
                            minWindowSize = right-left+1;
                            minWindowLeft = left;
                        }
                    }
                }
            }

            if (minWindowLeft == -1) return "";
            return A.substring(minWindowLeft, minWindowLeft+minWindowSize);
        }

        private boolean isContainedIn(Map<Character, Integer> m1, Map<Character, Integer> m2) {
            for (Map.Entry<Character, Integer> entry: m1.entrySet()) {
                char key = entry.getKey();
                int val = entry.getValue();
                if (m2.containsKey(key) && val<=m2.get(key)) {}
                else return false;
            }
            return true;
        }


}
