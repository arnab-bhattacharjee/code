package dp;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class DungeonGameTest {

    private DungeonGame game = new DungeonGame();

    @Test
    public void test1() {
        Assert.assertEquals(7, game.calculateMinimumHP(new int[][]{{-2,-3,3},{-5,-10,1},{10,30,-5}}));
    }

    @Test
    public void test2() {
        Assert.assertEquals(3, game.calculateMinimumHP(new int[][]{{1,-3,3},{0,-2,0},{-3,-3,-3}}));
    }

}