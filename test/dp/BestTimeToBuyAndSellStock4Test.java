package dp;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class BestTimeToBuyAndSellStock4Test {

    private BestTimeToBuyAndSellStock4 b = new BestTimeToBuyAndSellStock4();

    @Test
    public void test1() {
        Assert.assertEquals(2, b.maxProfit(2, new int[]{2,4,1}));
    }
    @Test
    public void test2() {
        Assert.assertEquals(7, b.maxProfit(2, new int[]{3,2,6,5,0,3}));
    }

    @Test
    public void test3() {
        Assert.assertEquals(1, b.maxProfit(1, new int[]{1,2}));
    }
}