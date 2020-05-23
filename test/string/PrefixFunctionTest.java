package string;

import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.*;

public class PrefixFunctionTest {

    private PrefixFunction pf = new PrefixFunction();

    @Test
    public void test1() {
        System.out.println(Arrays.toString(pf.calculate("aabaaab")));
    }

}