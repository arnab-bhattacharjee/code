package thirty_day_challenge_april;

import org.junit.Test;

public class PerformStringShiftTest {
    private PerformStringShift strShift = new PerformStringShift();

    @Test
    public void test1() {
        System.out.println(strShift.stringShift("abcdefg", new int[][]{{1,1},{1,1},{0,2},{1,3}}));
    }

}