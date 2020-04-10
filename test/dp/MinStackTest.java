package dp;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class MinStackTest {

    private MinStack stack = new MinStack();

    @Test
    public void test1() {
        MinStack minStack = new MinStack();
        minStack.push(-2);
        minStack.push(0);
        minStack.push(-3);
        Assert.assertEquals(-3, minStack.getMin());   // Returns -3.
        minStack.pop();
        Assert.assertEquals(0, minStack.top());      // Returns 0.
        Assert.assertEquals(-2, minStack.getMin());   // Returns -2.
    }

}