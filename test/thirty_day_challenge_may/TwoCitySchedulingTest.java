package thirty_day_challenge_may;

import org.junit.Test;

import static org.junit.Assert.*;

public class TwoCitySchedulingTest {

    private TwoCityScheduling cityScheduling = new TwoCityScheduling();

    @Test
    public void test1() {
        System.out.println(cityScheduling.twoCitySchedCost(new int[][]{{10, 20},{400, 50}, {30, 200},  {30, 20}}));
    }

}