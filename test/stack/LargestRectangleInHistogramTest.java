package stack;

import org.junit.Test;

import static org.junit.Assert.*;

public class LargestRectangleInHistogramTest {

    @Test
    public void test1() {
        LargestRectangleInHistogram largest = new LargestRectangleInHistogram();
        largest.largestRectangleArea(new int[]{2,1,5,6,2,3});
    }

}