package thirtydaychallengejuly;

import org.junit.Test;

import static org.junit.Assert.*;

public class ArrangingCoinsTest {

    @Test
    public void test1() {
        ArrangingCoins coins = new ArrangingCoins();

        coins.arrangeCoins(2147483647);
    }

}