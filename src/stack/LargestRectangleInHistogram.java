package stack;

import java.util.Stack;

public class LargestRectangleInHistogram {

    public int largestRectangleArea(int[] heights) {
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
