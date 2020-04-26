package dp;

import org.junit.Test;

import static org.junit.Assert.*;

public class LCSTest {

    private LCS lcs = new LCS();

    @Test
    public void test1() {
        System.out.println(lcs.longestCommonSubsequence("abc", "def"));
    }

}