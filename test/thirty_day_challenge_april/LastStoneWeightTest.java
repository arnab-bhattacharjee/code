package thirty_day_challenge_april;

import org.junit.Assert;
import org.junit.Test;

public class LastStoneWeightTest {

    private LastStoneWeight lastStoneWeight = new LastStoneWeight();

    @Test
    public void test1() {
        Assert.assertEquals(1,lastStoneWeight.lastStoneWeight(new int[]{2,7,4,1,8,1}));
    }

}