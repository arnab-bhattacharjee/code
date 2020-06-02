package dp;

import org.junit.Test;

import static org.junit.Assert.*;

public class BurstBalloonsTest {

    private BurstBalloons burstBalloons = new BurstBalloons();

    @Test
    public void test1() {
        System.out.println(burstBalloons.maxCoins(new int[]{3,1,5,8}));
    }

}