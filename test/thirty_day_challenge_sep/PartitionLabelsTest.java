package thirty_day_challenge_sep;

import org.junit.Test;

import static org.junit.Assert.*;

public class PartitionLabelsTest {

    @Test
    public void test1() {
        PartitionLabels partitionLabels = new PartitionLabels();
        partitionLabels.partitionLabels("ababcbacadefegdehijhklij");
    }

}