package thirtydaychallengejuly;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class SourceToTarget {

    private List<List<Integer>>[] paths;
    private int[][] g;
    private int n;

    public List<List<Integer>> allPathsSourceTarget(int[][] graph) {
        this.g = graph;
        n = g.length;

        paths = new List[n];
        paths[n-1] = new ArrayList<>();
        List<Integer> path = new ArrayList<>();
        path.add(n-1);
        paths[n-1].add(path);

        return getPaths(0);
    }

    private List<List<Integer>> getPaths(int u) {
        if (paths[u] != null)
            return paths[u];

        List<List<Integer>> u_paths = new ArrayList<>();
        for (int v : g[u]) {
            getPaths(v);
            for (List<Integer> path : paths[v]) {
                LinkedList<Integer> newPath = new LinkedList<>(path);
                newPath.addFirst(u);
                u_paths.add(newPath);
            }
        }
        return (paths[u] = u_paths);
    }
}
