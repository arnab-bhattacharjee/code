package thirty_day_challenge_june;

import org.junit.Test;

import static org.junit.Assert.*;

public class PermutationSequenceTest {

    @Test
    public void test1() {
        PermutationSeqUsingFactoradic seq = new PermutationSeqUsingFactoradic();
        System.out.println(seq.getPermutation(5, 120));
    }

}