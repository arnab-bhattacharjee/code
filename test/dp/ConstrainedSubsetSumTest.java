package dp;

import org.junit.Test;

import static org.junit.Assert.*;

public class ConstrainedSubsetSumTest {

    private ConstrainedSubsetSum constrainedSubsetSum = new ConstrainedSubsetSum();

    @Test
    public void test1() {
        constrainedSubsetSum.constrainedSubsetSum(new int[]{10,2,-10,5,20}, 2);
    }

}