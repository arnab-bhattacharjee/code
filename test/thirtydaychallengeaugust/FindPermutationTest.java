package thirtydaychallengeaugust;

import org.junit.Test;

import java.util.Arrays;

public class FindPermutationTest {

    @Test
    public void test1() {
        FindPermutation find = new FindPermutation();
        System.out.println(Arrays.toString(find.findPermutation("DDIIDI")));
    }

}