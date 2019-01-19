package dp;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class InterleavingStringTest {

    private InterleavingString ils = new InterleavingString();

    @Test
    public void test1() {
        Assert.assertTrue(ils.isInterleave("aabcc", "dbbca", "aadbbcbcac"));
    }

    @Test
    public void test2() {
        Assert.assertFalse(ils.isInterleave("aabcc", "dbbca", "aadbbbaccc"));
    }

    @Test
    public void test3() {
        Assert.assertTrue(ils.isInterleave("ab", "bc", "babc"));
    }
}