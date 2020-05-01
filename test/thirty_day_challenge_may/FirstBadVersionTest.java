package thirty_day_challenge_may;

import org.junit.Test;

import static org.junit.Assert.*;

public class FirstBadVersionTest {

    private FirstBadVersion firstBadVersion = new FirstBadVersion();

    @Test
    public void test1() {
        System.out.println(firstBadVersion.firstBadVersion(2, new boolean[]{false, false, false}));
    }

}