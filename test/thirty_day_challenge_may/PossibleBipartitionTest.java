package thirty_day_challenge_may;

import org.junit.Test;

import static org.junit.Assert.*;

public class PossibleBipartitionTest {

    private PossibleBipartition possibleBipartition = new PossibleBipartition();

    @Test
    public void test1() {
        System.out.println(possibleBipartition.possibleBipartition(5, new int[][]{}));
    }

}