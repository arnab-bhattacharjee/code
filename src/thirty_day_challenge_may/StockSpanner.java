package thirty_day_challenge_may;

import javafx.util.Pair;

import java.util.Stack;

public class StockSpanner {

    private Stack<Pair<Integer, Integer>> s;

    public StockSpanner() {
        this.s = new Stack<>();
    }

    public int next(int price) {
        int w = 1;
        while (!s.isEmpty() && s.peek().getKey() <= price) {
            w += s.pop().getValue();
        }
        s.push(new Pair<>(price, w));

        return w;
    }
}
