package thirty_day_challenge_april;

import java.util.Arrays;
import java.util.PriorityQueue;
import java.util.stream.Collectors;

public class LastStoneWeight {

    public int lastStoneWeight(int[] stones) {
        PriorityQueue<Integer> s = new PriorityQueue<>(stones.length, (w1,w2) -> {return w2-w1;});
        s.addAll(Arrays.stream(stones).boxed().collect(Collectors.toList()));
        int lastCombinedStone = 0;
        while(!s.isEmpty()) {
            int maxWt1 = s.poll();
            if (s.isEmpty())
                return maxWt1;
            int maxWt2 = s.poll();
            lastCombinedStone = maxWt1 - maxWt2;
            if (lastCombinedStone != 0)
                s.add(lastCombinedStone);
        }
        return lastCombinedStone;
    }
}
