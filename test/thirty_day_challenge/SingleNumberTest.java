package thirty_day_challenge;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class SingleNumberTest {

    private SingleNumber singleNumber = new SingleNumber();

    @Test
    public void testSingleNumber() {
        int[] nums = {4,4,1,2,1,2,0};
        Assert.assertEquals(4,singleNumber.singleNumber(nums));
    }

}