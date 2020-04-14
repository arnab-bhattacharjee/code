package dp;

import org.junit.Test;

import static org.junit.Assert.*;

public class MinNumOfRefuelingStopsTest {

    private MinNumOfRefuelingStops min = new MinNumOfRefuelingStops();

    @Test
    public void test1() {
        System.out.println(min.minRefuelStops(100,25, new int[][]{{25,25},{50,25},{75,25}}));
    }

}