package thirty_day_challenge_may;

import javafx.util.Pair;

import java.util.Arrays;
import java.util.PriorityQueue;
import java.util.stream.Collectors;

public class KClosestPoints {

    public int[][] kClosest(int[][] points, int K) {
        PriorityQueue<Pair<Integer, int[]>> q = new PriorityQueue<>((e1, e2) -> e2.getKey()-e1.getKey());

        int n = points.length;

        for (int i=0; i<n; i++) {
            int dist = points[i][0] * points[i][0] + points[i][1] * points[i][1];
            if (q.size() < K) {
                q.add(new Pair<>(dist, points[i]));
            } else {
                int maxDist = q.peek().getKey();
                if (maxDist > dist) {
                    q.poll();
                    q.add(new Pair<>(dist, points[i]));
                }
            }
        }

        return q.stream().map(qe -> qe.getValue()).toArray(int[][]::new);
    }
}
