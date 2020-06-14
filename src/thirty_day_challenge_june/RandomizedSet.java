package thirty_day_challenge_june;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Random;

public class RandomizedSet {

        private HashMap<Integer, Integer> m;
        private List<Integer> l;

        /** Initialize your data structure here. */
        public RandomizedSet() {
            m = new HashMap<>();
            l = new ArrayList<>();
        }

        /** Inserts a value to the set. Returns true if the set did not already contain the specified element. */
        public boolean insert(int val) {
            if (m.containsKey(val)) {
                return false;
            } else {
                l.add(val);
                m.put(val, l.size()-1);
                return true;
            }
        }

        /** Removes a value from the set. Returns true if the set contained the specified element. */
        public boolean remove(int val) {
            if (m.containsKey(val)) {
                if (l.size() > 1) {
                    int idx = m.get(val);
                    if (idx == l.size()-1) {
                        m.remove(val);
                        l.remove(idx);
                    } else {
                        m.remove(val);
                        l.set(idx, l.get(l.size() - 1));
                        l.remove(l.size() - 1);
                        m.put(l.get(idx), idx);
                    }
                } else {
                    l.remove(0);
                    m.remove(val);
                }
                return true;
            } else {
                return false;
            }
        }

        /** Get a random element from the set. */
        public int getRandom() {
            int n = l.size();
            Random rand = new Random();
            return l.get(rand.nextInt(n));
        }
}
