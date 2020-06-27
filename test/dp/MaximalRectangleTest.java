package dp;

import org.junit.Test;

import static org.junit.Assert.*;

public class MaximalRectangleTest {

    MaximalRectangle max = new MaximalRectangle();

    @Test
    public void test1() {
        System.out.println(max.maximalRectangle(new char[][]{
                {'1', '0', '1', '0', '0'},
                {'1', '0', '1', '1', '1'},
                {'1', '1', '1', '1', '1'},
                {'1', '0', '0', '1', '0'}
        }));
    }

}