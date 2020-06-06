package thirty_day_challenge_may;

import org.junit.Test;

import static org.junit.Assert.*;

public class RandomPickWithWeightTest {


    @Test
    public void test1() {
        RandomPickWithWeight rand = new RandomPickWithWeight(new int[]{1});
        for (int i=0; i<100; i++)
            System.out.println(rand.pickIndex());

    }

}