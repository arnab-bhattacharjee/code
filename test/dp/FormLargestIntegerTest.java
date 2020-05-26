package dp;

import org.junit.Test;

import static org.junit.Assert.*;

public class FormLargestIntegerTest {

    private FormLargestInteger largestInteger = new FormLargestInteger();

    @Test
    public void test1() {
        System.out.println(largestInteger.largestNumber(new int[]{4,3,2,5,6,7,2,5,5}, 9));
    }

}