package thirty_day_challenge_april;

import org.junit.Assert;
import org.junit.Test;

public class SingleNumberTest {

    private SingleNumber singleNumber = new SingleNumber();

    @Test
    public void testSingleNumber() {
        int[] nums = {4,4,1,2,1,2,0};
        Assert.assertEquals(4,singleNumber.singleNumber(nums));
    }

}