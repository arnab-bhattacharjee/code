package thirty_day_challenge_june;

import org.junit.Test;

import static org.junit.Assert.*;

public class HIndexTest {

    private HIndex index = new HIndex();

    @Test
    public void test1() {
        System.out.println(index.hIndex(new int[]{0,1,2,3,4,5,6,7,10}));
    }

}