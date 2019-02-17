package dp;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class OddEvenJumpTest {

    OddEvenJump j = new OddEvenJump();

    @Test
    public void test1() {
        Assert.assertEquals(2, j.oddEvenJumps(new int[]{10,13,12,14,15}));
    }
    @Test
    public void test2() {
        Assert.assertEquals(3, j.oddEvenJumps(new int[]{2,3,1,1,4}));
    }
}