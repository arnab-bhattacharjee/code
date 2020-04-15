package dp;

import org.junit.Test;

import static org.junit.Assert.*;

public class MinNumOfRefuelingStopsTest {

    private MinNumOfRefuelingStops min = new MinNumOfRefuelingStops();

    @Test
    public void test1() {
        System.out.println(min.minRefuelStops(1000,299, new int[][]{{125,480},{162,46},{175,490},{194,207},{355,252},{369,75},{433,360},{553,95},{562,171},{566,12}}));
    }

}