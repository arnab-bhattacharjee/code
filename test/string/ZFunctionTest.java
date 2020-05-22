package string;

import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.*;

public class ZFunctionTest {

    private ZFunction zFunction = new ZFunction();

    @Test
    public void test1() {
        System.out.println(Arrays.toString(zFunction.calculate("aaaabaa")));
    }

}