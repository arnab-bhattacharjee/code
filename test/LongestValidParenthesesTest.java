import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class LongestValidParenthesesTest {

    private LongestValidParentheses valParen = new LongestValidParentheses();

    @Test
    public void longestValidParentheses() {
        Assert.assertEquals(4, valParen.longestValidParentheses("()()))"));
    }
}