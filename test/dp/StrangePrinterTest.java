package dp;

import org.junit.Test;

import static org.junit.Assert.*;

public class StrangePrinterTest {

    private StrangePrinter strangePrinter = new StrangePrinter();

    @Test
    public void test1() {
        System.out.println(strangePrinter.strangePrinter("bacbcab"));
    }

}