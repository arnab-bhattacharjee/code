package thirty_day_challenge_june;

import java.util.*;

public class ReconstructItinerary {

    public List<String> findItinerary(List<List<String>> tickets) {
        Map<String, LinkedList<String>> g = new HashMap<>();
        for (List<String> depArr : tickets) {
            String dep = depArr.get(0);
            String arr = depArr.get(1);
            if (!g.containsKey(dep)) {
                g.put(dep, new LinkedList<>());
            }
            g.get(dep).add(arr);
        }

        for (List<String> e: g.values()) {
            Collections.sort(e);
        }

        LinkedList<String> res = new LinkedList<>();

        String src = "JFK";
        Stack<String> s = new Stack<>();

        s.add(src);

        while (!s.isEmpty()) {
            String u = s.peek();
            if (!g.containsKey(u) || g.get(u).isEmpty()) {
                res.addFirst(s.pop());
            } else {
                s.push(g.get(u).removeFirst());
            }
        }

        return res;
    }
}
