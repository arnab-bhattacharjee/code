package thirty_day_challenge_may;

import java.util.Arrays;
import java.util.Stack;

public class RemoveKDigits {

    public String removeKdigits(String num, int k) {
        Stack<Character> s = new Stack<>();
        int n = num.length();

        if (n == k) return "0";

        int r = k;
        for (int i=0; i<n; i++) {
            char val = num.charAt(i);
            if(s.isEmpty() && val != '0')
                s.add(val);
            else {
                while (!s.isEmpty() && s.peek() > val && r > 0) {
                    s.pop();
                    r--;
                }
                if (val == '0' && s.isEmpty()) {
                    // no need to push
                } else {
                    s.push(val);
                }
            }
        }

        while (r > 0 && !s.isEmpty()) {
            s.pop();
            r--;
        }

        int c_n = s.size();
        char[] c = new char[c_n];

        for (int i=0; i<n; i++) {
            c[c_n-1-i] = s.pop();
        }

        return (s.isEmpty()) ? "0" : new String(c);
    }
}
