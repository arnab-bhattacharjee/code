package dp;

import org.junit.Test;

import static org.junit.Assert.*;

public class MinNumOfTapsToOpenToWaterGardenTest {

    private MinNumOfTapsToOpenToWaterGarden minNum = new MinNumOfTapsToOpenToWaterGarden();

    @Test
    public void test1() {
        System.out.println(minNum.minTaps(35, new int[]{1,0,4,0,4,1,4,3,1,1,1,2,1,4,0,3,0,3,0,3,0,5,3,0,0,1,2,1,2,4,3,0,1,0,5,2}));
    }

}