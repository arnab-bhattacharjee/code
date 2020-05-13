package thirty_day_challenge_may;

import org.junit.Test;

import static org.junit.Assert.*;

public class RemoveKDigitsTest {

    private RemoveKDigits removeKDigits = new RemoveKDigits();

    @Test
    public void test1() {
        System.out.println(removeKDigits.removeKdigits("100000234", 5));
    }

}