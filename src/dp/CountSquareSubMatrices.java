package dp;

public class CountSquareSubMatrices {

    public int countSquares(int[][] matrix) {
        int r = matrix.length;
        int c = matrix[0].length;
        int[][] maxLen = new int[r][c];
        int count = 0;

        for (int i=0; i<r; i++) {
            for (int j=0; j<c; j++) {
                int val = 0;
                if (matrix[i][j] == 1) {
                    val = Math.min((j-1 >= 0) ? maxLen[i][j-1] : 0
                            , Math.min((i-1 >= 0) ? maxLen[i-1][j] : 0
                            , (i-1 >= 0 && j-1 >= 0) ? maxLen[i-1][j-1] : 0));
                    val++;
                    maxLen[i][j] = val;
                    count += val;
                }
            }
        }
        return count;
    }
}
