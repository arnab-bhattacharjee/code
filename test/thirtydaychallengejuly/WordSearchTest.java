package thirtydaychallengejuly;

import org.junit.Test;

public class WordSearchTest {

    @Test
    public void test1() {
        WordSearch search = new WordSearch();
        search.exist(new char[][]{
                {'c', 'a', 'c'}
                , {'a', 'a', 'a'}
                , {'b', 'c', 'd'}}, "aab");
    }


}