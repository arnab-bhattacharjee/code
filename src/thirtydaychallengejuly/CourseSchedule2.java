package thirtydaychallengejuly;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class CourseSchedule2 {

    private int[] color;
    private List<Integer>[] g;
    private int n;
    private LinkedList<Integer> courses;
    private boolean cyclic;

    public int[] findOrder(int numCourses, int[][] prerequisites) {
        this.n = numCourses;
        g = new List[n];
        for (int i=0; i<n; i++)
            g[i] = new ArrayList<>();

        for (int[] edge: prerequisites) {
            g[edge[1]].add(edge[0]);
        }

        color = new int[numCourses];
        courses = new LinkedList<>();

        for (int i=0; i<n; i++) {
            if (color[i] == 0)
                dfs(i);
        }

        if (cyclic)
            return new int[0];
        else {
            return courses.stream().mapToInt(i->i).toArray();
        }
    }

    private void dfs(int u) {
        color[u] = 1;
        for (int v: g[u]) {
            if (color[v] == 0)
                dfs(v);
            if (color[v] == 1)
                cyclic = true;
        }

        color[u] = 2;
        courses.addFirst(u);
    }
}
