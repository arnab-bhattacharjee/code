package thirty_day_challenge_june;

import thirty_day_challenge_may.Trie;

import java.util.*;

public class WordSearch2 {

    private Trie t = new Trie();

    private char[][] board;
    private boolean[][] isVisited;
    private int r;
    private int c;

    public List<String> findWords(char[][] board, String[] words) {
        for (String word: words)
            t.insert(word);

        Set<String> res = new HashSet<>();
        r = board.length;
        if (r == 0) return new ArrayList<>(res);
        c = board[0].length;

        this.board = board;
        this.isVisited = new boolean[r][c];

        Trie.TrieNode root = t.getRoot();

        for (int i=0; i<r; i++) {
            for (int j=0; j<c; j++) {
                res.addAll(dfs(i, j, root, new char[r*c], 0));
            }
        }

        return new ArrayList<>(res);
    }

    private List<String> dfs(int i, int j, Trie.TrieNode node, char[] s, int idx) {
        if (i >= r || j >= c || i < 0 || j < 0 || isVisited[i][j]) {
            return new ArrayList<>();
        }

        List<String> res = new ArrayList<>();
        Trie.TrieNode nextNode = t.traverse(node, board[i][j]);
        if (nextNode == null)
            return res;

        isVisited[i][j] = true;

        s[idx] = board[i][j];
        if (nextNode.leaf) {
            StringBuilder sb = new StringBuilder();

            for (int k=0; k<=idx; k++) {
                sb.append(s[k]);
            }
            res.add(sb.toString());
        }

        res.addAll(dfs(i+1, j, nextNode, s, idx+1));
        res.addAll(dfs(i-1, j, nextNode, s, idx+1));
        res.addAll(dfs(i, j+1, nextNode, s, idx+1));
        res.addAll(dfs(i, j-1, nextNode, s, idx+1));

        isVisited[i][j] = false;

        return res;
    }
}
