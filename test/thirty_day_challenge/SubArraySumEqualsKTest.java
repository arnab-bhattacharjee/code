package thirty_day_challenge;

import org.junit.Test;

import static org.junit.Assert.*;

public class SubArraySumEqualsKTest {

    private SubArraySumEqualsK subArray = new SubArraySumEqualsK();

    @Test
    public void test1() {
        System.out.println(subArray.subarraySum(new int[]{1,-1,1,-1,1,-1},0));
    }

}