package dp;

import org.junit.Test;

import static org.junit.Assert.*;

public class RussianDollEnvelopesTest {

    private RussianDollEnvelopes envelopes = new RussianDollEnvelopes();

    @Test
    public void test1() {
        System.out.println(envelopes.maxEnvelopes(new int[][]{{46,89},{50,53},{52,68},{72,45},{77,81}}));
    }

}