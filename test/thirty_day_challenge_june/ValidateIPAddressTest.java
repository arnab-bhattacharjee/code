package thirty_day_challenge_june;

import org.junit.Test;

import static org.junit.Assert.*;

public class ValidateIPAddressTest {

    @Test
    public void test1() {
        ValidateIPAddress validate = new ValidateIPAddress();

        System.out.println(validate.validIPAddress(""));
    }

}