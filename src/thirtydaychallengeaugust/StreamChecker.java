package thirtydaychallengeaugust;

public class StreamChecker {
    private static class TrieNode {
        TrieNode[] children = new TrieNode[26];
        boolean leaf;
    }

    private void insert(String wordStr) {
        char[] word = wordStr.toCharArray();
        TrieNode curr = root;
        for (int i=0; i<word.length; i++) {
            if (curr.children[word[i]-'a'] == null) {
                curr.children[word[i]-'a'] = new TrieNode();
            }
            curr = curr.children[word[i]-'a'];
        }
        curr.leaf = true;
    }

    private TrieNode traverse(TrieNode node, char ch) {
        if (node.children[ch-'a'] == null)
            return null;
        else
            return node.children[ch-'a'];
    }

    private static final TrieNode root = new TrieNode();
    private char[] stream = new char[40000];
    private int streamLen = 0;

    public StreamChecker(String[] words) {
        for (String word: words) {
            insert(new StringBuilder(word).reverse().toString());
        }
    }

    public boolean query(char letter) {
        stream[streamLen] = letter;
        streamLen++;
        TrieNode curr = root;
        for (int i=streamLen-1; i>=0; i--) {
           TrieNode nxt = traverse(curr, stream[i]);
           if (nxt == null)
               return false;
           if (nxt.leaf)
               return true;
           else
               curr = nxt;
        }
        return false;
    }
}
