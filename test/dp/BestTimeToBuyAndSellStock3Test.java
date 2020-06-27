package dp;

import org.junit.Test;

import static org.junit.Assert.*;

public class BestTimeToBuyAndSellStock3Test {

    @Test
    public void test1() {
        BestTimeToBuyAndSellStock3 bestTimeToBuyAndSellStock = new BestTimeToBuyAndSellStock3();

        System.out.println(bestTimeToBuyAndSellStock.maxProfit(new int[] {3,2,6,5,0,3}));
    }

}