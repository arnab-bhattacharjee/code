package thirty_day_challenge_april;

import org.junit.Test;

public class MinPathSumTest {

    private MinPathSum minPath = new MinPathSum();

    @Test
    public void test1() {
        System.out.println(minPath.minPathSum(new int[][]{{1,3,1},{1,5,1},{4,2,1}}));
    }

}