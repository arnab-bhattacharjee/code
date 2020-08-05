package thirtydaychallengejuly;

public class WordSearch {

    private char[][] board;
    private int r;
    private int c;
    private String word;

    public boolean exist(char[][] board, String word) {
        this.board = board;
        this.word = word;
        r = board.length;
        c = board[0].length;

        for (int i=0; i<r; i++) {
            for (int j=0; j<c; j++) {
                boolean exists = dfs(i,j,0);
                if (exists)
                    return true;
            }
        }
        return false;
    }

    private boolean dfs(int rIdx, int cIdx, int wIdx) {
        if (wIdx == word.length())
            return true;

        if (rIdx<0 || rIdx>=r || cIdx<0 || cIdx>=c)
            return false;

        boolean exists = false;
        if (board[rIdx][cIdx] == word.charAt(wIdx)) {
            char tmp = board[rIdx][cIdx];
            board[rIdx][cIdx] = '#';
            exists |= dfs(rIdx+1, cIdx, wIdx+1);
            if (exists) {
                board[rIdx][cIdx] = tmp;
                return true;
            }
            exists |= dfs(rIdx, cIdx+1, wIdx+1);
            if (exists) {
                board[rIdx][cIdx] = tmp;
                return true;
            }
            exists |= dfs(rIdx-1, cIdx, wIdx+1);
            if (exists) {
                board[rIdx][cIdx] = tmp;
                return true;
            }
            exists |= dfs(rIdx, cIdx-1, wIdx+1);
            if (exists) {
                board[rIdx][cIdx] = tmp;
                return true;
            }
            board[rIdx][cIdx] = tmp;
        }

        return exists;

    }
}
