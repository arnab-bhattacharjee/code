package thirtydaychallengejuly;

import org.junit.Test;

import static org.junit.Assert.*;

public class AddBinaryTest {

    @Test
    public void test1() {
        AddBinary add  = new AddBinary();
        add.addBinary("1111100001010",
                "1100000000011111");
    }

}