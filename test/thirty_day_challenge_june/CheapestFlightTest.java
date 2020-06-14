package thirty_day_challenge_june;

import org.junit.Test;

import static org.junit.Assert.*;

public class CheapestFlightTest {

    private CheapestFlight cp = new CheapestFlight();

    @Test
    public void test1() {
        cp.findCheapestPrice(5, new int[][]{{0,1,5},{1,2,5},{0,3,2},{3,1,2},{1,4,1},{4,2,1}}, 0, 2, 2);
    }

}
