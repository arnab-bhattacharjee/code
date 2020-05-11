package dp;

import org.junit.Test;

import static org.junit.Assert.*;

public class SuperWashingMachinesTest {

    private SuperWashingMachines superWashingMachines = new SuperWashingMachines();

    @Test
    public void test1() {
        System.out.println(superWashingMachines.findMinMoves(new int[]{4,0,0,4}));
    }

}