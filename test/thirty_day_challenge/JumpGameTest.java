package thirty_day_challenge;

import org.junit.Test;

import static org.junit.Assert.*;

public class JumpGameTest {

    private JumpGame jumpGame = new JumpGame();

    @Test
    public void test1() {
        System.out.println(jumpGame.canJump(new int[]{1,1,0,1}));
    }

}