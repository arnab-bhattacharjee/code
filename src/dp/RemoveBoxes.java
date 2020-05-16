package dp;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class RemoveBoxes {

    private int[] boxes;
    private int[][][] dp;
    private int[] count;

    public int removeBoxes(int[] boxes) {
        int n = boxes.length;

        List<Integer> cBox = new ArrayList<>();
        List<Integer> count = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            cBox.add(boxes[i]);
            int tCount = 1;
            while (i + 1 <= n - 1 && boxes[i + 1] == boxes[i]) {
                tCount++;
                i++;
            }
            count.add(tCount);
        }

        n = cBox.size();
        this.boxes = cBox.stream().mapToInt(i -> i).toArray();
        this.count = count.stream().mapToInt(i -> i).toArray();

        this.dp = new int[n][n][n];

        return removeBoxes(0, n - 1, 0);
    }

    private int removeBoxes(int i, int j, int streak) {
        if (i > j) return 0;

        if (dp[i][j][streak] != 0)
            return dp[i][j][streak];

        // start a new streak
        dp[i][j][streak] = removeBoxes(i+1, j, 0) + (streak + count[i]) * (streak + count[i]);

        // continue with streak
        for (int k=i+1; k<=j; k++) {
            if (boxes[i] == boxes[k]) {
                dp[i][j][streak] = Math.max(removeBoxes(i+1, k-1, 0)
                        + removeBoxes(k, j, streak + count[i]), dp[i][j][streak]);
            }
        }
        return dp[i][j][streak];
    }
}
