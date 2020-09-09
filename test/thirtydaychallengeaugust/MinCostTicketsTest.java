package thirtydaychallengeaugust;

import org.junit.Test;

public class MinCostTicketsTest {

    @Test
    public void test1() {
        MinCostTickets minCost = new MinCostTickets();
        minCost.mincostTickets(new int[]{1,4,6,7,8,20}, new int[]{2,7,15});
    }
}