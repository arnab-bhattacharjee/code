package thirty_day_challenge_may;

import org.junit.Test;

import static org.junit.Assert.*;

public class NumberComplementTest {

    public NumberComplement complement = new NumberComplement();

    @Test
    public void test1() {
        System.out.println(complement.findComplement(-5));
    }

}