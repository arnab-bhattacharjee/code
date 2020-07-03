package thirtydaychallengejuly;

import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.*;

public class PrisonCellAfterNDaysTest {

    @Test
    public void test1() {
        PrisonCellAfterNDays nthDay = new PrisonCellAfterNDays();

        System.out.println(Arrays.toString(nthDay.prisonAfterNDays(new int[]{0,1,0,1,1,0,0,1}, 15)));
    }
}