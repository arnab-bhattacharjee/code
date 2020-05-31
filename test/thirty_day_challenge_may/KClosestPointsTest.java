package thirty_day_challenge_may;

import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.*;

public class KClosestPointsTest {

    private KClosestPoints kClosestPoints = new KClosestPoints();

    @Test
    public void test1() {
        System.out.println(Arrays.toString(kClosestPoints.kClosest(new int[][]{{3,3}, {5,-1}, {-2,4}}, 2)));
    }

}