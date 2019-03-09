package dp;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class SplitArrayLargestSumTest {

    SplitArrayLargestSum split = new SplitArrayLargestSum();

    @Test
    public void test1() {
        Assert.assertEquals(18, split.splitArray(new int[]{7,2,5,10,8}, 2));
    }

    @Test
    public void test2() {
        Assert.assertEquals(18, split.splitArray(new int[]{7,2,5,10,8,6,13,1}, 4));
    }

}