package thirty_day_challenge;

import org.junit.Test;

import static org.junit.Assert.*;

public class ValidParenthesisStringTest {

    private  ValidParenthesisString validate = new ValidParenthesisString();

    @Test
    public void test1() {
        System.out.println(validate.checkValidString("(())))))****"));
    }

}