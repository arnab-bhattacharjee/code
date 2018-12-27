package dp;

import dp.DecodeWays2BottomUp;
import org.junit.Assert;
import org.junit.Test;

public class DecodeWays2Test {

    private DecodeWays2BottomUp decode = new DecodeWays2BottomUp();

    @Test
    public void numDecodings() {
        Assert.assertEquals(9, decode.numDecodings("*"));
    }

    @Test
    public void numDecodings1() {
        Assert.assertEquals(18, decode.numDecodings("1*"));
    }
}