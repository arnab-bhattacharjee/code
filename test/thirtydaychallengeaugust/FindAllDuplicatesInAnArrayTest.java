package thirtydaychallengeaugust;

import org.junit.Test;

import static org.junit.Assert.*;

public class FindAllDuplicatesInAnArrayTest {

    @Test
    public void test1() {
        FindAllDuplicatesInAnArray find = new FindAllDuplicatesInAnArray();
        find.findDuplicates(new int[]{4,3,2,7,8,2,3,1});
    }

}