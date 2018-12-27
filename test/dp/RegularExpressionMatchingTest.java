package dp;

import dp.RegularExpressionMatching;
import org.junit.Assert;
import org.junit.Test;

public class RegularExpressionMatchingTest {

    private RegularExpressionMatching matching = new RegularExpressionMatching();

    @Test
    public void testEmptyStrings() {
        Assert.assertTrue(matching.isMatch("", ""));
    }

    @Test
    public void test1() {
        String s = "bbbba";
        String p = ".*a*a";
        Assert.assertTrue(matching.isMatch(s, p));
    }

    @Test
    public void test2() {
        String p = "a*b*c*d*";
        String s = "";
        Assert.assertTrue(matching.isMatch(s, p));
    }

    @Test
    public void test3() {
        String p = "a*ab*bc*cd*d";
        String s = "abcd";
        Assert.assertTrue(matching.isMatch(s, p));
    }

    @Test
    public void test4() {
        String p = "aa*bb*cc*dd*";
        String s = "abcd";
        Assert.assertTrue(matching.isMatch(s, p));
    }

    @Test
    public void test5() {
        String p = "a.*cc*dd*";
        String s = "abbbbcd";
        Assert.assertTrue(matching.isMatch(s, p));
    }

    @Test
    public void test6() {
        String p = ".*";
        String s = "abbbbcd";
        Assert.assertTrue(matching.isMatch(s, p));
    }
}
