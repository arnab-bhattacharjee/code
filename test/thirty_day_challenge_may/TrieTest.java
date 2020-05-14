package thirty_day_challenge_may;

import org.junit.Test;

import static org.junit.Assert.*;

public class TrieTest {

    private Trie trie = new Trie();

    @Test
    public void test1() {
        trie.insert("apple");
        System.out.println(trie.search("apple"));   // returns true
        System.out.println(trie.search("app"));     // returns false
        System.out.println(trie.startsWith("app")); // returns true
        trie.insert("app");
        System.out.println(trie.search("app"));     // returns true
    }

}