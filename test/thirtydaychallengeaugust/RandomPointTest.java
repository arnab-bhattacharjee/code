package thirtydaychallengeaugust;

import org.junit.Test;

import java.util.Arrays;

public class RandomPointTest {

    @Test
    public void test1() {
        RandomPoint point = new RandomPoint(new int[][]{{-2,-2,-1,-1}, {1,0,3,0}});

        System.out.println(Arrays.toString(point.pick()));
        System.out.println(Arrays.toString(point.pick()));
        System.out.println(Arrays.toString(point.pick()));
        System.out.println(Arrays.toString(point.pick()));
        System.out.println(Arrays.toString(point.pick()));

    }

}