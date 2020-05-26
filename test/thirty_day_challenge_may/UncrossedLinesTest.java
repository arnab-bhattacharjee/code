package thirty_day_challenge_may;

import org.junit.Test;

import static org.junit.Assert.*;

public class UncrossedLinesTest {

    private UncrossedLines uncrossedLines = new UncrossedLines();

    @Test
    public void test1() {
        System.out.println(uncrossedLines.maxUncrossedLines(new int[]{2,5,1,2,5}, new int[]{10,5,2,1,5,2}));
    }

}