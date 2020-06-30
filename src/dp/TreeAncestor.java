package dp;

import java.util.Arrays;

public class TreeAncestor {

    private int[][] sparseTable;

    public TreeAncestor(int n, int[] parent) {
        int log = (int)(Math.log(n)/Math.log(2)) + 1;
        sparseTable = new int[n][log];

        for (int i=0; i<n; i++) {
            Arrays.fill(sparseTable[i], -1);
            sparseTable[i][0] = parent[i];
        }

        for (int i=1; i<=log; i++) {
            for (int j=0; (j + (1<<i)) < n; j++) {
                if (sparseTable[j][i-1] != -1)
                    sparseTable[j][i] = sparseTable[j][i-1] + sparseTable[sparseTable[j][i-1]][i-1];
                else
                    sparseTable[j][i] = -1;
            }
        }
    }

    public int getKthAncestor(int node, int k) {
        int[] bin = new int[31];

        int j=0;
        for (int i=k; i>0; i = (i >> 1), j++) {
            if (k%2 == 1) {
                bin[j] = 1;
            }
        }

        int curr = node;
        int anc = -1;
        for (int i=30; i>=0; i--) {
            if (bin[i] == 1) {
                anc = sparseTable[curr][i];
                if (anc == -1)
                    break;
                curr = anc;
            }
        }
        return anc;
    }
}
