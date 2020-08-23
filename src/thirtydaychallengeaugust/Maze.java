package thirtydaychallengeaugust;

import java.util.Arrays;

public class Maze {
    private enum Direction {
        LEFT
        , RIGHT
        , UP
        , DOWN
    }

    public boolean hasPath(int[][] maze, int[] start, int[] destination) {
        //System.out.println(Arrays.toString(start));
        if (Arrays.equals(start, destination))
            return true;

        boolean hasPath = false;
        maze[start[0]][start[1]] = 2;

        int[] left = travel(start, Direction.LEFT, maze);
        int[] right = travel(start, Direction.RIGHT, maze);
        int[] up = travel(start, Direction.UP, maze);
        int[] down = travel(start, Direction.DOWN, maze);

        if (left != null) {
            hasPath = hasPath(maze, left, destination);
            if (hasPath)
                return true;
        }
        if (right != null) {
            hasPath = hasPath(maze, right, destination);
            if (hasPath) {
                return true;
            }
        }
        if (up != null) {
            hasPath = hasPath(maze, up, destination);
            if (hasPath)
                return true;
        }
        if (down != null) {
            hasPath = hasPath(maze, down, destination);
            if (hasPath)
                return true;
        }
        return hasPath;
    }

    private int[] travel(int[] start, Direction direction, int[][] maze) {
        int r = maze.length;
        int c = maze[0].length;
        int[] next = start.clone();
        switch (direction) {
            case LEFT:
                next[1]--;
                if (next[1] < 0 || maze[next[0]][next[1]] == 1)
                    return null;

                while (next[1]-1 >=0 && maze[start[0]][next[1]-1] != 1)
                    next[1]--;
                if (maze[next[0]][next[1]] == 2)
                    return null;
                return next;
            case RIGHT:
                next[1]++;
                if (next[1] > c-1 || maze[next[0]][next[1]] == 1)
                    return null;

                while (next[1]+1 <= c-1 && maze[next[0]][next[1]+1] != 1)
                    next[1]++;
                if (maze[next[0]][next[1]] == 2)
                    return null;
                return next;
            case UP:
                next[0]--;
                if (next[0] < 0 || maze[next[0]][next[1]] == 1)
                    return null;

                while (next[0]-1 >= 0 && maze[next[0]-1][next[1]] != 1)
                    next[0]--;
                if (maze[next[0]][next[1]] == 2)
                    return null;
                return next;
            case DOWN:
                next[0]++;
                if (next[0] > r-1 || maze[next[0]][next[1]] == 1)
                    return null;

                while (next[0]+1 <= r-1 && maze[next[0]+1][next[1]] != 1)
                    next[0]++;
                if (maze[next[0]][next[1]] == 2)
                    return null;
                return next;
        }
        return null;
    }
}
