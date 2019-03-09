package hashing;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class WindowStringTest {

    private WindowString ws = new WindowString();

    @Test
    public void test1() {
        Assert.assertEquals("BANC", ws.minWindow("ADOBECODEBANC", "ABC"));
    }


}