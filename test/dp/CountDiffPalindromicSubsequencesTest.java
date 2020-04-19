package dp;

import org.junit.Test;

import static org.junit.Assert.*;

public class CountDiffPalindromicSubsequencesTest {

    private CountDiffPalindromicSubsequences count = new CountDiffPalindromicSubsequences();

    @Test
    public void test1() {
        System.out.println(count.countPalindromicSubsequences("aaaaa"));
    }

}