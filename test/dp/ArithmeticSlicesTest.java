package dp;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class ArithmeticSlicesTest {
    ArithmeticSlices slices = new ArithmeticSlices();

    @Test
    public void test1() {
        Assert.assertEquals(3, slices.numberOfArithmeticSlices(new int[]{1, 2, 3, 4}));
    }

}