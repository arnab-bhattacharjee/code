package dp;

import org.junit.Test;

import static org.junit.Assert.*;

public class MaxDotProductOf2SubsTest {

    private MaxDotProductOf2Subs maxDotProductOf2Subs = new MaxDotProductOf2Subs();

    @Test
    public void test1() {
        System.out.println(maxDotProductOf2Subs.maxDotProduct(new int[]{-3,-8,3,-10,1,3,9}, new int[]{9,2,3,7,-9,1,-8,5,-1,-1}));
    }

}