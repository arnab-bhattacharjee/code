package thirty_day_challenge;

import org.junit.Test;

import static org.junit.Assert.*;

public class LeftMostColWithOneTest {

    private LeftMostColWithOne leftMost = new LeftMostColWithOne();



    @Test
    public void test1() {
        leftMost.leftMostColumnWithOne(new BinaryMatrix());
    }

}