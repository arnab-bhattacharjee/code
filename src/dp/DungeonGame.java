package dp;

/**
 * sub problem : min[i][j] = min health required to go from (i,j) to bottom right.
 * recurrence : min[i][j] = max(1, min(-dungeon[i][j]+min[i+1][j], -dungeon[i][j]+min[i][j+1]))
 */
public class DungeonGame {

    private int[][] min;

    public int calculateMinimumHP(int[][] dungeon) {
        min = new int[2][dungeon[0].length];

        for (int i=dungeon.length-1; i>=0; i--) {
            for (int j=dungeon[0].length-1; j>=0; j--) {
                if (i==dungeon.length-1 && j==dungeon[0].length-1) {
                    min[i%2][j] = Math.max(1, -dungeon[i][j]+1);
                }else if (i==dungeon.length-1) {
                    min[i % 2][j] = Math.max(1, min[i%2][j+1] - dungeon[i][j]);
                } else if (j==dungeon[0].length-1) {
                    min[i % 2][j] = Math.max(1, min[(i+1)%2][j] - dungeon[i][j]);
                } else {
                    min[i % 2][j] = Math.min(min[i%2][j+1] - dungeon[i][j], min[(i+1)%2][j] - dungeon[i][j]);
                    min[i % 2][j] = Math.max(1, min[i%2][j]);
                }
            }
        }
        return min[0][0];
    }
}
