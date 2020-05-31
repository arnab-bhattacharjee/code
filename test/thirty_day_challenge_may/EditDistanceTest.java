package thirty_day_challenge_may;

import org.junit.Test;

import static org.junit.Assert.*;

public class EditDistanceTest {

    EditDistance editDistance = new EditDistance();

    @Test
    public void test1() {
        System.out.println(editDistance.minDistance("", "execution"));
    }

}