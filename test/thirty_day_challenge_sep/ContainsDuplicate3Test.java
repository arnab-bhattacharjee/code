package thirty_day_challenge_sep;

import org.junit.Test;

import static org.junit.Assert.*;

public class ContainsDuplicate3Test {

    @Test
    public void test1() {
        ContainsDuplicate3 containsDuplicate = new ContainsDuplicate3();
        containsDuplicate.containsNearbyAlmostDuplicate(new int[]{-1,2147483647}, 1, 2147483647);
    }

}