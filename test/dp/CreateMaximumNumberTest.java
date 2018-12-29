package dp;

import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.*;

public class CreateMaximumNumberTest {

    private CreateMaximumNumber maxNum = new CreateMaximumNumber();

    @Test
    public void test1() {
        System.out.println(Arrays.toString(maxNum.maxNumber(new int[]{3,4,6,5}, new int[]{9,1,2,5,8,3}, 5)));
        //Assert.assertEquals(new int[]{9,8,6,5,3}, maxNum.maxNumber(new int[]{3,4,6,5}, new int[]{9,1,2,5,8,3}, 5));
    }

}