package dp;

import dp.WildcardMatching;
import org.junit.Assert;
import org.junit.Test;

public class WildcardMatchingTest {
    WildcardMatching matching = new WildcardMatching();

    @Test
    public void test1() {
        String s = "aa";
        String p = "a";
        Assert.assertTrue(!matching.isMatch(s,p));
    }

    @Test
    public void test2() {
        String s = "aa";
        String p = "*";
        Assert.assertTrue(matching.isMatch(s,p));
    }

    @Test
    public void test3() {
        String s = "cb";
        String p = "?a";
        Assert.assertTrue(!matching.isMatch(s,p));
    }

    @Test
    public void test4() {
        String s = "adceb";
        String p = "*a*b";
        Assert.assertTrue(matching.isMatch(s,p));
    }

    @Test
    public void test5() {
        String s = "acdcb";
        String p = "a*c?b";
        Assert.assertTrue(!matching.isMatch(s,p));
    }
}