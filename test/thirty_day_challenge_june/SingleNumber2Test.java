package thirty_day_challenge_june;

import org.junit.Test;

import static org.junit.Assert.*;

public class SingleNumber2Test {

    @Test
    public void test1() {
        SingleNumber2 single = new SingleNumber2();

        single.singleNumber(new int[]{2,2,2,-3});
    }

}