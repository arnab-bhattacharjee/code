package thirty_day_challenge_may;

import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.*;

public class CountingBitsTest {

    private CountingBits bits = new CountingBits();

    @Test
    public void test1() {
        System.out.println(Arrays.toString(bits.countBits(89)));
    }

}