package thirty_day_challenge_may;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class QueueReconstruct {

    public int[][] reconstructQueue(int[][] people) {
        int n = people.length;
        int[][] q = new int[n][2];

        Arrays.sort(people, (p1, p2) -> (p1[0]-p2[0] == 0) ? p2[1]-p1[1] : p1[0]-p2[0]);
        for (int i=0; i<n; i++)
            Arrays.fill(q[i], -1);

        List<Integer> l = new ArrayList<>();
        for (int i=0; i<n; i++)
            l.add(i);

        for (int i=0; i<n; i++) {
            int h = people[i][0];
            int rPos = people[i][1];

            int idx = l.get(rPos);
            l.remove(rPos);

             q[idx][0] = h;
             q[idx][1] = people[i][1];
        }
        return q;
    }
}
