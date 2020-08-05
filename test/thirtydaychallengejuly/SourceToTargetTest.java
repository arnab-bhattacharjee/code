package thirtydaychallengejuly;

import org.junit.Test;

public class SourceToTargetTest {

    @Test
    public void test1() {
        SourceToTarget s = new SourceToTarget();
        s.allPathsSourceTarget(new int[][]{{1,2}, {3}, {3},{}});
    }

}