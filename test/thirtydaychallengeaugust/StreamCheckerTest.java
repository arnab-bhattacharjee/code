package thirtydaychallengeaugust;

import org.junit.Test;

public class StreamCheckerTest {

    @Test
    public void test1() {
        StreamChecker streamChecker = new StreamChecker(new String[] {"cd", "f", "kl"});
        streamChecker.query('a');          // return false
        streamChecker.query('b');          // return false
        streamChecker.query('c');          // return false
        streamChecker.query('d');          // return true, because 'cd' is in the wordlist
        streamChecker.query('e');          // return false
        streamChecker.query('f');          // return true, because 'f' is in the wordlist
        streamChecker.query('g');          // return false
        streamChecker.query('h');          // return false
        streamChecker.query('i');          // return false
        streamChecker.query('j');          // return false
        streamChecker.query('k');          // return false
        streamChecker.query('l');          // return true, because 'kl' is in the wordlist

    }

}