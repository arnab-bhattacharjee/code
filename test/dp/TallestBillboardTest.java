package dp;

import org.junit.Test;

import static org.junit.Assert.*;

public class TallestBillboardTest {

    private TallestBillboard tallestBillboard = new TallestBillboard();

    @Test
    public void test1() {
        System.out.println(tallestBillboard.tallestBillboard(new int[]{1,2,3,6}));
    }

}