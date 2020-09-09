package thirty_day_challenge_sep;

import org.junit.Test;

import static org.junit.Assert.*;

public class CompareVersionsTest {

    @Test
    public void test1() {
        CompareVersions compare = new CompareVersions();
        compare.compareVersion("0.1", "1.1");
    }

}