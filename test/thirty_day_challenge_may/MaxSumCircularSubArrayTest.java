package thirty_day_challenge_may;

import org.junit.Test;

import static org.junit.Assert.*;

public class MaxSumCircularSubArrayTest {

    private MaxSumCircularSubArray maxSumCircularSubArray = new MaxSumCircularSubArray();

    @Test
    public void test1() {
        System.out.println(maxSumCircularSubArray.maxSubarraySumCircular(new int[]{3,-1,2,1}));
    }

}