package dp;

import org.junit.Test;

import static org.junit.Assert.*;

public class MinCostToMergeStonesTest {

    private MinCostToMergeStones minCost = new MinCostToMergeStones();

    @Test
    public void test1() {
        System.out.println(minCost.mergeStones(new int[]{4,6,4,7,5}, 2));
    }

}