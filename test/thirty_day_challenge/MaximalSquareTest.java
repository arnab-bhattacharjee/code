package thirty_day_challenge;

import org.junit.Test;

import static org.junit.Assert.*;

public class MaximalSquareTest {

    private MaximalSquare maxSquare = new MaximalSquare();

    @Test
    public void test1() {
        System.out.println(maxSquare.maximalSquare(new char[][]{}));
    }

}