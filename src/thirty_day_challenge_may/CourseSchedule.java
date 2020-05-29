package thirty_day_challenge_may;

import java.util.ArrayList;
import java.util.List;

public class CourseSchedule {

    private List<Integer>[] g;
    private int[] color;

    public boolean canFinish(int numCourses, int[][] prerequisites) {
        g = new List[numCourses];
        color = new int[numCourses];

        for (int i=0; i<numCourses; i++)
            g[i] = new ArrayList<>();

        for (int i=0; i<prerequisites.length; i++) {
            g[prerequisites[i][1]].add(prerequisites[i][0]);
        }

        for (int i=0; i<numCourses; i++) {
            if (color[i] == 0) {
                boolean isAcyclic = isAcyclic(i);
                if (!isAcyclic)
                    return false;
            }
        }
        return true;
    }

    private boolean isAcyclic(int u) {
        boolean isACyclic = true;

        color[u] = 1;

        for (int v: g[u]) {
            if (color[v] == 1)
                return false;

            isACyclic &= isAcyclic(v);
            if (!isACyclic)
                return false;
        }

        color[u] = 2;
        return true;
    }
}
