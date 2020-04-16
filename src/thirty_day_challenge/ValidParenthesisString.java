package thirty_day_challenge;

import java.util.Deque;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class ValidParenthesisString {

    public boolean checkValidString(String s) {
        int n = s.length();
        Stack<Integer> st = new Stack<>();
        Deque<Integer> q = new LinkedList<>();
        for (int i=0; i<n; i++) {
            switch (s.charAt(i)) {
                case '*' :
                    q.add(i);
                    break;
                case '(' :
                    st.push(i);
                    break;
                case ')' :
                    if (!st.isEmpty())
                        st.pop();
                    else if (!q.isEmpty())
                        q.poll();
                    else
                        return false;
            }
        }

        // at this point we need to check if we can match ( with left over *s
        while(!st.isEmpty()) {
            int lbIdx = st.pop();
            if (q.isEmpty())
                return false;
            int starIdx = q.pollLast();
            if (lbIdx > starIdx)
                return false;
        }
        return true;
    }
}
