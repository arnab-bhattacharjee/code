package dp;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class PalindromePartitioning2Test {

    private PalindromePartitioning2 pp = new PalindromePartitioning2();

    @Test
    public void test1() {
        Assert.assertEquals(2, pp.minCut("aabbaacd"));
    }

    @Test
    public void test2() {
        Assert.assertEquals(1, pp.minCut("aaaaaaabbbbbbbbbbbb"));
    }


    @Test
    public void test3() {
        Assert.assertEquals(0, pp.minCut("aaaaaaa"));
    }
}