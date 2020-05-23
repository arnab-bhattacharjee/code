package thirty_day_challenge_may;

import org.junit.Test;

import static org.junit.Assert.*;

public class FrequencySortTest {

    private FrequencySort fSort = new FrequencySort();

    @Test
    public void test1() {
        System.out.println(fSort.frequencySort("Aabb"));
    }

}