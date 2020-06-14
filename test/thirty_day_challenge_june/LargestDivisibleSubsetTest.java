package thirty_day_challenge_june;

import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.*;

public class LargestDivisibleSubsetTest {

    private LargestDivisibleSubset largestDivisibleSubset = new LargestDivisibleSubset();

    @Test
    public void test1() {
        largestDivisibleSubset.largestDivisibleSubset(new int[]{1,2,3,4,5,6,8,27,54,108});
    }

}