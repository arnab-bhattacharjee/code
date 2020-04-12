package dp;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class LastStoneWeightTest {

    private LastStoneWeight lastStoneWeight = new LastStoneWeight();

    @Test
    public void test1() {
        Assert.assertEquals(1,lastStoneWeight.lastStoneWeight(new int[]{2,7,4,1,8,1}));
    }

}