package thirty_day_challenge;

import org.junit.Test;

import static org.junit.Assert.*;

public class NumberOfIslandsTest {

    private NumberOfIslands num = new NumberOfIslands();

    @Test
    public void test1() {
        System.out.println(num.numIslands(new char[][]{{'1','1','0','0','0'},{'1','1','0','0','0'},{'0','0','1','0','0'},{'0','0','0','1','1'}}));
    }

}