package dp;

import org.junit.Test;

import static org.junit.Assert.*;

public class MaxSumOfRectangleNoLargerThanKTest {

    private MaxSumOfRectangleNoLargerThanK maxSum = new MaxSumOfRectangleNoLargerThanK();

    @Test
    public void test1() {
        maxSum.maxSumSubmatrix(new int[][]{{1,0,1}, {0,-2,3}}, 1);
    }

}