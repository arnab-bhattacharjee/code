package dp;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class RemoveBoxes {

    public int removeBoxes(int[] boxes) {
        int n = boxes.length;

        List<Integer> cBox = new ArrayList<>();
        List<Integer> count = new ArrayList<>();

        for (int i=0; i<n; i++) {
            cBox.add(boxes[i]);
            int tCount = 1;
            while (i+1<=n-1 && boxes[i+1] == boxes[i]) {
                tCount++;
                i++;
            }
            count.add(tCount);
        }

        n = cBox.size();

        int[][] dp = new int[n][n];
        int[][] len = new int[n][n];

        for (int i=0; i<n; i++) {
            dp[i][i] = count.get(i) * count.get(i);
            len[i][i] = count.get(i);
        }

        for (int l=2; l<=n; l++) {
            for (int i=0; i<=n-l; i++) {
                int j = i+l-1;
                dp[i][j] = dp[i][j-1] + dp[j][j];
                len[i][j] = count.get(j);
                for (int k=i; k<j; k++) {
                    if (cBox.get(k) == cBox.get(j)) {
                        int val = dp[i][k]
                                        - (len[i][k] * len[i][k])
                                        + ((len[i][k] + count.get(j)) * (len[i][k] + count.get(j)))
                                        + dp[k+1][j-1];
                        if (val >= dp[i][j]) {
                            dp[i][j] = val;
                            len[i][j] = len[i][k] + count.get(j);
                        }
                    }
                }
            }
        }

        for (int i=0; i<n; i++) {
            for (int j=0; j<n; j++) {
                System.out.print(dp[i][j] + "\t");
            }
            System.out.println();
        }

        return dp[0][n-1];
    }
}
