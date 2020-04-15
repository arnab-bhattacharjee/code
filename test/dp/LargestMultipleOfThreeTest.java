package dp;

import org.junit.Test;

import static org.junit.Assert.*;

public class LargestMultipleOfThreeTest {

    private LargestMultipleOfThree largest = new LargestMultipleOfThree();

    @Test
    public void test1() {
        System.out.println(largest.largestMultipleOfThree(new int[]{8,6,7,1,0}));
    }

}