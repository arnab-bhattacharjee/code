package thirty_day_challenge_april;

public class NumberOfIslands {

    private int r;
    private int c;

    public int numIslands(char[][] grid) {
        if (grid.length == 0) return 0;
        r = grid.length;
        c= grid[0].length;

        boolean[][] visited = new boolean[r][c];

        int count = 0;

        for (int i=0; i<r; i++) {
            for (int j = 0; j < c; j++) {
                if (!visited[i][j] && grid[i][j] == '1') {
                    count++;
                    dfs(-1, -1, i, j, grid, visited);
                }
            }
        }
        return count;
    }

    private void dfs(int px, int py, int x, int y, char[][] grid, boolean[][] visited) {
        visited[x][y] = true;
        if(x+1<r && grid[x+1][y] == '1' && !visited[x+1][y] && (px!=x+1 || py!=y))
            dfs(x,y,x+1,y,grid,visited);
        if (y+1<c && grid[x][y+1] == '1' && !visited[x][y+1] && (px!=x || py!=y+1))
            dfs(x,y,x,y+1,grid,visited);
        if(x-1>=0 && grid[x-1][y] == '1' && !visited[x-1][y] && (px!=x-1 || py!=y))
            dfs(x,y,x-1,y,grid,visited);
        if (y-1>=0 && grid[x][y-1] == '1' && !visited[x][y-1] && (px!=x || py!=y-1))
            dfs(x,y,x,y-1,grid,visited);
    }
}
