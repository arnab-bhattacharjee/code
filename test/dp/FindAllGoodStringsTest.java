package dp;

import org.junit.Test;

import static org.junit.Assert.*;

public class FindAllGoodStringsTest {

    private FindAllGoodStrings findAllGoodStrings = new FindAllGoodStrings();

    @Test
    public void test1() {
        System.out.println(findAllGoodStrings.findGoodStrings(2, "az", "bb", "p"));
    }

}