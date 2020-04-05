package dp;

import org.junit.Test;

import static org.junit.Assert.*;

public class CherryPickupTest {

    private CherryPickup pickup = new CherryPickup();

    @Test
    public void test1() {
        System.out.println(pickup.cherryPickup(new int[][]{{1,-1,1,-1,1,1,1,1,1,-1},{-1,1,1,-1,-1,1,1,1,1,1},{1,1,1,-1,1,1,1,1,1,1},{1,1,1,1,1,1,1,1,1,1},{-1,1,1,1,1,1,1,1,1,1},{1,-1,1,1,1,1,-1,1,1,1},{1,1,1,-1,1,1,-1,1,1,1},{1,-1,1,-1,-1,1,1,1,1,1},{1,1,-1,-1,1,1,1,-1,1,-1},{1,1,-1,1,1,1,1,1,1,1}}));
    }

}