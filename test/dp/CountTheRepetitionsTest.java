package dp;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class CountTheRepetitionsTest {

    private CountTheRepetitions count = new CountTheRepetitions();

    @Test
    public void test1() {
        Assert.assertEquals(4,count.getMaxRepetitions("aaa", 8, "aaaaa", 1));
    }

}