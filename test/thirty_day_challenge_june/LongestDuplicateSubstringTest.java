package thirty_day_challenge_june;

import org.junit.Test;

import static org.junit.Assert.*;

public class LongestDuplicateSubstringTest {

    private LongestDuplicateSubstring longest = new LongestDuplicateSubstring();

    @Test
    public void test1() {
        System.out.println(longest.longestDupSubstring("abracadabra"));
    }

}