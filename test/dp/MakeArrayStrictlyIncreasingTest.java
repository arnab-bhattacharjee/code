package dp;

import org.junit.Test;

import static org.junit.Assert.*;

public class MakeArrayStrictlyIncreasingTest {

    private MakeArrayStrictlyIncreasing makeArrayStrictlyIncreasing = new MakeArrayStrictlyIncreasing();

    @Test
    public void test1() {
        System.out.println(makeArrayStrictlyIncreasing.makeArrayIncreasing(new int[]{19,2,1,12,7,14}
        , new int[]{6,17,4,6,13,4,18,17,16,7,14,16}));
    }

}