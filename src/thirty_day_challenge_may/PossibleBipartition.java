package thirty_day_challenge_may;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class PossibleBipartition {

    private List<Integer>[] g;
    private int[] color;

    public boolean possibleBipartition(int N, int[][] dislikes) {
        g = new List[N];

        for (int i=0; i<N; i++) {
            g[i] = new ArrayList<>();
        }

        for (int i=0; i<dislikes.length; i++) {
            int u = dislikes[i][0];
            int v = dislikes[i][1];
            g[u-1].add(v-1);
            g[v-1].add(u-1);
        }

        color = new int[N];
        Arrays.fill(color, -1);

        boolean val = true;
        for (int i=0; i<N; i++) {
            if (color[i] == -1)
                val &= dfs(i, -1);
        }
        return val;
    }

    private boolean dfs(int n, int pN) {
        if (pN == -1)
            color[n] = 0;
        else {
            int expectedColor = (color[pN] + 1) % 2;
            if (color[n] == -1) {
                color[n] = (color[pN] + 1) % 2;
            } else if (color[n] == expectedColor) {
                return true;
            } else
                return false;
        }

        boolean val = true;
        for (int c : g[n]) {
            if (c != pN)
                val &= dfs(c, n);
        }
        return val;
    }
}
