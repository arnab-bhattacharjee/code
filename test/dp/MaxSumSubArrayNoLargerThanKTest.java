package dp;

import org.junit.Test;

import static org.junit.Assert.*;

public class MaxSumSubArrayNoLargerThanKTest {

    private MaxSumSubArrayNoLargerThanK maxSum = new MaxSumSubArrayNoLargerThanK();

    @Test
    public void test1() {
        System.out.println(maxSum.maxSumSubArray(new int[]{2,2,-1}, 0));
    }

}