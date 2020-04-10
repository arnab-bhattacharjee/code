package dp;

import java.util.Stack;

public class MinStack {

    private class Elem {
        int val;
        int min;

        public Elem(int val, int min) {
            this.val = val;
            this.min = min;
        }
    }

    private Stack<Elem> s = new Stack<>();

    public MinStack() {
    }

    public void push(int x) {
        Elem e;
        if (s.isEmpty()) {
            e = new Elem(x, x);
        } else {
            int prev_min = this.getMin();
            int min = Math.min(x, prev_min);
            e= new Elem(x, min);
        }
        s.push(e);
    }

    public void pop() {
        s.pop();
    }

    public int top() {
        return s.peek().val;
    }

    public int getMin() {
        return s.peek().min;
    }
}
