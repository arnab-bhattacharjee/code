package thirty_day_challenge_may;

import org.junit.Test;

import static org.junit.Assert.*;

public class StockSpannerTest {

    private StockSpanner ss = new StockSpanner();

    @Test
    public void test1() {
        ss = new StockSpanner();
        System.out.println(ss.next(100));
        System.out.println(ss.next(80));
        System.out.println(ss.next(60));
        System.out.println(ss.next(70));
        System.out.println(ss.next(60));
        System.out.println(ss.next(75));
        System.out.println(ss.next(85));

    }

}