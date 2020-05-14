package thirty_day_challenge_may;

public class Trie {

    public static class TrieNode {
        public TrieNode[] alphabets;

        public boolean leaf = false;

        public TrieNode() {
            this.alphabets = new TrieNode[26];
        }
    }

    private TrieNode root = new TrieNode();

    /** Initialize your data structure here. */
    public Trie() {

    }

    /** Inserts a word into the trie. */
    public void insert(String word) {
        char[] c = word.toCharArray();
        int n = word.length();
        TrieNode curr = root;
        for (int i=0; i<n; i++) {
            if (curr.alphabets[c[i]-'a'] == null)
                curr.alphabets[c[i]-'a'] = new TrieNode();
            if (i == n-1)
                curr.alphabets[c[i]-'a'].leaf = true;
            curr = curr.alphabets[c[i]-'a'];
        }
    }

    /** Returns if the word is in the trie. */
    public boolean search(String word) {
        TrieNode node = this.searchNode(word);
        return (node == null) ? false : node.leaf;
    }

    private TrieNode searchNode(String word) {
        TrieNode curr = root;
        char[] c = word.toCharArray();
        int n = word.length();
        for (int i=0; i<n; i++) {
            if (curr.alphabets[c[i]-'a'] != null) {
                curr = curr.alphabets[c[i]-'a'];
            } else {
                return null;
            }
        }
        return curr;
    }

    /** Returns if there is any word in the trie that starts with the given prefix. */
    public boolean startsWith(String prefix) {
        TrieNode node = this.searchNode(prefix);
        return (node == null) ? false : true;
    }
}
