package dp;

import org.junit.Test;

import static org.junit.Assert.*;

public class DistinctSubsequencesTest {

    private DistinctSubsequences distinctSubsequences = new DistinctSubsequences();

    @Test
    public void test1() {
        System.out.println(distinctSubsequences.numDistinct("aaaaaaaa", "aa"));
    }

}