package dp;

import org.junit.Test;

import static org.junit.Assert.*;

public class FrogJumpTest {

    private FrogJump frogJump = new FrogJump();

    @Test
    public void test1() {
        System.out.println(frogJump.canCross(new int[]{0,1,3,6,10,15,19,21,24,26,30,33}));
    }

}