package dp;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class ArithmeticSlices2SubsequenceTest {

    private ArithmeticSlices2Subsequence a = new ArithmeticSlices2Subsequence();

    @Test
    public void test1() {
        Assert.assertEquals(7, a.numberOfArithmeticSlices(new int[]{2,4,6,8,10}));
    }

    @Test
    public void test2() {
        Assert.assertEquals(16, a.numberOfArithmeticSlices(new int[]{7,7,7,7,7}));
    }

    @Test
    public void test3() {
        Assert.assertEquals(47, a.numberOfArithmeticSlices(new int[]{2,4,4,4,6,6,6,8,8}));
    }

}