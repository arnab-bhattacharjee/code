package thirtydaychallengeaugust;

import org.junit.Test;

import static org.junit.Assert.*;

public class FindRightIntervalTest {

    @Test
    public void test1() {
        FindRightInterval find = new FindRightInterval();
        find.findRightInterval(new int[][]{{1,4}, {2,3}, {3,4}});
    }

}