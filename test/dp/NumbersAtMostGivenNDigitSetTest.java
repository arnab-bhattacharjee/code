package dp;

import org.junit.Test;

import static org.junit.Assert.*;

public class NumbersAtMostGivenNDigitSetTest {

    private NumbersAtMostGivenNDigitSet sol = new NumbersAtMostGivenNDigitSet();

    @Test
    public void test1() {
        System.out.println(sol.atMostNGivenDigitSet(new String[]{"1","3","5","7","9"}, 123));
    }

}