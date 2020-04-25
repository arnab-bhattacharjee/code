package dp;

import org.junit.Test;

import static org.junit.Assert.*;

public class NumOfWaysToStayInTheSamePlaceTest {

    private NumOfWaysToStayInTheSamePlace numOfWays = new NumOfWaysToStayInTheSamePlace();

    @Test
    public void test1() {
        System.out.println(numOfWays.numWays(50,50));
    }

}