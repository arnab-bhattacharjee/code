package dp;

import org.junit.Test;

import static org.junit.Assert.*;

public class BackspaceStringCompareTest {

    private BackspaceStringCompare compare = new BackspaceStringCompare();

    @Test
    public void test1() {
        System.out.println(compare.backspaceCompare("a#c", "b"));
    }

}