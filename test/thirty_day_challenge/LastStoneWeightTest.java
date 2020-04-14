package thirty_day_challenge;

import org.junit.Assert;
import org.junit.Test;
import thirty_day_challenge.LastStoneWeight;

public class LastStoneWeightTest {

    private LastStoneWeight lastStoneWeight = new LastStoneWeight();

    @Test
    public void test1() {
        Assert.assertEquals(1,lastStoneWeight.lastStoneWeight(new int[]{2,7,4,1,8,1}));
    }

}