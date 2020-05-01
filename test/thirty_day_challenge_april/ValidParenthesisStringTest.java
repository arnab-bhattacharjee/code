package thirty_day_challenge_april;

import org.junit.Test;

public class ValidParenthesisStringTest {

    private  ValidParenthesisString validate = new ValidParenthesisString();

    @Test
    public void test1() {
        System.out.println(validate.checkValidString("(())))))****"));
    }

}