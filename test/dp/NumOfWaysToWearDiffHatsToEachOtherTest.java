package dp;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.*;

public class NumOfWaysToWearDiffHatsToEachOtherTest {

    private NumOfWaysToWearDiffHatsToEachOther diffHats = new NumOfWaysToWearDiffHatsToEachOther();

    @Test
    public void test1() {
        List<List<Integer>> in = new ArrayList<>();
        in.add(new ArrayList<>(Arrays.asList(1,2,3)));
        in.add(new ArrayList<>(Arrays.asList(2,3,5,6)));
        in.add(new ArrayList<>(Arrays.asList(1,3,7,9)));
        in.add(new ArrayList<>(Arrays.asList(1,8,9)));
        in.add(new ArrayList<>(Arrays.asList(2,5,7)));
        System.out.println(diffHats.numberWays(in));
    }

}