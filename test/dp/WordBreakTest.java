package dp;

import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;

import static org.junit.Assert.*;

public class WordBreakTest {

    private WordBreak wb = new WordBreak();

    @Test
    public void test1() {
        Assert.assertTrue(wb.wordBreak("applepenapple", new ArrayList<String>(Arrays.asList("apple", "pen"))));
    }

    @Test
    public void test2() {
        Assert.assertFalse(wb.wordBreak("catsandog", new ArrayList<>(Arrays.asList("cats","cat","sand","and","dog"))));
    }

}