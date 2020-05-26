package thirty_day_challenge_may;

import org.junit.Test;

import static org.junit.Assert.*;

public class IntervalListIntersectionsTest {

    private IntervalListIntersections intersections = new IntervalListIntersections();

    @Test
    public void test1() {
        intersections.intervalIntersection(new int[][]{{0,2},{5,10},{13,23},{24,25}}
        , new int[][]{{1,5},{8,12},{15,24},{25,26}});
    }

}