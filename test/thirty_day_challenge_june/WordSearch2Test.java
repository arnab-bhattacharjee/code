package thirty_day_challenge_june;

import org.junit.Test;

import java.util.List;

import static org.junit.Assert.*;

public class WordSearch2Test {

    @Test
    public void test1() {
        WordSearch2 ws = new WordSearch2();

        List<String> words = ws.findWords(new char[][]{
                {'a','b','c'}
                ,{'a','e','d'}
                ,{'a','f','g'}
                }
                , new String[]{"abcdefg","gfedcbaaa","eaabcdgfa","befa","dgc","ade"});

        for (String word : words)
            System.out.println(word);
    }

}