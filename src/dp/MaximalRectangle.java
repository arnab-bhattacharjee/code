package dp;

import java.util.Arrays;
import java.util.Stack;

public class MaximalRectangle {

    public int maximalRectangle(char[][] matrix) {
        int r = matrix.length;
        if (r == 0)
            return 0;

        int c = matrix[0].length;

        int[] heights = new int[c];

        int max = 0;

        for (int i=0; i<r; i++) {
            for (int k=0; k<c; k++) {
               if (matrix[i][k] == '0')
                   heights[k] = 0;
                else
                   heights[k]++;
            }

                int lMax = largestRectangleArea(heights);
                max = Math.max(max, lMax);
        }
        return max;
    }

    private int largestRectangleArea(int[] heights) {
        int n = heights.length;
        Stack<Integer> s = new Stack<>();
        int max = 0;
        for (int i=0; i<n; i++) {
            while(!s.isEmpty() && heights[s.peek()] >= heights[i]) {
                int idx = s.pop();
                int h = heights[idx];
                // check area of rectangle with height h
                int w = (i-1)-((!s.isEmpty()) ? s.peek() : -1);
                if (max < h*w)
                    max = h*w;
            }
            s.push(i);
        }

        while(!s.isEmpty()) {
            int idx = s.pop();
            int h = heights[idx];
            // check area of rectangle with height h
            int w = (n-1)-((!s.isEmpty()) ? s.peek() : -1);
            if (max < h*w)
                max = h*w;
        }
        return max;
    }
}
