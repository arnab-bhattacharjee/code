package dp;

import org.junit.Test;

import static org.junit.Assert.*;

public class RemoveBoxesTest {

    private RemoveBoxes removeBoxes = new RemoveBoxes();

    @Test
    public void test1() {
        System.out.println(removeBoxes.removeBoxes(new int[]{8,6,2,6,6,3,2,3,2,2}));
    }

}