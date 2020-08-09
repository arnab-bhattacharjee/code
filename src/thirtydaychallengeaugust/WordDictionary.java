package thirtydaychallengeaugust;

public class WordDictionary {

    public static class TrieNode {
        TrieNode[] children = new TrieNode[26];
        boolean leaf = false;
    }

    private TrieNode root;

    /** Initialize your data structure here. */
    public WordDictionary() {
        root = new TrieNode();
    }

    /** Adds a word into the data structure. */
    public void addWord(String word) {
        char[] wordChars = word.toCharArray();

        TrieNode curr = root;
        for (int i=0; i<wordChars.length; i++) {
            if (curr.children[wordChars[i] - 'a'] == null) {
                curr.children[wordChars[i] - 'a'] = new TrieNode();
            }
            curr = curr.children[wordChars[i] - 'a'];
        }
        curr.leaf = true;
    }

    /** Returns if the word is in the data structure. A word could contain the dot character '.' to represent any one letter. */
    public boolean search(String word) {
        return search(word.toCharArray(), 0, root);
    }

    private boolean search(char[] word, int startIdx, TrieNode node) {
        if (startIdx == word.length)
            return node.leaf;

        boolean match = false;
        if (word[startIdx] == '.') {
            for (TrieNode child : node.children) {
                if (child != null) {
                    match |= search(word, startIdx + 1, child);
                    if (match) return true;
                }
            }
        } else {
            if (node.children[word[startIdx] - 'a'] != null)
                match |= search(word, startIdx+1, node.children[word[startIdx] - 'a']);
        }
        return match;
    }
}
