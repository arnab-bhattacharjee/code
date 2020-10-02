package thirty_day_challenge_sep;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class EvaluateDivision {

    public static class Pair {
        int vertex;
        double val;

        public Pair(int vertex, double val) {
            this.vertex = vertex;
            this.val = val;
        }
    }

    private List<Pair>[] g;
    private boolean[] visited;

    public double[] calcEquation(List<List<String>> equations, double[] values, List<List<String>> queries) {
        int label = 0;
        Map<String, Integer> varToLabel = new HashMap<>();

        g = new List[40];
        visited = new boolean[40];

        for (int i=0; i<40; i++)
            g[i] = new ArrayList();

        int n = equations.size();
        for (int i=0; i<n; i++) {
            String var1 = equations.get(i).get(0);
            String var2 = equations.get(i).get(1);
            int label1, label2;
            if (!varToLabel.containsKey(var1)) {
                varToLabel.put(var1, label);
                label1 = label;
                label++;
            } else {
                label1 = varToLabel.get(var1);
            }

            if (!varToLabel.containsKey(var2)) {
                varToLabel.put(var2, label);
                label2 = label;
                label++;
            } else {
                label2 = varToLabel.get(var2);
            }

            double val = values[i];
            g[label1].add(new Pair(label2, val));
            g[label2].add(new Pair(label1, 1/val));
        }

        int r_n = queries.size();
        double[] res = new double[r_n];

        for (int i=0; i<r_n; i++) {
            int u = varToLabel.get(queries.get(i).get(0));
            int v = varToLabel.get(queries.get(i).get(1));
            Double val = dfs(u, v);
            res[i] = (val == null) ? -1 : val;
        }

        return res;
    }

    private Double dfs(int u, int v) {
        if (u == v)
            return 1d;
        visited[u] = true;
        Double res = null;
        for (Pair p: g[u]) {
            if (!visited[p.vertex]) {
                if (v == p.vertex) {
                    res = p.val;
                    break;
                }
                else {
                    Double frac = dfs(p.vertex, v);
                    if (frac != null) {
                        res = p.val * frac;
                        break;
                    }
                }
            }
        }
        visited[u] = false;
        return res;
    }
}
