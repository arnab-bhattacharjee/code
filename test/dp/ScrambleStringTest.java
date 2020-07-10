package dp;

import org.junit.Test;

public class ScrambleStringTest {

    @Test
    public void test1() {
        ScrambleString ss = new ScrambleString();
        System.out.println(ss.isScramble("great", "rgtae"));
    }

    @Test
    public void test2() {
        ScrambleString ss = new ScrambleString();
        System.out.println(ss.isScramble("abcde", "caebd"));
    }

}