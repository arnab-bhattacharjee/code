package thirtydaychallengeaugust;

import org.junit.Test;

import static org.junit.Assert.*;

public class ValidPalindromeTest {

    @Test
    public void test1() {
        ValidPalindrome valid = new ValidPalindrome();
        valid.isPalindrome("A man, a plan, a canal: Panama");
    }

}