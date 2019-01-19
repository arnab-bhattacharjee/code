package dp;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.*;

public class WordBreak2Test {

    private WordBreak2 wb = new WordBreak2();

    @Test
    public void test1() {
        List<String > res = wb.wordBreak("catsanddog", new ArrayList<>(Arrays.asList("cats", "cat", "sand", "and", "dog")));
        for(String s:res) System.out.println(s);
    }

}