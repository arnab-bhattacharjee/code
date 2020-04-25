package thirty_day_challenge;

import org.junit.Test;

import static org.junit.Assert.*;

public class BitwiseAndTest {

    private BitwiseAnd bitwiseAnd = new BitwiseAnd();

    @Test
    public void test1() {
        System.out.println(bitwiseAnd.rangeBitwiseAnd(1, 2147483647));
    }

}