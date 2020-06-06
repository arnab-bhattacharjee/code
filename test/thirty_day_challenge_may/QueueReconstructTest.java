package thirty_day_challenge_may;

import org.junit.Test;

import static org.junit.Assert.*;

public class QueueReconstructTest {

    private QueueReconstruct queueReconstruct = new QueueReconstruct();

    @Test
    public void test1() {
        queueReconstruct.reconstructQueue(new int[][]{{7,0}, {4,4}, {7,1}, {5,0}, {6,1}, {5,2}});
    }

}