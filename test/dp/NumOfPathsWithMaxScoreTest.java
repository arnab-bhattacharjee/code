package dp;

import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;

import static org.junit.Assert.*;

public class NumOfPathsWithMaxScoreTest {

    private NumOfPathsWithMaxScore max = new NumOfPathsWithMaxScore();

    @Test
    public void test1() {
        int[] a = max.pathsWithMaxScore(new ArrayList<>(Arrays.asList(new String[]{"E11","XXX","11S"})));
        Assert.assertEquals(a[0], 0);
        Assert.assertEquals(a[1], 0);
    }

}