package dp;

import org.junit.Test;

import static org.junit.Assert.*;

public class RestoreTheArrayTest {

    private RestoreTheArray restoreTheArray = new RestoreTheArray();

    @Test
    public void test1() {
        System.out.println(restoreTheArray.numberOfArrays("90000021", 1000000));
    }

}