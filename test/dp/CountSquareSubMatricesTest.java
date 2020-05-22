package dp;

import org.junit.Test;

import static org.junit.Assert.*;

public class CountSquareSubMatricesTest {

    private CountSquareSubMatrices count = new CountSquareSubMatrices();

    @Test
    public void test1() {
        System.out.println(count.countSquares(new int[][]{{0,1,1,1},
                {1,1,1,1},
                {0,1,1,1}}));
    }

}