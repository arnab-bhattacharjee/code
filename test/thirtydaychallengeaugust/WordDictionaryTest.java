package thirtydaychallengeaugust;

import org.junit.Test;

import static org.junit.Assert.*;

public class WordDictionaryTest {

    @Test
    public void test1() {
        WordDictionary wd = new WordDictionary();
        wd.addWord("bad");
        wd.addWord("dad");
        wd.addWord("mad");

        boolean res = wd.search("bad");
        System.out.println(res);
        res = wd.search("pad");
        System.out.println(res);
        res = wd.search("b..");
        System.out.println(res);
    }

}